package arrays;

public class PracticeQuestionArray {
    public static void main(String[] args) {
        int a[] ={30,99,44,60,80,70,20,10,50};
  /*      int max =a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>max) {
                max = a[i];


            }
        }
        System.out.println("Maximum Number in array is");
        System.out.println(max);  */
        int min =a[0];
       for (int j=1;j<a.length;j++){
           if(a[j]<min){
               min=a[j];
           }
       }
        System.out.println("Minimum Number in Array is");
        System.out.println(min);
    }
    }
