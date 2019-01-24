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
            System.out.println("The spell" + nameOfSpell + "was successful. It cost " + damage + " damage.");
            return damage;


        }

        System.out.println("The spell " + nameOfSpell + " wasn't successful.");
        return 0;

    }


    public int castHealing(String nameOfSpell) {
        Spells spells = new Spells();
        // spellList.put("Vulnera Sanentur ", new Spell("Vulnera Sanentur ", 25, 10, 20, 70, 1));
        int totalHealing = 0;
        while (true) {
            if (getRandomNumberInRange(0, 100) <= spells.getSpellList().get(nameOfSpell).getSuccess()) {


                int min = spells.getSpellList().get(nameOfSpell).getMinSpellPower();
                int max = spells.getSpellList().get(nameOfSpell).getMaxSpellPower();
                int healing = getRandomNumberInRange(min, max);

                System.out.println("The spell" + nameOfSpell + "was successful. It gave " + healing + " health.");
                totalHealing = totalHealing + healing;
                int successRate = spells.getSpellList().get(nameOfSpell).getSuccess();
                int randomNumber = getRandomNumberInRange(5, 10);
                int newSuccessRate = successRate - randomNumber;
                spells.getSpellList().get(nameOfSpell).setSuccess(newSuccessRate);


            } else {

                System.out.println("The spell " + nameOfSpell + " wasn't successful. It gave you " + totalHealing + " health ");

                return totalHealing;
            }
        }


        //if 1st time unsuccessful -say it has failed
    }//if successful say healing this number. successrate will be smaller every time when it is succesfull 5-10


}







