package testio;
import java.io.*;

public class TestIO {

    public static void main(String[] args) {
        String str = "D:\\1\\1\\file.txt";
        String fileOut = "D:\\1\\1\\fileout.txt";
        String fileRead = "D:\\1\\1\\read.txt";
        String fileWrite = "D:\\1\\1\\write.txt";

        try {
            byte bt[] = IOUtil.readFile(str);
            IOUtil.writeFile(fileOut, bt);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        FileInputStream fileIn;
        FileOutputStream fileOu;
        try{
           fileIn = new FileInputStream(fileRead);
           fileOu = new FileOutputStream(fileWrite);
           IOUtil.writeTo(fileIn, fileOu);

        InputStream in = new FileInputStream(str);
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }

}
