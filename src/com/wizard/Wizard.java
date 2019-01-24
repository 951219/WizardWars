package com.wizard;

import java.util.ArrayList;
import java.util.List;

public class Wizard {
    private String firstName;
    private String lastName;
    private int health = 100;
    private int money = 100;

    private List<String> listOfBoughtSpells = new ArrayList<>();


    public List<String> getListOfBoughtSpells() {
        return listOfBoughtSpells;
    }

    public void setListOfBoughtSpells(List<String> listOfBoughtSpells) {
        this.listOfBoughtSpells = listOfBoughtSpells;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }









}


