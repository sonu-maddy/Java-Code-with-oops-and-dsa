package sonu.com.stringAndstringBuilderAndBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchStringLinearSearch {
    public static void main(String[] args)  throws IOException
    {
        // to accept the data from keyboard
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        // ask how many string
        System.out.println("how many string? ");
        int n = Integer.parseInt(br.readLine());

        // create a string type with size n
        String str[] = new String[n];


        // store string into str[]
        for (int i = 0; i < n; i++) {
            System.out.println("enter a string");
            str[i] = br.readLine();
        }

        //accept the string to search
        System.out.println("enter string to search");
        String search = br.readLine();

        // take a boolean var
        boolean found = false;

        //search for string in str[]
        for (int i = 0; i < str.length ; i++) {
            if (search.equalsIgnoreCase(str[i])) {
                System.out.println("found at position: "+ (i+1));
                found = true;

            }


        }
        if (!found) {
            System.out.println("not found");
        }



    }
}
