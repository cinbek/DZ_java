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




    public static void main(String[] args) {
        //наши менеджеры
        Manager Andru = new Manager("Andru", "Kovalchuk", 41, new Adress("ul. Krasnogvard", 124));
        Manager Roman = new Manager("Roman", "Solomonov", 35, new Adress("pr. Kolomiceva", 54));
        Manager Sveta = new Manager("Sveta", "Gornostaeva", 25, new Adress("pl. Ulii Nagornoi", 7));
        Person Petya = new Manager("Petya", "Ivanovich", 45, new Adress("ul. Lenina", 130));


        //инициализация зарплат
        Andru.setSalary(123.5);
        Roman.setSalary(86.8);
        Sveta.setSalary(59.5);

        //создаем массив наших сотрудников
        Manager array[] = new Manager[4];
        array[0]=Andru;
        array[1]=Roman;
        array[2]=Sveta;
        array[3]=(Manager)Petya;


        //печатаем суммарную сумму зарплат менеджеров
        System.out.println("Суммарная зарплата Менеджеров составляет: " +
                Manager.getTotalSalary(array));


        TopManager topM = new TopManager();
        topM.setManagers(array);
        Manager toArray[] = topM.getManagers();
    }
}
