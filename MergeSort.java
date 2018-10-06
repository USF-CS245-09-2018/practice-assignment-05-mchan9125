

public class MergeSort implements SortingAlgorithm {
	
	 private int[] arr;
	 private int[] target;
	   
	
	
	public void sort(int arr[]) {
		 this.arr = arr;
	     this.target = new int[arr.length];
		mergeSort( 0 , arr.length-1);
	}
	  
    private void mergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
           
            mergeSort(lowerIndex, middle);
            
            mergeSort(middle + 1, higherIndex);
  
            merge(lowerIndex, middle, higherIndex); //merge
        }
    }
	 
	    private void merge(int low, int mid, int high) {
	 
	        for (int i = low; i <= high; i++) {
	        	target[i] = arr[i];
	        }
	        int i = low;
	        int j = mid + 1;
	        int k = low;
	        while (i <= mid && j <= high) {
	            if (target[i] <= target[j]) {
	                arr[k] = target[i];
	                i++;
	            } 
	            else {
	                arr[k] = target[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= mid) {
	            arr[k] = target[i];
	            k++;
	            i++;
	        }
	 
	    }
	

	
	public static void main(String args[]) {
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 3;
		array[2] = 4;
		array[3] = 2;
		array[4] = 5;
		
		MergeSort ms = new MergeSort();
		ms.sort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}
		
}