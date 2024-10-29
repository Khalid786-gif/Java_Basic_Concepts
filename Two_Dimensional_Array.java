package Arrays;

import java.util.Arrays;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		
		/* 1) Declaring an Array
		 * 2) Initializing an Array
		 * 3) Finding length/size of an Array
		 * 4) Accessing elements of an Array - Single elements via Indexing
		 *                                   - All the elements using forloop and Enhanced for-Each loop.
		 *                                   - All data elements at once using Methods
		 * */
		
		
		/**************1) Two different Approaches of Declaring an Array**************/
			
			//Static declaration - Preferred, if the size of array is known.
		
				int Numbers[][] = new int[3][3]; 
				
			//Dynamic Declaration and Initialization - Used, if the size of the array is uncertain or unknown
				
				String[][] Series = { {"A","B","C"}, {"D","E","F"}, {"G","H","I"}, {"J","K","L"} };
				
				
				
		/**************2) Initializing - Static Array Variable - declared above in Line number 22 **************/
				
				Numbers[0][0]= 1;
				Numbers[0][1]= 2;
				Numbers[0][2]= 3;
				
				Numbers[1][0]= 4;
				Numbers[1][1]= 5;
				Numbers[1][2]= 6;
				
				Numbers[2][0]= 7;
				Numbers[2][1]= 8;
				Numbers[2][2]= 9;
				
				
				
		/**************3) Finding Length of an Array Using Length Attribute**************/
				
				/*Every array in Java has a property called length, which holds the number of elements in that array.
				 *The length attribute is not a method (no parentheses are needed)
				 *To find the length of a two-dimensional array in Java - Finding number of rows : Using length property of an array, find the length of the main array itself.
				 *                                                      - Finding number of columns : find the length of each row to find the number of columns in that row using array length property*/

				
				
				//Array Variable(Numbers) has been declared in Line 22 and Initialized in Line 32 through LIne 42.
				
				System.out.println("Number of rows: "+ Numbers.length);
				System.out.println("Number of Colums: "+ Numbers[0].length);
				
				
				
				
	   /**************4) Reading/Accessing of Array Data Elements**************/
				
				
				//Accessing single data element using Array Indexing:
				
					int LastRowFirstColumn = Numbers[2][0];
				
					System.out.println("Data Element at index [2][0] Position of Array(Numbers): "+LastRowFirstColumn);
					
					String LastRowLastColumn = Series[3][2];
					
					System.out.println("Data Element at index [3][2] Position of Array(Series): "+LastRowLastColumn);
					
					
			  //Accessing all array elements - Using Normal forLoop: Array(Numbers) is declared in Line number 22  and initialized in Line number 32 to 42.
					
					System.out.println("Data Elements of Two Dimension Array(Number) using for loop: ");
					for(int i=0;i<Numbers.length;i++) {
						for(int j=0;j<Numbers[i].length;j++) {
							System.out.print(Numbers[i][j]+" ");	
						}
						System.out.println();
					} 
					
					System.out.println("Data Elements of Two Dimension Array(Series) using for loop: ");
					for(int i=0;i<Series.length;i++) {
						for(int j=0;j<Series[i].length;j++) {
							System.out.print(Series[i][j]+" ");
						}
						System.out.println();
					}
					
					
			  //Accessing all array elements - Using Enhanced for-each Loop: Array(numbers) is declared in Line number 22 and initialized in Line number 32 to 42.
					
					
					System.out.println("Data Elements of Two Dimension Array(Number) using Enhanced Loop: ");
					for(int row[]:Numbers) {
						for(int x:row) {
							System.out.print(x+" ");
						}
						System.out.println();
						
					}
					
					
					
			// Accessing all array data elements at once using Arrays.deepToString() method 
					
					System.out.println("Data Elements of Two Dimension Array(Number) using Array inbuilt method");
					System.out.println(Arrays.deepToString(Numbers));

	
	}

}
