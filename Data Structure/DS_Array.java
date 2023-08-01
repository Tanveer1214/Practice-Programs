




























// insertion sort 
/*
import java.util.Arrays;

class TempJava {

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      array[j + 1] = key;
    }
  }

  public static void main(String args[]) {
    int[] data = { 9, 5, 1, 4, 3 };
    TempJava is = new TempJava();
    is.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
*/




























// Selection Sort
/*
class DS_Array {
	
	public static void Selection_Sort(int arr[]) {
		
		int size=arr.length;
		
		for(int i=0;i<size-1;i++) {
			
			int min_index=i;
			
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		
	}
	
	
	public static void main(String args[]) {
		int arr[]={4,2,6,1,3,10,7,9,8,5};
		Selection_Sort(arr);
		
	}
	
	
}
*/







// Bubble sort 
/*
class DS_Array {
	
	public static void Bubble_Sort(int arr[]) {
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
		
		for(int k=0;k<arr.length;k++) 
			System.out.print(arr[k]+" ");
		
	}
	
	
	public static void main(String args[]) {
			int arr[]={4,2,6,1,3,10,7,9,8,5};
			Bubble_Sort(arr);
	}
	
}
*/










// Deletation in unsorted Array
/*
class DS_Array {
	
	public static int delete_Element(int arr[],int n,int key) {
		if(n==0)
			return -1;
		
		for(int i=key;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		
		return n-1;
	}
	
	public static void main(String args[]) {
		int arr[]={3,4,1,6,7,2,5};
		int key=4; int n=arr.length; int temp=arr[key];
		System.out.println("Before Deletation");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n");
		n=delete_Element(arr,n,key);
		System.out.println("After Deletation");
		for(int j=0;j<n;j++)
			System.out.print(arr[j]+" ");
		
		System.out.println("\n\nDeleted Item Information:\nValue: "+temp+"\nIndex: "+key);
		 
	}
	
}
*/












// Insertion in unsorted Array
/*
class DS_Array {
	
	public static int Insertion(int arr[],int n,int cap,int key) {
		
		if(cap>=n)
			return -1;
			
		for(int i=cap;i>=0;i--) {
			
			if(arr[i]==39) {
				arr[i+1]=arr[i];
				arr[i]=key;
				break;
			}
			else {
				arr[i+1]=arr[i];
			}
			
		}
		
		return cap+1;
		
	}
	
	
	public static void main(String args[]) {
		int arr[]=new int[10];
		arr[0]=20;
		arr[1]=23;
		arr[2]=35;
		arr[3]=39;
		arr[4]=37;
		int key=69; int n=arr.length; int cap=5;
		
		cap=Insertion(arr,n,cap,key);
		for(int i=0;i<=cap;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	
	
}
*/