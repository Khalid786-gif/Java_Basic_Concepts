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




	
  

  

   

