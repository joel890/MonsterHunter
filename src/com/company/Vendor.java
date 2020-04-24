package com.company;

import java.util.List;

abstract class Vendor extends Player{

    private List<String>weaponList;

    public List<String> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<String> weaponList) {
        this.weaponList = weaponList;
    }

    public void sell(){
        System.out.println("Selling item...");
    }
}
