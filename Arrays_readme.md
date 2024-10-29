# Arrays 

An array is a collection of similar types of data. 

For example, if we want to store the names of 100 people then we can create an array of the string type that can store 100 names.

Ex : String names[ ] = new String[100];  (Array Declaration)

The above example can also be written as String [ ]names = new String[100];  (Array Declaration)

## Types Of Array:

1) Single Dimensional Array - Stores data in form of row or linear arrangement
2) Two/Multiple Dimensional Array - Stores data in form of rows and columns or tabular format





## Array Declaration

### Single Dimensional Array:

     Static  - Approach1:     int A[] = new int[5]

     Dynamic - Approach2 :     int B[] ={10,20,30,40,50}


### Two Dimensional Array:

    Static  - Approach1: int X[][] = new int[3][2]

    Dynamic - Approach2 : int Y[][] ={ {10,20},
                                        {30,40}, 
                                        {50,60} }


## Array Initialization
  
### Static Single Dimensional Array:

    A[0]=1;
    A[1]=2;
    A[2]=3;
    A[3]=4;
    A[4]=5;

     
### Static Two Dimensional Array:

     B[0][0] = 10;
     B[0][1] = 20;

     B[1][0] = 30;
     B[1][1] = 40;

     a[2][0] = 50;
     a[2][1] = 60;


     
## Finding Array Length/Size

  Every array in Java has a property called length, which holds the number of elements in that array.
  The length attribute is not a method (no parentheses are needed)

  Syntax : ArrayVariableName.length;

  Example : System.out.println("Length/Size of Array(A):"+A.length); // Output : 5;

  To find the length of a two-dimensional array in Java:
  1) Finding number of rows - Using length property of an array, find the length of the main array itself.
  2) Finding number of columns - find the length of each row to find the number of columns in that row using array length property

  Syntax : Count of row: ArrayVariableName.length;
           Count of Column: ArrayVariableName[0].length;

  Example : System.out.println("Number of rows: "+X.length);  // Output : 3
	    System.out.println("Number of Colums: "+X[0].length);  // Output : 2


 ## Reading/Accessing of Array Data Elements

 1) Accessing single data element using Array Indexing.
 3) Accessing all array elements - Using Normal forLoop.
 4) Accessing all array elements - Using Enhanced for-each Loop.
 5) Accessing all array data elements at once using Arrays.deepToString() method.


 Practical Examples Practised On Eclipse IDE:
 		1) Single Dimensional Array : 
	
 	package Arrays;

	import java.util.Arrays;

	public class Single_Dimensional_Array {
	
	public static void main(String[] args) {
		
	/**************1) Two different Approaches of Declaring an Array**************/
			
		//Static declaration - Preferred, if the size of array is known.
			
			int numbers[] = new int[3];  //Initialized in Line Number 25 to 27
				
				
		//Dynamic Declaration and Initialization - Used, if the size of the array is uncertain or unknown
			
			String Levels_Of_Testings[] = {"Unit","System","Integration","UserAcceptance"}; 
				
			
			
	/**************2) Initializing - Static Array Variable - declared above in Line number 13 **************/
			
			
				numbers[0]=10;
				numbers[1]=20;
				numbers[2]=30;
				

				
						
	/**************3) Finding Length of an Array Using Length Attribute**************/
				
		//Every array in Java has a property called length, which holds the number of elements in that array.
		//The length attribute is not a method (no parentheses are needed)
				
			System.out.println("Length/Size of Array(numbers):"+numbers.length);
				
				
				
				
	**************4) Reading/Accessing of Array Data Elements**************/
				
		//Accessing single data element using Array Indexing:
				 
			int LastElement = numbers[2]; // Can also be written as: int LastElement = numbers[numbers.length-1];
					
			System.out.println("Data Element at 2nd Index Position in an Array(numbers): "+LastElement);
				
				
				
		//Accessing all array elements - Using Normal forLoop: Array(numbers) is declared in Line number 13 and initialized in Line number 25 to 27
				
			System.out.println("Data Elements of Array(numbers) using for loop:");
				for(int i=0; i<numbers.length; i++) {
					System.out.println(numbers[i]);	
				}
				
				
				
		//Accessing all array elements - Using Enhanced for-each Loop: Array(numbers) is declared in Line number 13 and initialized in Line number 25 to 27
				
		//Additional Info - The enhanced for loop:
			/*Also known as the "for-each" loop, is a simplified way to iterate over arrays and collections in Java. 
			*It was introduced in Java 5 to make it easier to traverse through elements without using an explicit index.*/
					
					
				System.out.println("Data Elements of Array(numbers) using Enhanced loop:");
					for(int x:numbers) {
						System.out.println(x);
					}
					
					
				
		// Accessing all array data elements at once using Arrays.toString() method 
					
			/*In Java, if you want to print all the values of an array at once, 
			* you can use Arrays.toString() method from the java.util.Arrays class.
			* Syntax : Arrays.toString(ArrayVariableName) */
					
				System.out.println("Elements of Array(numbers) using Array method: "+Arrays.toString(numbers));
				System.out.println("Elements of Array(Levels_Of_Testings) using Array method: "+Arrays.toString(Levels_Of_Testings));
					
					
		//*Additional Info : Explanation - Arrays.toString(numbers)
			* Arrays is a class in the java.util package that provides various utility methods for working with arrays.  
			* toString(numbers) is a static method of the Arrays class that takes an array as an argument and returns a string 
                                             representation of that array.*/
					     
				
		}


}





	
  

  

   

