public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"apple", "banana", "orange"};
        boolean[] flags = {true, false, true};
        double[] values = {1.5, 2.7, 3.9};
        char[] characters = {'a', 'b', 'c', 'd'};
        int[] scores = {10, 20, 30};
        String[] animals = {"dog", "cat", "bird"};
        boolean[] options = {false, true, true, false};
        double[] measures = {0.5, 1.0, 1.5, 2.0};
        char[] grades = {'A', 'B', 'C'};

        int[] data = new int[5];
        String[] names = new String[3];
        boolean[] truthValues = new boolean[4];
        double[] decimals = new double[6];
        char[] symbols = new char[2];
        int[] values2 = new int[3];
        String[] words = new String[4];
        boolean[] choices = new boolean[5];
        double[] heights = new double[2];
        char[] alphabets = new char[4];

        // Example for loop to iterate over numbers
        System.out.println("Elements of numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Example for-each loop to iterate over fruits
        System.out.println("\nElements of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Example for loop to iterate over flags
        System.out.println("\nElements of flags:");
        for (int i = 0; i < flags.length; i++) {
            System.out.println(flags[i]);
        }

        // Example for-each loop to iterate over values
        System.out.println("\nElements of values:");
        for (double value : values) {
            System.out.println(value);
        }

        // Example for loop to iterate over characters
        System.out.println("\nElements of characters:");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
    }
}