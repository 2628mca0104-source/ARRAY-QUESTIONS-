public class MultiplicationOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50};

        int n=arr.length;
        int multiply=1;

        for(int i=0;i<=n-1;i++){
          int value = arr[i];
          multiply=multiply*value;  
        }
        System.out.println(multiply);
    }
}
