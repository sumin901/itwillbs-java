package programmers;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aArray = a.toCharArray();
        for(int i = 0 ; i < aArray.length; i++) {
            
            if(aArray[i] >= 97 && aArray[i] <= 122) {
                aArray[i] -= 32;
                System.out.print(aArray[i]);
            } else if (aArray[i] >= 65 && aArray[i] <= 90) {
                aArray[i] += 32;
                System.out.print(aArray[i]);
            } else {System.out.println(a);}
            
        }
    }
}