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
        //
        Person Andru = new Person("Andru", "Kovalchuk", 41);
        System.out.println("Andru= " + Andru.getFIO());
        //
        Manager Roma = new Manager("Roma", "Solomonov", 35);
        System.out.println("Roman Mananger " + Roma.getFIO());
    }
}
