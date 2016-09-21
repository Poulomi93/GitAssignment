package edu.fsu.cs.cen5035;

public class Arrow extends BasicWeapon implements Weapon{
	public Arrow(){
		super(70);
	}
	
	@Override
    public int hit() {
        return DAMAGE;
    }
	@Override
    public int hit(int armor) {
		// ignores 5 points of armor 
        int damage = DAMAGE + 5 - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
