package lesson_303_5_iteration_statements_loops;

public class PatterOptimized {
    public static void main(String[] args) {
        int n = 10; // Grid size

        for (int i = 0; i < n; i++) { // Loop through rows
            for (int j = 0; j < n; j++) { // Loop through columns
                System.out.print((i == j || i + j == n - 1) ? "* " : "  ");
            }
            System.out.println(); // Move to the next row
        }
    }
}

