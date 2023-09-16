public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 6, 7, 5, 8, 3, 9, 3};
        int sum = 0;

        for (int number : numbers) {
            sum+= number;

        }

        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
