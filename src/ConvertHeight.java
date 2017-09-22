import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javax.swing.*;
import java.util.Optional;

/**
 * @author Andres Montenegro
 * Purpose: Conver the user's height from centimeters to feet and inches.
 * contact: am23828@email.vccs.edu
 * Date: 9/19/2017
 */
public class ConvertHeight extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        JOptionPane pane = new JOptionPane("Enter your height");
        pane.setWantsInput(true);
        JDialog dialog = pane.createDialog("Enter your height");
        dialog.setLocation(0,275);
        dialog.setVisible(true);
        String strHeightCm = (String)pane.getInputValue();

        double dblHeightCm;
//        strHeightCm = JOptionPane.showInputDialog("Enter your height in centimeters ");
        dblHeightCm = Double.parseDouble(strHeightCm);
        double dblHeightIn = dblHeightCm * 0.39;
        int HeightFt = (int)(dblHeightIn / 12);
        int RemainderInches = (int)(dblHeightIn%12);

        TextInputDialog textInputDialog = new TextInputDialog("150.3");
        textInputDialog.setTitle("Height Converter");
        textInputDialog.setHeaderText("Converter from Centimeters to Feet and Inches");
        textInputDialog.setContentText("Enter your height in cenimeters");
        textInputDialog.setX(500);
        textInputDialog.setY(0);
        Optional<String> result = textInputDialog.showAndWait();

        JOptionPane pane2 = new JOptionPane("Your height in feet and inches");
        dialog = pane2.createDialog("Your height in feet and inches");
        dialog.setLocation(1100,350);
        pane2.setMessage("Your height in centimeters is " + dblHeightCm +
                "\n" + "Your height in feet and inches is " + HeightFt + " feet \n and " + RemainderInches + " inches.");
        dialog.setVisible(true);
        //JOptionPane.showMessageDialog(null,

        String strHeightInCm = "";
        double dblHeightInCm;
        dblHeightInCm = Double.parseDouble(result.get());

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Height Converter");
            double dblHeightInInches = dblHeightInCm * 0.39;
            int HeightInFt = (int)(dblHeightInInches/12);
            int RemainderIn = (int)(dblHeightInInches%12);
            alert.setHeaderText("Your height in feet and inches is");
            alert.setContentText(HeightInFt + " feet and " + RemainderIn + " inches.");
            alert.setX(500);
            alert.setY(550);
            alert.showAndWait();

        }
    }
