/*Inheritance :- capability of one class to inherit properties from another class is called Inheritance.
      THERE ARE 5 TYPES OF INHERITANCE.
    1)Single Level Inheritance :- 1 Base class and 1 derived class.
    2)Multi-Level Inheritance  :-  2 derived class are inherit in 1 Base class.
    3)Hierarchical Inheritance :- multiple derived class inherit in 1 Base class.
    4)Hybrid Inheritance :- different - different types of inheritance seen/shown in 1  place.

*/

//Multi Level Inheritance


import bank;
class Shape {                                   //Parent class  or  Base class
        public void area() {
            System.out.println("display area");
        }

}  
   class Triangle extends Shape {                   //Sub-Class  or  child class
    public void area(int l , int h)  {
        System.out.println(1/2*l*h);
            
    }
}

class EquilateralTriangle extends Shape  {               //Sub-Class  or  child class
    public void area(int l , int h) {
    System.out.println(1/2*l*h);
}
}


public class Inheritance {
    public static void main(String args[]) {
            
      Triangle t1 = new Triangle();
     
          bank.Account account1 = new bank.Account();
          account1.name = "customer1";
    
    }
}