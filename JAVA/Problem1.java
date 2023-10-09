import java.util.Random;

public class Problem1{
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(myArray);

        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    public static void shuffleArray(int[] arr) {
        Random random = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}