package seng202.group4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import seng202.group4.data.dataType.Airline;
import seng202.group4.data.parser.validator.AirlineValidator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jjg64 on 28/08/16.
 */
public class ValidatorGUITest {

    public static void testInvalidFile(String file) throws IOException {
        AirlineValidator parser = new AirlineValidator(new File(file));
        ArrayList<Airline> airlines = parser.makeAirlines();
        assert(airlines == null);
    }

}