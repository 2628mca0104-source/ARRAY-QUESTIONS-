import java.util.*;
public class FindSecondSmallestArrayInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[4];

        int n = arr.length;

        for(int i=0; i<=n-1;i++){
           arr[i]=sc.nextInt();
        }

        int smallest = arr[0];
        int secondsmallest = arr[0];

        for(int i=0; i<=n-1;i++){
            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondsmallest && arr[i]!=smallest){
                secondsmallest=arr[i];
            }
        }
        System.out.println("The Second Smallest Number is :"+secondsmallest);
        sc.close();
    }
}
