package com.company;

import kg.geek.homeWork.Boss;
import kg.geek.homeWork.Hero;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(250, 50, "supersonic shock");


        System.out.println("About Boss " + boss.getHealth() + " "
                + " Boss defence Type " + boss.getTypeOfDefence()
                + "Boss damage " + boss.getBossDamage());

        Hero[] heroes = creatHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("здоровье " +  heroes[i].getHealth());
            System.out.println("урон" + heroes[i].getDamage());
            System.out.println("супер способность" + heroes[i].getSuperAbility());

        }


    }

    public static Hero[] creatHeroes() {
        Hero titan = new Hero(260, 55);
        Hero iron  = new Hero(400, 50, "hunter on long range");
        Hero hulk = new Hero(350, 60);
        Hero[] heroes = {titan, iron, hulk };
        return heroes;
    }


}

