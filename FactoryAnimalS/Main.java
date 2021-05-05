package FactoryAnimalS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FactoryAnimals factoryAnimals = new FactoryAnimals();
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(factoryAnimals.getAnimal(str).makeSound());
    }
}
