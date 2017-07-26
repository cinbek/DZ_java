/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz_specialist_25072017;

/**
 *
 * @author KovalchukAV
 */
public class DZ_Specialist_25072017 {

    //печатаем сотрудников старше 40 лет
    public static void printAge(Manager mg[]){
        for (Manager m: mg){
            if (m.getAge()>40)
                printManager(m);
        }

    }

    public static void printManager(Manager pr){
        System.out.println("FIO " + pr.getFIO() + " Residential address " +
                pr.adress.getStreetName() + " house number  " + pr.adress.getHouseNumber()+
                " salary: " + pr.getSalary() + "$");
    }

    public static void main(String[] args) {
        //наши менеджеры
        Manager Andru = new Manager("Andru", "Kovalchuk", 41, new Adress("ul. Krasnogvard", 124), 3200);
        Manager Roman = new Manager("Roman", "Solomonov", 35, new Adress("pr. Kolomiceva", 54), 4231);
        Manager Sveta = new Manager("Sveta", "Gornostaeva", 25, new Adress("pl. Ulii Nagornoi", 7), 3214);
        //вывод на печать наших методов
//        printManager(Andru);
//        printManager(Roman);
//        printManager(Sveta);

        //создаем массив наших сотрудников
        Manager array[] = new Manager[3];
        array[0]=Andru;
        array[1]=Roman;
        array[2]=Sveta;
        //передаем наш массив методу выводящему на печать сотрудников старше 40 лет
        printAge(array);
    }
}
