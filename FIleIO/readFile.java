package FIleIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1319:04
 * @description
 **/
public class readFile {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:/Users/super/Desktop/test.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            String s;
            while((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
