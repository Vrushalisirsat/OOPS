// CONSTRUCTOR.
 
 
 
class  Student1 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

/*  Student1() {                                        // not-parameterized constructor.
        System.out.println("constructor called");
    }
*/
    Student1(String name,int age) {   //Parameterized constructor
        this.name=name;
        this.age=age;
    }

   
    Student1(Student s2) {              // copy constructor.
        this.name=s2.name;
        this.age=s2.age;
    }
    Student1() {

    }
}

  class Construtor {
    public static void main(String args[]) {
        Student s1 = new Student();                //object for parameterized constructor
        s1.name = "vrushali";
        s1.age = 19;
      
      
        Student1 s2 = new Student1(s1);              // //object for  not- parameterized constructor

        s1.printInfo();                        //print not-parameterized constructor.
        s2.printInfo();                              //print parameterized constructor.
    }
}