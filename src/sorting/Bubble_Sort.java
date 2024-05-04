package sorting;

public class Bubble_Sort {
public static void bubbleSort(int[] data) {
	int temp;
	for (int i = 1; i < data.length; i++) {
		for (int j = 0; j < data.length - i; j++) {
			if (data[j] > data[j + 1]) {
				temp = data[j];
				data[j] = data[j + 1];
				data[j + 1] = temp;
			}
		}
		
	}
}
}
