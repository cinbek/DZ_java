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

    public static void printManager(Manager pr){
        System.out.println("FIO " + pr.getFIO() + " Residential address " +
                pr.adress.getStreetName() + " house number  " + pr.adress.getHouseNumber()+
                " salary: " + pr.getSalary() + "$");
    }

    public static void main(String[] args) {
        //создаем адреса проживания
        Adress adAndru = new Adress("ul. Krasnogvard", 124);
        Adress adRoman = new Adress("pr. Kolomiceva", 54);
        Adress adSveta = new Adress("pl. Ulii Nagornoi", 7);
        //наши менеджеры
        Manager Andru = new Manager("Andru", "Kovalchuk", 41, adAndru, 3200);
        Manager Roman = new Manager("Roman", "Solomonov", 35, adRoman, 4231);
        Manager Sveta = new Manager("Sveta", "Gornostaeva", 27, adSveta, 3214);
        //вывод на печать
        printManager(Andru);
        printManager(Roman);
        printManager(Sveta);
    }
}
