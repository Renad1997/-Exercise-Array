import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*1.Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to 2
Test Data:
array = 50, -20, 0, 30, 40, 60, 10
Sample Output:
false*/
 ArrayList<Integer> first = new ArrayList<Integer>();
 first.add(50);
 first.add(-20);
 first.add(0);
 first.add(30);
 first.add(40);
 first.add(60);
 first.add(10);
 if(first.get(0) == first.get(first.size()-1)){
     System.out.println("true");
 }else{
     System.out.println("false");
 }
 /*2.Write a Java program to find the numbers greater than the average of the
numbers of a given array.
Original Array:
[1, 4, 17, 7, 25, 3, 100]
Expected Output:
The average of the said array is: 22.0 The numbers in the said array that are
greater than the average are: 25 100*/
  int[] nums ={1,4,17,7,25,3,100};
  double sum = 0;
  for(int i=0; i<nums.length; i++){
      sum += nums[i];
  }
   double Avg = sum/nums.length;
  System.out.println("The average of the said array is: "+Avg);
  System.out.println("The numbers in the said array that are greater than the average are:");
for(int i=0; i<nums.length; i++){
    if(nums[i] > Avg){
        System.out.println(nums[i]);
    }
}
/*3.Write a Java program to get the larger value between first and last
element of an array of integers.
Original Array:
[20, 30, 40]
Sample Output:
Larger value between first and last element: 40*/
int [] values ={20,30,40};
int max = values[0];
if(values[2] >= max){
    max=values[2];
}
System.out.println("Larger value between first and last element: "+ max);
/*4.Write a Java program to swap the first and last elements of an array and
create a new array.
Original Array:
[20, 30, 40]
Sample Output:
New array after swapping the first and last elements: [40, 30, 20]*/
 int [] number ={20,30,40};
 System.out.println("Original Array:" +Arrays.toString(number));
 int n = number[0];
 number[0] = number[number.length-1];
 number[number.length-1]=n;
 System.out.println("New array after swapping the first and last elements: "+Arrays.toString(number));
/*5. Write a program that places the odd elements of an array before the
even elements.
Original Array:
[2,3,40,1,5,9,4,10,7]
Sample Output:
[3,1,5,9,7,2,40,4,10]*/
  int [] original={2,3,40,1,5,9,4,10,7};
  int i=0;
  System.out.println("Original Array:"+Arrays.toString(original));
  while(i<original.length && original[i]%2==0){
    i++;
        }
        System.out.println(original[i]);

for(int j=i+1; j<original.length; j++){
    if(original[j]%2!=0){
        int temp = original[i];
        original[i]=original[j];
        original[j]=temp;
        i++;
    }
}
System.out.println("New Array:"+Arrays.toString(original));
/*6. Write a program that test the equality of two arrays.
[2,3,6,6,4] [2,3,6,6,4]
Sample Output:
true*/
int [] number1 = {2,3,6,6,4};
int [] number2 = {2,3,6,6,4};
boolean equalOrNot = true;
if(number1.length == number2.length){
    for (int z = 0; z <number1.length ; z++) {
    if(number1[z]!=number2[z]){
        equalOrNot = false;
    }
    }
}else{
    equalOrNot = false;   //if lengths !=
}
if(equalOrNot){
    System.out.println("Arrays are equal");
}else{
    System.out.println("Arrays are not equal");
}
}
}


