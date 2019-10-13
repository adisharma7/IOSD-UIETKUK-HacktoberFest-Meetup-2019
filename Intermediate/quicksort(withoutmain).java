public class Solution {
	
	public static void quickSort(int[] input) {
    
    quicksort2(input,0,input.length-1);
    
    }
    
    static void quicksort2(int arr[], int start, int end) 
    { 
        if (start < end) 
        {
        
           
            int pivoit = partition(arr, start, end); 

            quicksort2(arr, start, pivoit-1); 
            quicksort2(arr, pivoit+1, end); 
        }
     }
    
       static  int partition(int arr[], int start, int end) 
    { 
        int pivot = arr[end];  
        int i = (start-1);
             int temp=0;
        for (int j=start; j<end; j++) 
        { 
            
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                
                 temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        
         temp = arr[i+1]; 
        arr[i+1] = arr[end]; 
        arr[end] = temp; 
  
        return i+1; 
    } 
}
