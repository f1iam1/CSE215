import java.io.*;
import java.util.Random;

public class SudokuGenerator extends WriteToFile {
    // Constants for the size of the Sudoku grid and the size of the blocks
    public static final int SIZE = 9;
    public static final int BLOCK_SIZE = 3;

    // 2D array to represent the Sudoku grid
    private final int[][] grid;

    // Constructor to initialize the grid
    public SudokuGenerator() {
        grid = new int[SIZE][SIZE];
    }

    // Generate a new Sudoku puzzle and save it to a text file
    public void generatePuzzle(String fileName) {
        // Fill in the grid with valid numbers using a backtracking algorithm
        if (!generate(0, 0)) {
            System.out.println("Failed to generate a puzzle");
            return;
        }

        // Open the file for writing
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            // Write the numbers from the Sudoku grid to the file
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    bw.write(grid[i][j] + " ");
                }
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Remove some numbers to create a puzzle for the player
        removeNumbers();

        // Write the puzzle to a text file
        writePuzzleToFile("sudoku.txt");
    }

    // Remove some numbers from the grid to create a puzzle for the player
    private void removeNumbers() {
        // Use a random number generator to select which cells to leave empty
        Random rand = new Random();

        // Remove a certain number of numbers from the grid
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (rand.nextDouble() < 0.2) {
                    grid[i][j] = 0;
                }
            }
        }
    }

    // Recursive function to generate a valid Sudoku grid using backtracking
    private boolean generate(int row, int col) {
        // If we have reached the last cell, the grid is complete
        if (row == SIZE - 1 && col == SIZE) {
            return true;
        }

        // If we have reached the end of the row, go to the next row
        if (col == SIZE) {
            row++;
            col = 0;
        }

        // Skip cells that are already filled in
        if (grid[row][col] != 0) {
            return generate(row, col + 1);
        }

        // Try different numbers in the empty cell
        for (int num = 1; num <= SIZE; num++) {
            if (isValid(row, col, num)) {
                grid[row][col] = num;
                if (generate(row, col + 1)) {
                    return true;
                }
                grid[row][col] = 0;
            }
        }

        // No valid number was found, backtrack
        return false;
    }

    // Check if a number is valid for a given cell
    private boolean isValid(int row, int col, int num) {
        // Check the row and column
        for (int i = 0; i < SIZE; i++) {
            if (grid[row][i] == num || grid[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 block
        int startRow = row - row % BLOCK_SIZE;
        int startCol = col - col % BLOCK_SIZE;
        for (int i = startRow; i < startRow + BLOCK_SIZE; i++) {
            for (int j = startCol; j < startCol + BLOCK_SIZE; j++) {
                if (grid[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Write the Sudoku puzzle to a text file
    public void writePuzzleToFile(String filename) {
        try {
            // Open the file for writing
            PrintWriter out = new PrintWriter(filename);

            // Write each row of the puzzle to the file
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    out.print(grid[i][j] + " ");
                }
                out.println();
            }

            // Close the file
            out.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }
    }
}
