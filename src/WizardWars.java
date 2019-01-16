import com.wizard.CharacterCreaton;

import java.util.Scanner;

public class WizardWars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wizard wizard = new Wizard();
        CharacterCreaton characterCreaton = new CharacterCreaton();
        System.out.println("Welcome to the Wizard Game");
        System.out.println("Please enter your first name.");


        do {
            String nameCheck = scanner.next();
            if (characterCreaton.validateName(nameCheck) == true) {
                wizard.setFirstName(nameCheck);
                break;
            } else {
                System.out.println("A name must have only letters and numbers. Please enter it again");

            }
        } while (true);

        System.out.println("Now, " + wizard.getFirstName() + ", please enter your last name");

        do {
            String nameCheck = scanner.nextLine();
            if (characterCreaton.validateName(nameCheck) == true) {
                wizard.setLastName(nameCheck);
                break;
            } else {
                System.out.println("A name can have only letters and numbers. Please enter it again");

            }
        } while (true);

        System.out.println("You're a wizard, " + wizard.getFullName());


    }
}