import java.util.*;

public class UserInputMultiplyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int arr[]= new int[5];
    int multiply=1;
    int n = arr.length;

    for(int i=0; i<=n-1; i++){
        System.out.println("Your Array Elements Are :");
        arr[i]=sc.nextInt();
    }

    for(int i=1;i<=n-1;i++){
        int value = arr[i];
        multiply= multiply*value;
    }
    System.out.println("Your Array Elements of multiply is:"+multiply);
    sc.close();
    }
    
}
