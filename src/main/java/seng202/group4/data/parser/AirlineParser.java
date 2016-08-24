package seng202.group4.data.parser;

import seng202.group4.data.dataType.Airline;
import seng202.group4.data.dataType.DaylightSavingsTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by jjg64 on 15/08/16.
 */
public class AirlineParser {
    private final int MAX_ITEMS_PER_LINE = 8;
    private BufferedReader file;
    private Airline thisAirline;
    private String[] splitLine = new String[MAX_ITEMS_PER_LINE];
    private String splitBy = ",";
    private int ID;
    private boolean active;
    private String currentLine;

    public AirlineParser(BufferedReader file) {
        this.file = file;
    }


    private void readString(int i) {
        if (splitLine[i].equals("\\N")) {
            splitLine[i] = null;
        } else {
            splitLine[i] = splitLine[i].replaceAll("^\"|\"$", "");      // Remove quotation marks
        }
    }

    private void addAirline() throws IOException {
        splitLine = currentLine.split(splitBy, MAX_ITEMS_PER_LINE);
        ID = Integer.parseInt(splitLine[0]);
        for (int i = 1; i <= 7; i++) {      // Checks indices 1 to 7
            readString(i);
        }
        if (splitLine[7].contains("Y")) {
            active = true;
        } else {
            active = false;
        }
        thisAirline = new Airline(ID, splitLine[1], splitLine[2],
                splitLine[3], splitLine[4], splitLine[5],
                splitLine[6], active);
    }

    public void readFile() throws IOException {
        while ((currentLine = file.readLine()) != null) {
            addAirline();
        }
    }

}

class AirlineFileValidator {
    private BufferedReader file;

    AirlineFileValidator(BufferedReader file) {
        this.file = file;
    }
}