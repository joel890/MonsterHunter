package com.company;

abstract class Master extends Player {
    private String weaponName;

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void attack(){
        System.out.println("Attacking...");
    }
}
