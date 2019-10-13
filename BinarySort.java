public class BinarySearch{	
	//arr is the given sorted array in which you need to find num
	public static int binarySearch(int[] arr, int num){
		int lb=0;
        int k=-1;
        
        int p;
        int ub=arr.length-1;
        while(lb<=ub){
            p=(lb+ub)/2;
            if(arr[p]<num){
                lb=p+1;
            }
            if(arr[p]>num){
                ub=p-1;
            }
            if(arr[p]==num){
                k=p;
                break;
            }
        }
        return k ;   
        
	}
    
}
