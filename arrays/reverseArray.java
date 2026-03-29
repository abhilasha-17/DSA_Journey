public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp;
        int max=arr.length-1;
        int min=0;
        while(max>min){
            temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
            max--;
            min++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}
