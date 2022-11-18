package Programming_in_Java.Arrays;
import java.util.Scanner;
public class kadane_algo {
    public static int subarraysum(int arr[]){
        int csum = arr[0];
        int osum = arr[0];
        for(int i=1;i<arr.length;i++){
            if(csum>=0){
                csum += arr[i];
            }else{
                csum = arr[i];
            }
            if(csum>osum){
                osum = csum;
            }
        }
        return osum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum subarray sum is : "+subarraysum(arr));
    }
}
