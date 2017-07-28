/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testio;

import java.io.*;

/**
 *
 * @author KovalchukAV
 */
public class IOUtil {

    //метод читает данные их файла и возвращает массив байт
    //fileName - имя файла
    //ByteArrayOutputStream
    public static byte[] readFile(String fileName) throws Exception {
        //создаем объект FileInputStream
        FileInputStream fi = new FileInputStream(fileName);
        //создаем объект ByteArrayOutputStream
        ByteArrayOutputStream bytArr = new ByteArrayOutputStream();

        try {
            int val;
            while ((val = fi.read()) != -1) {
                bytArr.write(val);
            }
        } finally {
            if (fi != null) {
                fi.close();
            }
        }
        return bytArr.toByteArray();
    }

    //метод записывает данные в файл
    //fileName - имя файла
    //FileOutputStream
    public static void writeFile(String fileName, byte[] buf) throws Exception {
        //создаем обект FileOutputStream
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(fileName);
            fos.write(buf);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    //метод читает данные из потока in
    //и записывает данные в out
    public static void writeTo(InputStream in, OutputStream out) {

        try{
            int i;
            while((i=in.read()) != -1){
                out.write(i);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
