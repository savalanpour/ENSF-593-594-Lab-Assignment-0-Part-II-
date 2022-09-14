package ca.uucalgary.ensf593;

public class Main {
    public static void main(String[] args) {
        System.out.println("First assignment");
        insertAt();
        swapArrays();
        allUnique();

    }

    /**
     * InsertAt which accepts the following 3 parameters: an
     * array of floats, a float value to be inserted, and an int which is the index where the
     * element is to be inserted in the array floats. This function then inserts the element at the
     * index it has received. The array in setup must be changed after calling the InsertAt
     * function.
     * Note: Your function InsertAt must check to make sure that the index provided is not
     * greater than the length of the array, and is not less than 0. If this is the case, the array
     * should not be changed, and an appropriate error message stating that the operation
     * couldn’t be done should be displayed to the console by this function.
     */
    public static void insertAt() {
        float[] input = {6.7f, 5.9f, 10, 23, 44, 4.6f, 9.1f, 100, 79};
        //implement your function at here;
    }

    /**
     * SwapArrays accepts the two arrays of floats and swaps their contents.
     * Note: Your function SwapArrays must check to make sure that both arrays have the
     * same length. If the lengths of the arrays are different, the two arrays should not be
     * changed, and an appropriate error message stating that the operation couldn’t be done
     * should be displayed to the console by this function.
     */

    public static void swapArrays() {
        float[] first_array = {6.7f, 5.9f, 10, 23, 44, 4.6f, 9.1f};
        float[] second_array = {11, 12, 13, 14, 15, 16, 17};

        //implement your function at here;

        //print both arrays here
    }

    /**
     * Write a function called allUnique that will take an array of integers as input and returns
     * true if all elements in the array are unique (i.e. no number appears twice). The function
     * should return false otherwise.
     * You can define the following array in your main function to send to this method and to
     * testt (i.e. Declare an array inside your program and initialize it to the above values):
     * 3 5 4 20 10
     * The above sample array is an example of an array which contains all unique elements.
     * You should test your program with an array that is unique like above and one that isn’t.
     */
    public static void allUnique() {

    }
}