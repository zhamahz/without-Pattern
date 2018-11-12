package com.company;

public class Main {

    public static void main(String[] args) {

        Cake cake1 = new CherryCake();
        System.out.println(cake1.getDescription());
        System.out.println("Cost: " + cake1.getCost()+"$");

        Cake cake2 = new ChocoCake();
        System.out.println(cake2.getDescription());
        System.out.println("Cost: " + cake2.getCost()+"$");

        Cake cake3 = new ChocoCakeWithBanana();
        System.out.println(cake3.getDescription());
        System.out.println("Cost: " + cake3.getCost()+"$");

        Cake cake4 = new CherryCakeWithCreamCherryBanana();
        System.out.println(cake4.getDescription());
        System.out.println("Cost: " + cake3.getCost()+"$");

        Cake cake5 = new IceCream();
        System.out.println(cake5.getDescription());
        System.out.println("Cost: " + cake5.getCost()+"$");

        Cake cake6 = new IceCreamWithBananaCherry();
        System.out.println(cake6.getDescription());
        System.out.println("Cost: " + cake6.getCost()+"$");
    }

}
