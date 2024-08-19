package arrays;

public class Arrays2D {
    public static void main(String[] args) {

int[][]a ={{10,20,30},{40,50,60},{70,80,90}} ;
   /*     int[][] a = new int[3][3];
        a[0][0] = 10;
        a[0][1] = 11;
        a[0][2] = 12;
        a[1][0] = 13;
        a[1][1] = 14;
        a[1][2] = 15;
        a[2][0] = 16;
        a[2][1] = 17;
        a[2][2] = 18;  */
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++){
                System.out.print(a[i][j]+" ");
            }
        System.out.println();}
        }
    }
