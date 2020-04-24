package com.company;

public class BladeMaster extends Master{

    @Override
    public String toString() {
        return String.format("My name is %s, I'm a %s and my blade is named %s", getName(), getGender(), getWeaponName());

    }
}
