import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println("First Array: " + Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println("First Array sorted: " + Arrays.toString(firstArray));

        String[] sArray = {"Moise", "Aly", "Jeanne", "Mike", "Abel", "Charly", "Pauline"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Charly") >= 0) {
            System.out.println("Found Charly in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Same Array");
        }else  {
            System.out.println("Different Arrays");
        }
    }

    public static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newInt = new int[length];
        for (int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
