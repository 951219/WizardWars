import com.wizard.CharacterCreaton;
import com.wizard.Wizard;

import java.util.Scanner;

public class WizardWars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wizard player = new Wizard();

        CharacterCreaton characterCreaton = new CharacterCreaton();
        System.out.println("Welcome to the WizardWars");
        System.out.println("Please enter your first name.");


        while(player.getFirstName()==null || player.getFirstName().isEmpty()) {
            System.out.println("Please enter your characters first name");
            String incomingFirstName = scanner.nextLine();
            if(characterCreaton.validateFirstName(incomingFirstName)){
                player.setFirstName(incomingFirstName);
            }
        }

        while(player.getLastName()==null || player.getLastName().isEmpty()) {
            System.out.println("Please enter your characters last name");
            String incomingLastName = scanner.nextLine();
            if(characterCreaton.validateLastName(incomingLastName)){
                player.setLastName(incomingLastName);
            }
        }

        System.out.println("So " + player.getFirstName() + " " + player.getLastName() +  ", are you ready to die?");


    }
}