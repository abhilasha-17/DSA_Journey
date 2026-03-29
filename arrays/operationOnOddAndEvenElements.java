public class operationOnOddAndEvenElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            if(i%2!=0){
                arr[i]=arr[i]*2;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
