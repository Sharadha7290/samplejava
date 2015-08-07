package clonep1;

class Employee implements Cloneable {

    String n;
    int pay;

    public Employee(String name, int salary) {

  this.n = name;
    System.out.println("lll");
  this.pay = salary;
    }

    public Employee() {
    }

    public String getN() {

  return n;
    }

    public void setN(String name) {

  this.n = name;
    }

    public void setP(int pay) {

  this.pay = pay;
    }

    public int getP() {

  return this.pay;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

  try {


return super.clone();

  } catch (CloneNotSupportedException cnse) {


System.out.println("CloneNotSupportedException thrown " + cnse);


throw new CloneNotSupportedException();

  }
    }
}