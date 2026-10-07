import java.util.*;
public class SearchAGivenElementAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your element");
        int arr[]={23,45,67,45,98,65};
        
        int n=arr.length;
        int key = sc.nextInt();
        boolean found=false;

        for(int i=0; i<=n-1;i++){
            if(arr[i]==key){
                System.out.println("element are present in:"+(i+1));
                found=true;
                break;
            }
            }
            if(!found){
            System.out.println("elements not found");
            sc.close();
        }
    }
}
