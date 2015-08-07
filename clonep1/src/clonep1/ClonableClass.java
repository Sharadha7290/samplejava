package clonep1;


public class ClonableClass {

    public static void main(String[] args) {

  try {


Employee e1 = new Employee("Dolly", 1000);


System.out.println(e1);


System.out.println("The employee's name is " + e1.getN());


System.out.println("The employees's pay is " + e1.getP());



Employee e1Clone = (Employee) e1.clone();


System.out.println(e1Clone);


System.out.println("The clone's name is " + e1Clone.getN());


System.out.println("The clones's pay is " + e1Clone.getP());


  } catch (CloneNotSupportedException cnse) {


System.out.println("Clone not supported");

  }
    }
}


