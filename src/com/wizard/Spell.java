package com.wizard;


public class Spell {
    private String name;
    private int price;
    private int minSpellPower;
    private int maxSpellPower;
    private int success;
    private int speed;

    public Spell(String name, int price, int minSpellPower, int maxSpellPower, int success, int speed) {
        this.name = name;
        this.price = price;
        this.minSpellPower = minSpellPower;
        this.maxSpellPower = maxSpellPower;
        this.success = success;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMinSpellPower() {
        return minSpellPower;
    }

    public void setMinSpellPower(int minSpellPower) {
        this.minSpellPower = minSpellPower;
    }

    public int getMaxSpellPower() {
        return maxSpellPower;
    }

    public void setMaxSpellPower(int maxSpellPower) {
        this.maxSpellPower = maxSpellPower;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
