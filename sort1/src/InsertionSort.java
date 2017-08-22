import java.util.Scanner;
public class InsertionSort{  
    public static void insertion_Sort(int arr[]) {  
        int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            int k= arr[j];  
            int i=j-1;  
            while ((i>-1)&&(arr[i]>k)){  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = k;  
        }  
    }       
    public static void main(String a[]){   
    	Scanner scan = new Scanner(System.in);
    	System.out.println("ENTER SIZE OF ARRAY : ");
    	int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("ENTER VALUES FOR ARRAY : ");
        for(int i=0;i<n;i++){
        	int Arr=scan.nextInt();
        	array[i] = Arr;
        }
        System.out.println("BEFORE SORTING : ");    
        for(int i:array){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
        insertion_Sort(array);    
        System.out.println("AFTER SORTING : ");    
        for(int i:array){    
            System.out.print(i+" ");    
        }    
    }    
}  