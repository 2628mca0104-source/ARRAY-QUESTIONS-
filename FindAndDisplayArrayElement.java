public class FindAndDisplayArrayElement {
    public static void main(String[] args) {
        int arr[]= {12,34,23,34,45,34,56,66,66,45};

        int n= arr.length;

        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
