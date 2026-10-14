import java.util.Arrays;

public class ReferenceTypeValueType {
    public static void main(String[] args) {
        int[] myIntArrays = new int[5];
        int[] anotherIntArrays = myIntArrays;

        System.out.println("myIntArrays Array: " + Arrays.toString(myIntArrays));
        System.out.println("anotherIntArrays Array: " + Arrays.toString(anotherIntArrays)+ "\n");

        anotherIntArrays[0] = 1;

        System.out.println("After change myIntArrays"+ Arrays.toString(myIntArrays));
        System.out.println("After change anotherIntArrays"+ Arrays.toString(myIntArrays));
    }
}
