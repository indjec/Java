package com.cs09;

public class EnchancedPlayer {
    private String name;
    private String weapon;
    private int hitPoints = 100;

    public EnchancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health >= 0 && health <= 100) {
            this.hitPoints = health;
        }
    }

    public void looseHealth(int damage){
        this.hitPoints -= damage;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out!! ");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
