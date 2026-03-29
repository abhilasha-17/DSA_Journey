import java.util.*;
public class initialize{
    public static void main(String args[]){

        //initialize
        int[] arr= {1,2,3,4,5};
        int[] arr2=new int[5];

        //updating element
        arr[3]=8;

        // printing the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            
        }
        System.out.println();

        //----------------------------------------------------//
        // initilize and print array2
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr2[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]);
        }
        System.out.println();
        
        //-----------------------------------------------------//


    }
}