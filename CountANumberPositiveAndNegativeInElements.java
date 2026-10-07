public class CountANumberPositiveAndNegativeInElements {
    public static void main(String[] args) {
        int arr[]={2,-4,4,-4,-5,7,9};
        int n = arr.length;
        int positive=0;
        int negative =0;

        for(int i=0; i<=n-1;i++){
            if(arr[i]>=0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("Positive Elements of Array:"+positive);
        System.out.println("Negative Elements of Array:"+negative);

    }
}
