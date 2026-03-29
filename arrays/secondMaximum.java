public class secondMaximum {
    public static void main(String[] args) {
        int[] arr={1,80,56,3,4,50};
        int max=arr[0];
        int secondmax=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]!=max && arr[i]>secondmax){
                secondmax=arr[i];

            }
        }
        System.out.println(secondmax);

    }
}
