
package dz_specialist_25072017;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    Adress adress;

//    Person(){}

    Person (String fn, String ln, int ag, Adress adr){
        //свойства
        firstName = fn;
        lastName = ln;
        age = ag;
        adress = adr;
    }

    Person (String fn, String ln, int ag){
        firstName = fn;
        lastName = ln;
        age = ag;
        adress = null;
    }

    Person (String fn, String ln){
        firstName = fn;
        lastName = ln;
        age = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }


    @Override
    public String toString(){
        return "STRING PERSON";
    }

    public String getFIO(){
        return getFirstName()+" "+getLastName();
    }

    //вывод на печать всех сотрудников
    public void print(Person pr){
        System.out.println(pr.getFIO() + " Проживающий по адресу " +
                pr.adress.getStreetName() + " номер дома  " + pr.adress.getHouseNumber());
    }
}
