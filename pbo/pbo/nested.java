public class nested {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
