package nestedforloop;

import java.util.Scanner;

public class NeedOfMethod {
    public void addition( int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter no1");
        int no1 = sc.nextInt();
        System.out.println("plese enter no2");
        int no2 = sc.nextInt();
        NeedOfMethod newmethod= new  NeedOfMethod();
        newmethod.addition(no1,no2);
    }


}

