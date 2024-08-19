package arrays;

public class AssendingDessendingArrays {
    public static void main(String[] args) {
        int a[] ={30,99,44,60,80,70,20,10,50};
        int temp=0;
//        for(int i =0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[j]<a[i]){
//                    temp=a[i];                          // assending order
//                    a[i]=a[j];
//                    a[j]=temp;
//
//
//                }
//            }System.out.println(a[i]);

       for(int i=0;i<a.length;i++){            //descending order
           for(int j=i+1;j<a.length;j++){
               if(a[i]<a[j]){
                   temp = a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
           System.out.print(a[i]+ " ");

        }

    }




}

