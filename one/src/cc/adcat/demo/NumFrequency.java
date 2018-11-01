package cc.adcat.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumFrequency {

    public static void numFre(String str, char c){
        int count = 0;
        int temp;
        FileReader fr = null;
        try {
            fr = new FileReader(str);
            while ((temp = fr.read()) != -1){
                if (c == (char)temp)
                    count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
