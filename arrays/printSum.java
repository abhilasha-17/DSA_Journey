import java.util.*;
public class printSum {
    public static void main(String[] args) {
        int sum=0;

        // input for length
        System.out.println("enter no. of elements you want to input:\n");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];

        // array initialize
        for(int i=0;i<arr.length;i++){
            int num =sc.nextInt();
            arr[i]=num;
        }
        
        //array print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        // array sum print
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            sum= sum+num;
        }

        System.out.println(sum);
    }
    
}
