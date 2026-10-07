public class DisplayAllElementsAtLeastOnceArray {
    public static void main(String[] args) {
        int arr[]= {23,45,23,45,67,78,89,77};

        int n = arr.length;

        

        for(int i=0;i<=n-1;i++){
            int count=0;
           for(int j=0;j<=n-1;j++){
            if(arr[i]==arr[j]){
                count++;
            }
           }
           if(count==1){
            System.out.println(arr[i]);
           }
        }
        
    }
}
