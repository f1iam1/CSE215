import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SudokuCheck {
    public SudokuCheck() {
        // Read the contents of the first file into a string
        String file1 = readFile("new-game.txt");

        // Read the contents of the second file into a string
        String file2 = readFile("sudoku.txt");

        // Compare the contents of the two files
        if (file1.equals(file2)) {
            showWinPopup("Congratulations, You WIN!");
        } else {
            showWinPopup("Very Sad, You LOSE!");
        }

        new SudokuGUI(true);
    }

    // Method to read the contents of a file into a string
    private static String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void showWinPopup(String strMessage) {
        // Create the "win/lose" message
        JLabel message = new JLabel(strMessage);
        message.setFont(message.getFont().deriveFont(20.0f));

        // Show the message in a fixed width and height popup
        JOptionPane.showMessageDialog(null, message, "Sudoku", JOptionPane.PLAIN_MESSAGE, null);
    }
}
