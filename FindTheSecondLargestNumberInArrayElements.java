import java.util.*;
public class FindTheSecondLargestNumberInArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[4];
        int n = arr.length;

        for(int i=0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        int secondlargest=arr[0];

        for(int i=0;i<=n-1;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("The Second Largest Number Is :"+secondlargest);
  sc.close();
    }
}
