
public class Main {
    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(400, 40, "Flight");
        heroes[1] = new Hero(275, 25);
        heroes[2] = new Hero(180, 9, "Invisibility");
        return heroes;
    }
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setProtectionType("Armor");
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss protection type: " + boss.getProtectionType());
        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero " + (i + 1) + " health: " + heroes[i].getHealth());
            System.out.println("Hero " + (i + 1) + " damage: " + heroes[i].getDamage());
            System.out.println("Hero " + (i + 1) + " superpower: " + heroes[i].getSuperpower());
        }
    }
}