package ooplab8;

public class PetApp {
    private static  void  main (String[]args){
        Dog dog = new Dog(name: "Chayen", age:2);
        System.out.println(dog.toString());
        dog.makeNoise();
    }
}