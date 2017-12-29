package com.cs09;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0)
            System.out.println(this.name + " knocked out!!");

    }

    public int healthRemaining(){
        return this.health;
    }
}