package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] numbers = new String[5];
numbers[0] = "1";
numbers[1] = "2";
numbers[2] = "3";
numbers[3] = "4";
numbers[4] = "5";
        // 2. print the third element in the array
System.out.println(numbers[3]);
        // 3. set the third element to a different value
numbers[3]= "Hello" ;
        // 4. print the third element again
System.out.println(numbers[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
Random ran = new Random();
for (int i=0;i<numbers.length;i++) {
	 

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
System.out.println(numbers[i] = "hi"+i);  
}
        // 7. make an array of 50 integers
int[] ages = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,45,46,47,48,49};
        // 8. use a for loop to make every value of the integer array a random
        //    number
for (int i = 0; i < ages.length; i++) {
ages[i]=ran.nextInt(50);
}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
int smallest = 50;
int largest = -1;
for (int i = 0; i < ages.length; i++) {
if (ages[i] < smallest) {
smallest = ages[i];
}
System.out.println(smallest);
if (smallest == 0) {
break;
}}
        // 10 print the entire array to see if step 8 was correct
for (int i = 0; i < ages.length; i++) {
System.out.println(ages[i]);	
	}
        // 11. print the largest number in the array.
for (int i = 0; i < ages.length; i++) {
if (ages[i] > smallest) {
smallest = ages[i];
}
System.out.println(smallest);
if (smallest == 50) {
break;
}}
        // 12. print only the last element in the array
System.out.println(ages[ages.length-1]);
    }
}
