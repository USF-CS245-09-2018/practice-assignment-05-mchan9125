


public class QuickSort implements SortingAlgorithm {
	
	private int array[];
	
    public void sort(int[] arr) {
        this.array = arr;
        quickSort(0, arr.length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2]; //pivot is middle index number
        
        while(i <= j) { //dividing into two arrays
            
            while(array[i] < pivot) {
                i++;
            }
            while(array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                //moving indexes on both sides
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }
 

	private void swap( int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
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
