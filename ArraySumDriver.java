
public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13; //0
		myArray[index++] = 5;  //1
		myArray[index++] = 12; //2
		myArray[index++] = 6;  //3
		
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum); // This will give 36
		
		myArray[index++] = 7; //4
		myArray[index++] = 1; //5
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum); // This will give 44
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static int sumOfArray(Integer[] arr, int num) {
	     if (num < 0) {
            return 0;
        }
		else 
		{
			return arr[num] + sumOfArray(arr, num - 1);
		}
		
	}

}