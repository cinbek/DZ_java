/*
 * Реализовать метод который в качестве парметра получает два
 * массива строк и разделить (String)
 * Метод должен вернуть строку
 */
package twoarraystringdeliemeter;

/**
 *
 * @author KovalchukAV
 */
public class TwoArrayStringDeliemeter {

    public static String createReport(String[] keys, String values[], String delim){
            StringBuilder sb = new StringBuilder();
            int count = keys.length;
            for (int i=0; i < count; i++){
                sb.append(keys[i]).append(delim).append(values[i]).append("\n");
            }


    return sb.toString();
    }

    public static void main(String[] args) {
        String keys[] = {"First Name", "Last Name"};
        String values[] = {"Sergey", "Ivanov"};
        String delim = ":";

        System.out.println(createReport(keys, values, delim));
    }

}
