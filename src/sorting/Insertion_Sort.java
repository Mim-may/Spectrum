package sorting;

public class Insertion_Sort {
public static void insertionSort(int[] data) {
	int insert, moveItem;
	for (int i = 1; i < data.length; i++) {
		insert = data[i];
		moveItem = i;
		
		while (moveItem > 0 && data[moveItem - 1] > insert) {
			data[moveItem] = data[moveItem - 1];
			moveItem--;
		}
		data[moveItem] = insert;
	}
}
}
