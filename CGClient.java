import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class CGClient {
    // Hardcoded email and password for demonstration purposes
    private static final String CORRECT_EMAIL = "user";
    private static final String CORRECT_PASSWORD = "pass";

    public static void main(String[] args) {
        // Ask for login credentials
        String inputEmail = JOptionPane.showInputDialog("Enter Email:");
        String inputPassword = JOptionPane.showInputDialog("Enter Password:");

        // Check if the entered credentials are correct
        if (checkCredentials(inputEmail, inputPassword)) {
            // If correct, proceed to ComplaintGUI
            SwingUtilities.invokeLater(() -> new ComplaintGUI());
        } else {
            // If incorrect, show an error message and exit
            JOptionPane.showMessageDialog(null, "Incorrect email or password. Exiting.");
            System.exit(0);
        }
    }

    private static boolean checkCredentials(String email, String password) {
        // Check if the entered credentials match the correct ones
        return email.equals(CORRECT_EMAIL) && password.equals(CORRECT_PASSWORD);
    }
}