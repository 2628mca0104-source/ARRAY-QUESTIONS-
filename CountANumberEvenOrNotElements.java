public class CountANumberEvenOrNotElements {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int even =0;
        int odd = 0;
        int n= arr.length;

        for(int i=0; i<=n-1; i++){
            if(arr[i] % 2== 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The Total Numbers of Even:"+ even);
         System.out.println("The Total Numbers of Odd:"+ odd);
    }
}
