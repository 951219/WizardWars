package com.wizard;

public class Opponent extends Wizard {
    public Opponent(int health, int money) {
    }

    SpellUtilities spellUtilities = new SpellUtilities();
    private String flame = "Lacarnum Inflamarae";
    private String lightening = "Lumos Solem";
    private String wind = "Everte Statum";
    private String fireball = "Arania Exumai";
    private String death = "Avada Kedavra";
    private String healing = "Vulnera Sanentur";

    public String decideSpellName(Wizard opponent, Wizard player) {


        if (opponent.getHealth() < 45) {
            int randomDecision = spellUtilities.getRandomNumberInRange(1, 2);

            if (randomDecision == 1) {
                return healing;

            } else {
                if (player.getHealth() < 11) {
                    return flame;
                } else if (player.getHealth() < 17) {
                    return lightening;
                } else if (player.getHealth() < 23) {
                    return wind;
                } else if (player.getHealth() < 30) {
                    return fireball;
                } else if (player.getHealth() < 65) {
                    return death;
                } else {
                    return healing;
                }
            }
        }
        else if (opponent.getHealth() > player.getHealth()) {
            int randomDecision = spellUtilities.getRandomNumberInRange(1, 4);
            if (randomDecision == 1) {
                return lightening;
            } else if (randomDecision == 2) {
                return fireball;
            } else if (randomDecision == 3) {
                return wind;
            } else {
                return flame;
            }
        }
        else {
            int randomDecision = spellUtilities.getRandomNumberInRange(1, 100);

            if (randomDecision <= 20) {
                return lightening;
            } else if (randomDecision <= 35) {
                return fireball;
            } else if (randomDecision <= 55) {
                return wind;
            } else if (randomDecision <= 80) {
                return flame;
            } else {
                return healing;
            }
        }
    }
}