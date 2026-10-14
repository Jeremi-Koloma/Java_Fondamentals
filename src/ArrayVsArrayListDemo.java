import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayListDemo {
    public static void main(String[] args) {

        /// 1. Difference in Accessing Elements

        // Input array
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        // Printing first element of array
        System.out.println(arr[0]);


        // ArrayList
        // Creating an arrayList with
        // initial capacity say bi it 2
        ArrayList<Integer> al = new ArrayList<Integer>(2);

        // Adding elements to ArrayList
        // using add() method
        al.add(1);
        al.add(2);

        // Printing alongside accessing
        // elements of ArrayList
        System.out.println(al.get(0));



        /// 2. Difference in Size and Flexibility

        // Normal Array
        // Need to specify the size for array
        int[] myArr = new int[3];
        myArr[0] = 1;
        myArr[1] = 2;
        myArr[2] = 3;

        // We cannot add more elements to array myArr[]

        // ArrayList
        // Need not to specify size

        // Declaring an Arraylist of Integer type
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        // Adding elements to ArrayList object
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        // We can add more elements to myArrayList

        // Print and display Arraylist elements
        System.out.println(myArrayList);

        // Print and display array elements
        System.out.println(Arrays.toString(myArr));


        /// 3. Difference in Data Type Support
        // allowed
        int[] array = new int[3];

        // allowed, however, need to be initialized
        int[] array1 = new int[3];

        // not allowed (Uncommenting below line causes
        // compiler error)
        // ArrayList<char> arrL = new ArrayList<char>();

        // Allowed
        ArrayList<Integer> arrL1 = new ArrayList<>();
        ArrayList<String> arrL2 = new ArrayList<>();
        ArrayList<Object> arrL3 = new ArrayList<>();

        System.out.println("Successfully compiled and executed");
    }
}
