
package dz_specialist_25072017;

public class Manager extends Person{
    //зарплата
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Manager(String fn, String ln, int ag, Adress adr, double salary) {
        super(fn, ln, ag, adr);
        this.salary=salary;
    }
}
