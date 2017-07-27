package dz_27_07_2017;

import dz_27_07_2017.Manager;

public class TopManager extends Manager{
    public Manager TopManager[];
    private double bonus;

    TopManager(String fn, String ln){
        super(fn, ln);
    }
    //

    @Override
    public double  getSalary(){
        return super.getSalary() + getBonus();
    }
    //
    public double getBonus(){
        return bonus;
    }
    //
    public void setManagers(Manager[] newarr){
        this.TopManager = newarr;
    }
    //
    public Manager[] getManagers(){
        return TopManager;
    }
}
