import java.util.*;

public class BasicAlgorithms {
    //Print 1-255
     public static void main(String[] args) {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    //Print odd numbers between 1-255
    public static void main(String[] args) {
        for (int i = 1; i < 256; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    //Print Sum
    //Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far.
    public static void main(String[] args) {
        int sum = 0;        //first we must have a way to store the sum from the previous numbers
        for (int i = 0; i < 256; i++) {
            System.out.print("New number: " + i);       //String "New number:" with the current number i
            System.out.println(" Sum: " + (sum += i));  //String "Sum" with the original stored sum plus our current number i

        }
    }

    //Iterating through an array with sorting.
    //Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
    public static void main(String[] args) {
        int[] myArray = {1,5,3,13,9,7};
        Arrays.sort(myArray);
        for (int arr: myArray) {
            System.out.println(arr);
        }
    }

    //Find Max
    //Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public static void main(String[] args) {
        Integer[] num = {-3, -5, -7, 0};
        int max = Collections.max(Arrays.asList(num));
        int min = Collections.min(Arrays.asList(num));
        System.out.println("Maximum number of array is: " + max);
        System.out.println("Minimum number of array is: " + min);
    }

    // Method for getting the maximum value
    //public static int getMax(int[] inputArray){ 
    //int maxValue = inputArray[0]; 
    //for(int i=1;i < inputArray.length;i++){ 
    //  if(inputArray[i] > maxValue){ 
    //     maxValue = inputArray[i]; 
    //  } 
    //} 
    //return maxValue; 
    //}

  // Method for getting the minimum value
  //public static int getMin(int[] inputArray){ 
  //  int minValue = inputArray[0]; 
  //  for(int i=1;i<inputArray.length;i++){ 
  //   if(inputArray[i] < minValue){ 
  //      minValue = inputArray[i]; 
  //    } 
  //  } 
  //  return minValue; 
  //} 

  //Find Max (primitive method)
  //public static void main(String[] arr) {
  // int[] myArray = new int[]{-3, -5, -7, 0, 1};
  //int max = Integer.MIN_VALUE;
  // for (int i = 0; i < myArray.length; i++){
  //     if (myArray[i] > max){
  //         max = myArray[i];
  //     }
  // }
  // System.out.println("Maximum number of array is: " + max);
  //}


    //Get Average
    //Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public static void main(String[] args) {
        int[] myArray = {2, 10, 3, 4};      //create an array of integers
        int sum = 0;           //in order to find the average we must divide the sum of all numbers by the number of ints in our array so the sum must be stored in a variable
        double avg = 0;         //here we set our average variable as a double
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];      //loop through to get the sum of our array
        }
        System.out.println("The average is: " + (double)sum / myArray.length);  //here we print the average by casting our sum into a double then dividing it by the length of our array.
    }

    //Array with Odd Numbers
    //Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();     //create an ArrayList of Integers called myArray
        for (int i = 1; i < 256; i++){      //use our for loop to count up to 255
            if (i % 2 == 1){                //if statement to check if the number is odd
                myArray.add(i);             //if this is true add it to myArray
            }
        }
        System.out.println(myArray);        //print our final results within myArray
    }

    //Greater Than Y
    //Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 4, 2};     //create an array of numbers
        int y = 3;              //y is our test number to see if the number is greater than
        int count = 0;          //we need to create a count variable so we can count how many numbers are greater than y
        for (int i = 0; i < myArray.length; i++){       //loop through our array starting with 0
            if (myArray[i] > y){            //if statement to see if current number is greater than y
                count ++;                   //be sure to increase the count if true
            }
        }
        System.out.println(count);          //print our final count of greater than y values
    }

    //Square the values
    //Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public static void main(String[] args) {
        int[] myArray = {1, 5, 10, -2};
        int[] newArr = new int[myArray.length];
        int square;
        for (int i = 0; i < myArray.length; i++) {
            square = myArray[i] * myArray[i];
            newArr[i] = square;
        }
        System.out.print(Arrays.toString(newArr));
    }

    //Eliminate Negative Numbers
    //Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
    static void noNegs (int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + ",");
        }
    }
    public static void main(String[] args){
        noNegs(new int[] {1, 5, 10, -2});
    }

    //Max, Min, and Average
    //Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public static void main(String[] args) {
        int[] myArray = {1, 5, 10, -2};
        int max = myArray[0];
        int min = myArray[0];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
            if (myArray[i] < min){
                min = myArray[i];
            }
            sum += myArray[i];
        }

        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
        System.out.println("The average is: " + (double)sum / myArray.length);
    }

    //Shifting the Values in the Array
    //Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    static int[] get() {
        return new int[]{1, 5, 10, 7, -2};
    }

    public static void main(String[] args) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int[] arr = get();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                newArray.add(0);
            } else {
                newArray.add(arr[i + 1]);
            }
        }
        System.out.print(newArray + ",");
    }
}
