import java.util.*;
public class PrintMaxValueOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]=new int[5];
        int n= arr.length;
        int max=arr[0];


        for (int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<=n-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            System.out.println(max);
        }
    sc.close();
}
}
