import java.util.*;
public class AverageOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[4];
        int n = arr.length;
        int sum=0;
        double averrage;

        for(int i=0; i<=n-1;i++){
            System.out.println("enter your elemets");
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<=n-1;i++){
            int value= arr[i];
            sum = sum +value;
        }

        averrage = (double)sum/4;
        System.out.println("The average of Students is:"+ averrage);
        sc.close();
    }
    
}
