import javax.swing.*;
import java.awt.*;

public class compReportsDialog {
    private compFile cfile; // Add a reference to the compFile object

    public compReportsDialog(compFile cfile) {
        this.cfile = cfile; // Initialize the compFile reference

        JDialog reportsDialog = new JDialog();
        reportsDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        reportsDialog.setTitle("Reports and Analytics");
        reportsDialog.setSize(600, 400);
        reportsDialog.setLayout(new BorderLayout());

        // Create a JTextArea or JTable to display the reports
        JTextArea taReports = new JTextArea();
        taReports.setEditable(false);

        // Generate and set the content of the reports
        String reportsContent = generateReports();
        taReports.setText(reportsContent);

        JScrollPane scrollPane = new JScrollPane(taReports);
        reportsDialog.add(scrollPane, BorderLayout.CENTER);

        reportsDialog.setVisible(true);
    }

    // Implement a method to generate reports based on the complaint data
    private String generateReports() {
        // Call the compFile methods to generate reports
        String complaintStatisticsReport = cfile.generateComplaintStatisticsReport();
        String responseTimesReport = cfile.generateResponseTimesReport();
        String resolutionRatesReport = cfile.generateResolutionRatesReport();

        // Format the final reports
        StringBuilder finalReport = new StringBuilder();
        finalReport.append(complaintStatisticsReport).append("\n");
        finalReport.append(responseTimesReport).append("\n");
        finalReport.append(resolutionRatesReport);

        return finalReport.toString();
    }
}
