public class BubbleSort {	
	//arr is the input array you have to sort
	public static void bubbleSort(int[] arr){
		int l=arr.length;
        int t=0;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-i-1;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }    
        }
    }
}
