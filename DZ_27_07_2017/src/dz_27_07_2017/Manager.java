
package dz_27_07_2017;

import dz_27_07_2017.Adress;
import dz_27_07_2017.Person;

public class Manager extends Person{
    //зарплата
    private double salary;
    //
    public Manager(String fn, String ln){
        super(fn, ln);
    }

    public Manager(String fn, String ln, int ag, Adress adr) {
        super(fn, ln, ag, adr);
    }
    //
    public static double getTotalSalary(Manager[] array){
        double getTotalSalary=0;
        //
        for (Manager m: array) {
            getTotalSalary += m.getSalary();
        }
        return getTotalSalary;
    }
    //
    public double getSalary() {
        return salary;
    }
    //
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //


}
