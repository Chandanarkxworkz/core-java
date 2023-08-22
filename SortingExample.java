import java.util.Arrays;
class SortingExample {
    public static void main(String[] array) {
        int[] numbers = {5, 2, 8, 1, 3};

        // Sorting in ascending order
        Arrays.sort(numbers);
        System.out.println("Ascending order: " + Arrays.toString(numbers));

        // Sorting in descending order
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Descending order: " + Arrays.toString(numbers));
    }
}