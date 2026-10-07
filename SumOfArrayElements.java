public class SumOfArrayElements {
    public static void main(String[] args) {
        int arr[]={12,34,56,45};
        int n=arr.length;
        int sum=0;

        for(int i=0;i<=n-1;i++){
            int value=arr[i];
            sum=sum+value;
        }
        System.out.println("The Total Sum Of Elements :" +sum);
    }
}
