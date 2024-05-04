package sorting;

public class Selection_Sort {
public static void selectionSort(int[] data) {
	int smallest;
	for (int i = 0; i < data.length - 1; i++) {
		smallest = i;
		for (int j = i + 1; j < data.length; j++) {
			smallest = j;
			int temp = data[i];
			data[i] = data[smallest];
			data[smallest] = temp;
			
		}
	}
}
}
