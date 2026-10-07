import java.util.*;
public class PrintMinValueOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]= new int[4];
        int n = arr.length;
        int min=arr[0];

        for(int i=0; i<=n-1;i++){
            System.out.println("enter your element");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<=n-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }  
        }
        System.out.println(min);
        sc.close();
    }
}
