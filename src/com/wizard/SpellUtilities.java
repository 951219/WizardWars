package com.wizard;

import java.util.Random;


public class SpellUtilities {

    public int getRandomNumberInRange(int min, int max) {

        Random random = new Random();

        int randomNumber = random.nextInt(max + 1 - min) + min;

        return randomNumber;


    }

    public int castDamage(String nameOfSpell) {
        Spells spells = new Spells();

        if (getRandomNumberInRange(0, 100) <= spells.getSpellList().get(nameOfSpell).getSuccess()) {


            int min = spells.getSpellList().get(nameOfSpell).getMinSpellPower();
            int max = spells.getSpellList().get(nameOfSpell).getMaxSpellPower();
            int damage = getRandomNumberInRange(min, max);

            damage = damage * -1;
            System.out.println("The spell " + nameOfSpell + " was successful. It cost " + damage + " damage.");
            return damage;


        }

        System.out.println("The spell " + nameOfSpell + " wasn't successful.");
        return 0;

    }


    public int castHealing(String nameOfSpell) {
        Spells spells = new Spells();
        int totalHealing = 0;
        int successRate = spells.getSpellList().get(nameOfSpell).getSuccess();
        int min = spells.getSpellList().get(nameOfSpell).getMinSpellPower();
        int max = spells.getSpellList().get(nameOfSpell).getMaxSpellPower();
        int randomSuccessRate = getRandomNumberInRange(1, 100);

        if (randomSuccessRate <= successRate) {
            System.out.println("The spell was successful.");
            while (true) {
                if (randomSuccessRate <= successRate) {
                    int healing = getRandomNumberInRange(min, max);
                    System.out.println("The spell gave " + healing + " health.");
                    totalHealing = totalHealing + healing;

                    randomSuccessRate = getRandomNumberInRange(1, 100);

                    int randomNumber = getRandomNumberInRange(5, 10);
                    successRate = successRate - randomNumber;


                } else {

                    System.out.println("The spell " + nameOfSpell + " wasn't successful.");
                    System.out.println("it gave " + totalHealing + " health.");
                    return totalHealing;
                }
            }
        } else {
            System.out.println("The spell " + nameOfSpell + "wasn't successful");
        }
        return totalHealing;
    }


    public int cast(String nameOfSpell) {
        Spells spells = new Spells();

        if ((nameOfSpell.equals(null) || nameOfSpell.equals(""))) {

            System.out.println("There is no spell");
            return 0;
        }
        else if (spells.getSpellList().containsKey(nameOfSpell)) {
            if (nameOfSpell.equals("Vulnera Sanentur")) {
                return castHealing(nameOfSpell);
            } else {
                return castDamage(nameOfSpell);
            }
        }
        else {

            System.out.println("you panicked and mispelled the spell");
            return 0;

        }
    }
}


//opponent class

