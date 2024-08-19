package nestedforloop;

import java.util.Scanner;

public class breakcaseloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter the day");
        String day = sc.next();
        switch (day){
            case "monday":
                System.out.println("monday in meeting" );
                break;
            case "tuesday":
                System.out.println("visiting client");
                break;
            case "wednesday":
                System.out.println("office party" );
                break;
            case "thursday":
                System.out.println("visiting clint no.2");
                break;
            case "friday":
                System.out.println("on vacation" );
                break;
            case "saturday":
                System.out.println("trip");
                break;
            case "sunday":
                System.out.println("week off");
                break;
            default:
                System.out.println("plese select proper day" );



        }




    }
}
