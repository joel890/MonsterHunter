package com.company;

public class BladeVendor extends Vendor implements ItemBought{
    @Override
    public String toString() {
        return String.format("My name is %s, I'm a %s and these are my items %s", getName(), getGender(), getWeaponList());
    }

    @Override
    public void setItemBought() {
        System.out.println("Sold");
    }
}
