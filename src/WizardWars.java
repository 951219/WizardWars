import com.wizard.*;

/*
Wizard Wars main continue to write...

Wizardshop operation... Buying of the spell if you are done write done...
then print out the information of the spells he knows..

Duel   operation... it will do duel... In this duel you have to check the spell if you know
then the opponent spell must be decided...
*/

import java.util.Scanner;

public class WizardWars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wizard player = new Wizard();
        WizardShop wizardShop = new WizardShop();
        WizardWars wizardWars = new WizardWars();
        Opponent opponent = new Opponent(100, 100);


        CharacterCreaton characterCreaton = new CharacterCreaton();
        System.out.println("Welcome to the WizardWars");


        while (player.getFirstName() == null || player.getFirstName().isEmpty()) {
            System.out.println("Please enter your characters first name");
            String incomingFirstName = scanner.nextLine();
            if (characterCreaton.validateFirstName(incomingFirstName)) {
                player.setFirstName(incomingFirstName);
            }
        }

        while (player.getLastName() == null || player.getLastName().isEmpty()) {
            System.out.println("Please enter your characters last name");
            String incomingLastName = scanner.nextLine();
            if (characterCreaton.validateLastName(incomingLastName)) {
                player.setLastName(incomingLastName);
            }
        }

        System.out.println("So " + player.getFirstName() + " " + player.getLastName() + ", are you ready to die? but before there's something you got to do.");

        wizardShop.playerBuyFromWizardShop(player);

        System.out.println("Brace yourself, the duel begins");

        wizardWars.duelOperation(player, opponent);


    }


    public void duelOperation(Wizard player, Opponent opponent) {
        SpellUtilities spellUtilities = new SpellUtilities();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int whoseTurn = spellUtilities.getRandomNumberInRange(1, 2);


            if (player.getHealth() <= 0) {
                System.out.println("You lost");
                break;
            } else if (opponent.getHealth() <= 0) {
                System.out.println("You won");
                break;
            } else {

                if (whoseTurn == 1) {
                    String opponentDecicion = opponent.decideSpellName(opponent, player);
                    System.out.println("Opponent was faster and he chose " + opponentDecicion);

                    if (opponentDecicion.equals("Vulnera Sanentur")) {
                        int returnedHealing = spellUtilities.castHealing("Vulnera Sanentur");
                        if (returnedHealing != 0) {
                            opponent.setHealth(opponent.getHealth() + returnedHealing);
                            if (opponent.getHealth()>100){
                                opponent.setHealth(100);
                            }
                        }
                    } else {
                        player.setHealth(player.getHealth() + spellUtilities.castDamage(opponentDecicion));

                    }


                } else {
                    System.out.print("What is your decision?");
                    System.out.println(" Your health: " + player.getHealth() + " Opponent health: " + opponent.getHealth());
                    String userDecision = scanner.nextLine();
                    int returnedHealthInfo = spellUtilities.cast(userDecision);
                    if (userDecision.equals("Vulnera Sanentur") && returnedHealthInfo!=0){
                        player.setHealth(player.getHealth() + returnedHealthInfo);
                        if (player.getHealth()>100){
                            player.setHealth(100);
                        }
                    }else{
                        opponent.setHealth(opponent.getHealth()+returnedHealthInfo);
                    }
                }


            }


        }


    }
}