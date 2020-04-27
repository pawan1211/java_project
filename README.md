# java_project

Assignment 1: 

Create Employee1 class with member’s empNo, eName, salary, departmentName, location. 
Use single dimensional array of employee objects of size 10, to read 10 employees data from console. 
After reading to read these records from the array and display them in sorted order by salary. 


Assignment 2: 

Create a class Employee with data member’s empno, ename, and salary, deptartmentName. 
Write a member function SalIncrease with a parameter ‘Percentage’ of type int. 
If Percentage is greater than 100% throw an exception SalOverflow. Design SalOverflow exception class with a data member Msg of type
String. Inside SalIncrease function provide try catch block for handling the exception SalOverflow. 
The code inside SalIncrease should create SalOverflow object and update the error message and throw the exception SalOverflow. 
The catch block inside SalIncrease should accept the parameter of type SalOverflow. 
Inside catch block print the error message stored in Msg member of SalOverflow to the console.


Assignment 3:

Design a Song interface having Play function, and Duration function. 
Duration function returns duration of song in seconds. Design classes Jazz, Rock, Ghazal classes which 
implement Song interface. Design Playlist class, which maintain a list of songs.
Write a program to create a playlist for user. Accept name of playlist, few song details from user. 
For each song, accept name, duration from user. At the end play the whole playlist with all details 
of the song and duration in mm:ss format.  Hint: To play a song, you may choose to make beep sound, or simply display
the song details on screen. 



Assignment 4

Define a class named Payment that contains a member variable of type double that stores the amount of the payment 
and appropriate accessor and mutator methods. Also create a method named paymentDetails that outputs an English sentence 
to describe the amount of the payment. Next, define a class named CashPayment that is derived from Payment. 
This class should redefine the paymentDetails method to indicate that the payment is in cash. 
Include appropriate constructor(s). Define a class named CreditCardPayment that is derived from Payment. 
This class should contain member variables for the name on the card, expiration date, and credit card number. 
Include appropriate constructor(s). Finally, redefine the paymentDetails method to include all credit card information 
in the printout. Create a main method that creates at least two CashPayment and two CreditCardPayment objects with different 
values and calls paymentDetails for each. 
 
Assignment 5

As a Data Analyst, you are required to analyze Order transactions. Before starting the analysis, 
data needs to be cleaned up.  Write a program to perform the following cleanup: 
a. Convert the order amount to display values in Rs.      
Hint: -> extract the character in amount column           
-> Get corresponding value from hash map and multiply to get value in Rs.              
Eg. 2.34M => 2.34 * 1000000 = 2340000 
c. Find the total Order Amount 
 
 Output required: Total Order Amount in Rs for all orders. 
 
The function prototype should be as below –      int TotalAmount(ArrayList<String>); 
 

 Java Programming Essentials –L1-Assignment 4 
 
Use the following Hashmap for lookup of conversion value:   M -> 1000000   K  -> 1000   H  -> 100  
 
Test Cases –

 Input:
"1001;Online;Target Corp;234K", "1002;Store;Advantec Corp;1.3M", "1003;Online;Marvel Brothers;2.1M", "1004;Store;Chandran Enterprises;211H", "1005;Store;Santoor Pharma;11K"
 Expected Output :3666100 
 
 Input:
 "1006;Online;Target Corp;164H", "1007;Store;Advantec Corp;1.8K", "1008;Online;Marvel Brothers;207H", "1009;Store;Chandran Enterprises;2.1M", "1010;Store;Santoor Pharma;55K" 
  Expected Output 2193900 
   






 
