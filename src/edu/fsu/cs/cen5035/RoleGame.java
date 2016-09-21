package edu.fsu.cs.cen5035;

public class RoleGame {
	public static void main(String[] args) {
		int armor = 20;
		
		Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //TODO: Add the remaining weapons here
        //Axe
        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Axe has " + axe.hit() + " of damage.");
        System.out.println("Axes was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //Arrow
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        System.out.println("Arrows was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //MagicStaff
        Weapon magicstaff = WeaponFactory.getWeapon("magicstaff");
        System.out.println("MagicStaff has " + magicstaff.hit() + " of damage.");
        System.out.println("MagicStaff was able to do " + magicstaff.hit(armor) + " of damage due to an armor with "+armor+ " points.");

    }
}