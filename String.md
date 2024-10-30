# Strings

In Java, a string is a sequence of characters. It can include letters, numbers, symbols, and spaces. 

For example, "Hello, World!" is a string.

##  String Creation

Two Ways:

1) Using Literal String:

   Ex: String str = "Hello, Selenium!";

2) String Constructor Class:

   Ex1 : String str = new String("I'm Unstoppable");

   Ex2 : String greeting = new String("Hello, World!");

 ## String Methods:

 1) Concat(): Adds two string.
      
		Ex1: String s1 = "On the";
	  	String s2 = "Way";
		Note: Concatenation can performed in two ways.
        	a) s1.Concat(s2); // Returns "On theway"
      		b) s1+s2  // Returns "On theway"
    
    

 3) trim() : Removes space between right and left of the string.

    		Ex1 	String Str = "   Happy Diwali  ";
    			Str.trim(); // return "Happy Diwali"
    
    

5) charAt() : Returs a Chracter from a String based on specified Index number.

   		Ex1: 	String Str1 = "Hello";
                	In need o character : Str.charAt(4); // return o
   
   

7) contains() : Compares or check, if the string is part of main string or not.
   		Case sensitive.
   		Returns Boolean value.
   		
   		Ex 	String s1 = "On the Way"; String s2 = "Way";
   			s1.contains(s2);   // true
   
   

9) equals() and equalsIgnoreCase() :  For comparing two strings.
   					equals() is case sensitive.
   					equalsIgnoreCase is not case sensitive.

   		Ex : 	String s1 = "On the Way"; String s2 = "Way";
   			s1.equals(s2); // false
   
   

11) replace() : A single or multiple sequence of character can be replaced.
	       For single character use sinle quotes ''
               For Sequence of character or string use double quotes ""
   	       Case Sentive
   
               Ex : 	String s1 = "On the Way"
                    	s1.replace('W','B'); // return  "On the Bay"
                     	s1.replace("On", "All") // returns "All the Bay"
    
    

13) subString() : Extracts a string from main string by passing Start index and End index by adding +1 to the end index.

	       Ex: 	String str = "Selenium";
    			str.subString(3,8) // returns enium
    
    

15) toUpperCase() and toLowerCase() : Self explanation.

    		Ex:    	String str = "Appium";  str.toUpperCase(); // returns APPIUM
    			String Str1 = "WeBIO"; Str1.toLowerCase(); // returns webio
    
    

17) split() : Splits into multiple string based on specificed delimeter (Like @, #, . , !)

    		Ex    	String mail = bkhalid90712@gmail.com
    			mail.split("@"); //returns bkhalid and gmail.com as string of array like ["bkhalid", "gmail.com"]

       		
   

		




