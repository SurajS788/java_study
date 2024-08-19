package nestedforloop;

import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "MARKS OBTAIN IN SUBJET 1");
        int a = sc.nextInt();
        System.out.println( "MARKS OBTAIN IN SUBJET 2");
        int b = sc.nextInt();
        System.out.println( "MARKS OBTAIN IN SUBJET 3");
        int c = sc.nextInt();
        System.out.println( "MARKS OBTAIN IN SUBJET 4");
        int d = sc.nextInt();
        System.out.println( "MARKS OBTAIN IN SUBJET 5");
        int e = sc.nextInt();
        int f=(a+b+c+d+e);
        System.out.println(f);
       int g =f/500;
int k=100;
        System.out.println(g*k); System.out.println("TOTAL PERCENTAGE" );
}


}



