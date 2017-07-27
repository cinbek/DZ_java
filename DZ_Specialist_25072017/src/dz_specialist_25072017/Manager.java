
package dz_specialist_25072017;

public class Manager extends Person{
    //зарплата
    private double salary;
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
    public Manager(String fn, String ln, int ag, Adress adr) {
        super(fn, ln, ag, adr);
    }

}
