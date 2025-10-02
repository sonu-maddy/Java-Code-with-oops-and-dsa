package sonu.com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("abc.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("IOExceptions caugth" + e.getMessage());
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            }catch (IOException e){
                System.out.println("Error Closing Reader" + e.getMessage());
            }
        }
    }
}
