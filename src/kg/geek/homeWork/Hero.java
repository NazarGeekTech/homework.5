package kg.geek.homeWork;

public class Hero {
    private int health;
    private int Damage;
    private String superAbility;



    public Hero (int health, int damage,String superAbility) {
        this.health = health;
        this.Damage = damage;
        this.superAbility = superAbility;
    }

    public Hero (int health, int damage) {
        this.health = health;
        this.Damage = damage;
    }


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
