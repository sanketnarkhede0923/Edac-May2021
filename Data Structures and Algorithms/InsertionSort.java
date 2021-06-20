package ADS;

public class InsertionSort {

	void sort(int arr[]){
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	
	void display(int arr[]){
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	
	public static void main(String args[]){
		int arr[] = { 14,45,23,11,8,76 };

		InsertionSort i1 = new InsertionSort();
		i1.sort(arr);

		i1.display(arr);
	}

}
