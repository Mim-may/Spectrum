package sorting;

public class Quick_Sort {
public static void swap(int[] data, int first, int last) {
	int temp = data[first];
	data[first] = data[last];
	data[last] = temp;
	
}
public static int partition(int[] data, int first, int last) {
	int pivot, i , smallIndex;
	swap(data,first,(first + last)/ 2);
	pivot = data[first];
	smallIndex = first;
	
	for (i = first + 1; i <= last; i++)
		if (data[i] < pivot)
		{
			smallIndex++;
			swap(data,smallIndex,i);
		}
	swap(data,first,smallIndex);
	return smallIndex;
}
public static void quickSort(int[] data, int first, int last) {
	int pivotLoc;
	if (first < last) {
		pivotLoc = partition(data,first,last);
		quickSort(data, first, pivotLoc);
		quickSort(data, pivotLoc + 1, last);
	}
}
public static void main(String[] args) {
	int[] a = {32,55,87,13,78,96,52,48,22,11,58,66,88,45};
	quickSort(a, 0, 13);
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
		
	}
}
}
