package FactoryAnimalS;

public class FactoryAnimals {
    public Animal getAnimal(String str){
        if (str.equals("cat")){
            return new Cat();
        }else
            return new Dog();
    }
}
