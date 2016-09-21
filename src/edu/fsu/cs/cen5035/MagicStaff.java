package edu.fsu.cs.cen5035;

public class MagicStaff extends BasicWeapon implements Weapon{
	public MagicStaff(){
		super(80);
	}
	
	@Override
    public int hit() {
        return DAMAGE;
    }
	@Override
    public int hit(int armor) {
		//ignores 20% of armor
        double damage = DAMAGE  - (0.8*armor);
        if (damage < 0) {
            return 0;
        }
        return (int)damage;
    }
}
