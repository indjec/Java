package com.cs09;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaning health of the player : " + player.healthRemaining());
//
//        damage = 11;
//        player.looseHealth(damage);
//        System.out.println("Remaning health of the player : " + player.healthRemaining());

        EnchancedPlayer enchancedPlayer = new EnchancedPlayer("Kent", "Sword", 50);
        System.out.println("Initial health of the player is : " + enchancedPlayer.getHealth());
    }
}
