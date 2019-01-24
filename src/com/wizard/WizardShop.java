package com.wizard;


import java.util.Map;

public class WizardShop {


    Spells spells = new Spells();


    public void printAllSpells() {

        for (Map.Entry<String, Spell> entry : spells.getSpellList().entrySet()) {
            System.out.println(entry.getValue().getName() + " : " + entry.getValue().getPrice());
        }

    }




    public void buySpell(String requestedSpell, Wizard wizard) {

        if (!spells.getSpellList().containsKey(requestedSpell)) {
            System.out.println("There is no such a spell");

        } else if (wizard.getListOfBoughtSpells().contains(requestedSpell)) {
            System.out.println("You already know this spell");

        } else if (wizard.getMoney() >= spells.getSpellList().get(requestedSpell).getPrice()) {

            wizard.setMoney(wizard.getMoney() - spells.getSpellList().get(requestedSpell).getPrice());

            wizard.getListOfBoughtSpells().add(requestedSpell);

            System.out.println("You have bought" + requestedSpell);
        } else {
            System.out.println("You don't have enough money.");
        }


    }
}
