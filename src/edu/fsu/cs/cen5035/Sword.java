package edu.fsu.cs.cen5035;

public class Sword extends BasicWeapon implements Weapon {

    public Sword() {
        super(50);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}