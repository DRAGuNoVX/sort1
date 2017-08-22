
import java.util.Scanner;
public class BubbleSort {
    static void bubSort(int array[]) {  
        int n = array.length;
        int temp = 0;  
         for(int j=0;j<n;j++){  
                for(int i=1;i<(n-j);i++){  
                          if(array[i-1]>array[i]){   
                                 temp = array[i-1];  
                                 array[i-1] = array[i];  
                                 array[i] = temp;  
   }}}}  
    public static void main(String[] args) {  
    			Scanner scan = new Scanner(System.in);
                System.out.print("ENTER SIZE OF ARRAY : ");
                int n = scan.nextInt();
                int array[]=new int[n];
                System.out.println("ENTER VALUES FOR ARRAY : ");
                for(int i=0;i<n;i++){
                	int arr=scan.nextInt();
                	array[i] = arr;
                }
                System.out.println("BEFORE BUBBLE SORT : ");  
                for(int i=0; i < array.length; i++){  
                        System.out.print(array[i] + " ");  
                }
                System.out.println();
                bubSort(array);
                System.out.println("AFTER BUBBLE SORT : ");  
                for(int i=0; i < array.length; i++){  
                        System.out.print(array[i] + " ");  
   }}} 