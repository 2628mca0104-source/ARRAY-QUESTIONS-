import java.util.*;
public class InputUserPrintArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        int n= arr.length;

        for(int i=0;i<=n-1;i++){
            System.out.println("ENTER YOU ELEMENT");
            arr[i]=sc.nextInt();
        }

        for(int val: arr){
            System.out.println(val);
        }
        sc.close();
    }
}
