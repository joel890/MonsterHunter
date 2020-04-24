package com.company;

public class GunMaster extends Master{
    @Override
    public String toString() {
        return String.format("My name is %s, I'm a %s and my gun is named %s", getName(), getGender(), getWeaponName());
    }
}
