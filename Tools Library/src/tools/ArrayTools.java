package tools;

public abstract class ArrayTools {
	/**
	  * Prints the specified array to the console.
	  * @param array The array to print.
	  */
	 public static <T> void printArray(T[] array) {
		 System.out.print("[" + array[0]);
		 for (int i = 1; i < array.length; i++) {
			 System.out.print(", " + array[i].toString());
		 }
		 System.out.println("]");
	 }
	 
	 public static void main(String[] args) {
		 Object[] objects = {
				 new Object(),
				 new Object(),
				 new Object(),
				 new Object(),
				 new Object()
		 };
		 
		 printArray(subArray(objects, 1, 3));
	 }
	 
	 @SuppressWarnings("unchecked")
	 public static <T> T[] subArray(T[] array, int beginIndex, int endIndex) {
		 Object[] newArray = new Object[endIndex - beginIndex];
		 int index = 0;
		 
		 for (int i = beginIndex; i <= endIndex; i++) {
			 newArray[index] = array[i];
			 index++;
		 }
		 
		 return (T[]) newArray;
	 }
}
