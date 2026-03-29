public class search {
    public static void main(String[] args) {
        int num=56;
        int arr[]={1,2,56,3,4,5};
        searching(arr,num);
    }

    public static void searching(int a[],int num){
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                System.out.println("found at position: "+i);
                break;
            }
        }

    }
}
