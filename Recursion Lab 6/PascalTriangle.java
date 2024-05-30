public class PascalTriangle {
    // Recursive method to calculate Pascal's triangle value
    public static int pascal(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return pascal(n - 1, k - 1) + pascal(n - 1, k);
    }

    // Method to print Pascal's Triangle in a triangular format
    public static void printPascalTriangle(int rows) {
        printPascalTriangle(rows, 0);
    }

    private static void printPascalTriangle(int rows, int currentRow) {
        if (currentRow > rows) {
            return;
        }
        printSpaces(rows - currentRow);
        printRow(currentRow, 0);
        System.out.println();
        printPascalTriangle(rows, currentRow + 1);
    }

    private static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    private static void printRow(int row, int currentColumn) {
        if (currentColumn > row) {
            return;
        }
        System.out.print(pascal(row, currentColumn) + " ");
        printRow(row, currentColumn + 1);
    }

    public static void main(String[] args) {
        int numRows = 5; // Change this value to generate more rows of Pascal's triangle
        printPascalTriangle(numRows);
    }
}


