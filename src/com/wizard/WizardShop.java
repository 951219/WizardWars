package com.wizard;


import java.util.Map;
import java.util.Scanner;

public class WizardShop {


    Spells spells = new Spells();


    public void printAllSpells() {

        for (Map.Entry<String, Spell> entry : spells.getSpellList().entrySet()) {
            System.out.println(entry.getValue().getName() + " : " + entry.getValue().getPrice());
        }

    }




    public void buySpell(String requestedSpell, Wizard player) {

        if (!spells.getSpellList().containsKey(requestedSpell)) {
            System.out.println("There is no such a spell");

        } else if (player.getListOfBoughtSpells().contains(requestedSpell)) {
            System.out.println("You already know this spell");

        } else if (player.getMoney() >= spells.getSpellList().get(requestedSpell).getPrice()) {

            player.setMoney(player.getMoney() - spells.getSpellList().get(requestedSpell).getPrice());

            player.getListOfBoughtSpells().add(requestedSpell);

            System.out.println("You have bought " + requestedSpell);
            System.out.println("Remaining balance: " + player.getMoney());
        } else {
            System.out.println("You don't have enough money.");
        }


    }




    public void playerBuyFromWizardShop(Wizard player) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("This is the shop for wizards.");
            System.out.println("What do you want to do? 'done' = exit shop,");
            System.out.println("Your options are: ");
            printAllSpells();
        while (true){
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("done")){
                System.out.println("You know the following spells: ");
                System.out.println(player.getListOfBoughtSpells().toString());
                break;
            }else buySpell(userInput, player);

        }


    }
}
