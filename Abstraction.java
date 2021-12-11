abstract class Animal {
    abstract void walk();                   //abstract function/method
    Animal()  {                  //construtor
        System.out.println("You Are creating a new Animal");
    }
   public void eat() {
       System.out.println("Animal eats");
   }
    }

class Horse extends Animal {
    Horse()  {                     //construtor
        System.out.println("creating a horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs"); 
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs"); 
    }
} 



class Abstraction {
    public static void main(String args[]) {
    Horse horse = new Horse();
    horse.walk();

    Chicken chicken = new Chicken();
    chicken.walk();

    horse.eat();
    }
}