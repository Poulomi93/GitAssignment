package edu.fsu.cs.cen5035;

public class Axe extends BasicWeapon implements Weapon {
	public Axe(){
		super(60);
	}
	
	@Override
    public int hit() {
        return DAMAGE;
    }
	@Override
    public int hit(int armor) {
		int damage;
		//If armor is greater than 0 and less than 20, ignore armor points
    	if (armor > 0 && armor < 20) {
    		damage = DAMAGE;
    	}
    	else {
    		damage = DAMAGE - armor;
    	}
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
