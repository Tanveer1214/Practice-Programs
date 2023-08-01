public class Sortings {

	public static void main(String[] args) {
		int arr[] = {31,45,11,89,55,19,21,8,40};
		
	}
	
	/*
    // Selection Sort
    public static int[] SelectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int t = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[t]) {
                    t = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[t];
            arr[t] = temp;
        }
        return arr;
    }
    */
	
	
	/*
	// Insertion Sort
	public static int[] insertionSot(int[] arr) {
		int j = 0; 	
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			for(j=i-1;j>=0 && temp < arr[j];j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		return arr;
	}
	*/

}
