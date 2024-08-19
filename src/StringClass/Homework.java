package StringClass;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int a =sc.nextInt();
        int r=0 ;
        while (a>0){
            r=a%10;
            System.out.print(r);
            a=a/10;

        }
    }
}
