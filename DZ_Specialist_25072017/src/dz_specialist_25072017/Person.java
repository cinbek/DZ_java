
package dz_specialist_25072017;

public class Person {
    private String firstName, lastName;
    private int age;

    Person (String fn, String ln, int ag){
        firstName = fn;
        lastName = ln;
        age = ag;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "STRING PERSON";
    }

    public String getFIO(){
        return getFirstName()+" "+getLastName()+" : "+getAge()+ " age";
    }
}
