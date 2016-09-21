package edu.fsu.cs.cen5035;

public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "axe":
            	return new Axe();
            case "arrow":
                return new Arrow();
            case "magicstaff":
            	return new MagicStaff();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}