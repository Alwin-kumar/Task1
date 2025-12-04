public class Array {
    public static void main(String[] args) {
        int[] numbers = {7, 31, 18, 45, 3};
        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }
        System.out.println("Array sum: " + sum);
    }
}
