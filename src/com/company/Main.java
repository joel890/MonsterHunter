package com.company;

public class Main {

    public static void main(String[] args) {
	    BladeMaster player1 = new BladeMaster();
	    player1.setName("Joël");
	    player1.setGender("Male");
	    player1.setWeaponName("Valomyr");
        System.out.println(player1.toString());
    }
}
