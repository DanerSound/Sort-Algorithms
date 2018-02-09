package base;

public class InsertionSort extends SorterAlgorithm {

	/**
	 * Returns an ordered array of integer elements
	 * 
	 * @param arrayToBeOrdered messy array
	 * @return array ordered
	 */
	@Override
	public Integer[] sorting(Integer[] arrayToBeOrdered) {
		for (int i = 1; i < arrayToBeOrdered.length; i++) {
			int max = arrayToBeOrdered[i];
			int j = i;
			while (j - 1 >= 0 && arrayToBeOrdered[j - 1] > max) {
				arrayToBeOrdered[j] = arrayToBeOrdered[j - 1];
				j = j - 1;
			}
			arrayToBeOrdered[j] = max;
		}
		return arrayToBeOrdered;
	}
}
