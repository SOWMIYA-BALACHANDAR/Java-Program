import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.close();
        int b;
        b=N%2;
        if(N<0){
            System.out.println("invalid");
        }
        else if(b!=0)
        {
            System.out.println("Weird");
        }
        else{
            if(N>=2 & N<=5){
                System.out.println("Not Weird");
            }
            else if(N>=6 & N<=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
       

        scanner.close();
    }
}