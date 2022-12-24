import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SudokuGUI extends WriteToFile {
    // Constants for the size of the Sudoku grid and the size of the blocks
    public static final int SIZE = 9;

    // 2D array to represent the Sudoku grid
    private int[][] grid;

    // 2D array of JTextFields to display the Sudoku grid
    private JTextField[][] textFields;

    public SudokuGUI(boolean menu) {
        if (menu) {
            gameMenu();
        }
    }

    // Constructor to initialize the GUI
    public SudokuGUI() {
        // Read the Sudoku puzzle from a text file
        readPuzzleFromFile();

        // Create a new JFrame to hold the Sudoku grid
        JFrame frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Add a window listener to the frame
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Write the Sudoku puzzle to a text file
                writePuzzleToFile("sudoku.txt");
                // Open the menu frame when the main frame is closed
                gameMenu();
            }
        });

        frame.setPreferredSize(new Dimension(600, 600));

        // Set the layout to a grid layout
        frame.setLayout(new GridLayout(SIZE, SIZE));

        // Create an array of JTextFields to display the Sudoku grid
        textFields = new JTextField[SIZE][SIZE];

        // Add the text fields to the frame
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // Create a new text field
                textFields[i][j] = new JTextField();

                // Set the font size and alignment
                textFields[i][j].setFont(textFields[i][j].getFont().deriveFont(20.0f));
                textFields[i][j].setHorizontalAlignment(JTextField.CENTER);

                // If the cell is not empty, set the text of the text field to the value of the cell
                if (grid[i][j] != 0) {
                    textFields[i][j].setText(Integer.toString(grid[i][j]));
                    textFields[i][j].setEditable(false);
                }

                // Add the text field to the frame
                frame.add(textFields[i][j]);
            }
        }

        // Set the size of the frame and make it visible
        frame.pack();
        frame.setVisible(true);
    }

    // Read the Sudoku puzzle from a text file
    private void readPuzzleFromFile() {
        grid = new int[SIZE][SIZE];

        try {
            // Open the file for reading
            BufferedReader in = new BufferedReader(new FileReader("sudoku.txt"));

            // Read each line of the file
            for (int i = 0; i < SIZE; i++) {
                String line = in.readLine();
                String[] parts = line.split(" ");
                for (int j = 0; j < SIZE; j++) {
                    grid[i][j] = Integer.parseInt(parts[j]);
                }
            }

            // Close the file
            in.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e);
        }
    }

    // Write the Sudoku puzzle to a text file
    public void writePuzzleToFile(String filename) {
        try {
            // Open the file for writing
            PrintWriter out = new PrintWriter(filename);

            // Write each row of the puzzle to the file
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    // Get the text of the text field, or write a 0 if the text field is empty
                    String text = textFields[i][j].getText();
                    if (text.isEmpty()) {
                        text = "0";
                    }
                    out.print(text + " ");
                }
                out.println();
            }

            // Close the file
            out.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }
    }

    // Game menu method
    public void gameMenu() {
        // JFrame to hold the start page
        JFrame frame;

        // Create a new JFrame to hold the start page
        frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setPreferredSize(new Dimension(600, 400));

        // Set the layout to a grid layout
        frame.setLayout(new GridLayout(2, 1));

        // Create the buttons
        JButton newGameButton = new JButton("New Game");
        JButton loadGameButton = new JButton("Load Game");
        JButton checkGameButton = new JButton("Check Game");
        JButton exitButton = new JButton("Exit");

        // Add action listeners to the buttons
        newGameButton.addActionListener(e -> {
            // Close the menu
            frame.dispose();

            // Start a new game
            startNewGame();
        });
        loadGameButton.addActionListener(e -> {
            // Close the start page
            frame.dispose();

            // Load a saved game
            loadGame();
        });
        checkGameButton.addActionListener(e -> {
            // Close the start page
            frame.dispose();

            // check the game
            new SudokuCheck();
        });
        exitButton.addActionListener(e -> {
            // Close the menu
            frame.dispose();

            // Exit the game
            exitGame();
        });

        // Add the buttons to the frame
        frame.add(newGameButton);
        frame.add(loadGameButton);
        frame.add(checkGameButton);
        frame.add(exitButton);

        // Pack the frame and make it visible
        frame.pack();
        frame.setVisible(true);
    }

    // Method to start a new game
    private void startNewGame() {
        // Write the puzzle to a text file
        SudokuGenerator s = new SudokuGenerator();
        s.generatePuzzle("new-game.txt");

        // Load new game
        new SudokuGUI();
    }

    // Method to load a saved game
    private void loadGame() {
        // Load the saved game
        new SudokuGUI();
    }

    // Method to exit the game
    private void exitGame() {
        // Exit the game
        System.exit(0);
    }
}