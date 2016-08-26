package seng202.group4;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import seng202.group4.data.dataType.Airline;
import seng202.group4.data.dataType.Airport;
import seng202.group4.data.dataType.Route;
import seng202.group4.data.parser.AirlineParser;
import seng202.group4.data.parser.validator.AirlineValidator;
import seng202.group4.data.repository.AirlineRepository;
import seng202.group4.data.repository.AirportRepository;
import seng202.group4.data.repository.RouteRepository;

import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jjg64 on 25/08/16.
 */
public class ValidatorTest {

    /* Airline validator test cases */

    /* Valid files */

    @Test
    public void oneValidAirlineSize() throws IOException {
        AirlineValidator parser = new AirlineValidator(new File("testfiles/Airlines/oneValidAirline.txt"));
        ArrayList<Airline> airlines = parser.makeAirlines();
        assertTrue(airlines.size() == 1);

    }

    @Test
    public void multipleValidAirlinesSize() throws IOException {
        AirlineValidator parser = new AirlineValidator(new File("testfiles/Airlines/validAirline.txt"));
        ArrayList<Airline> airlines = parser.makeAirlines();
        assertTrue(airlines.size() == 6048);

    }

    @Test
    public void oneValidAirlineWithNullSize() throws IOException {
        AirlineValidator parser = new AirlineValidator(new File("testfiles/Airlines/oneValidAirlineWithNull.txt"));
        ArrayList<Airline> airlines = parser.makeAirlines();
        assertTrue(airlines.size() == 1);
    }

    @Test
    public void emptyFile() throws IOException {
        AirlineValidator parser = new AirlineValidator(new File("testfiles/empty.txt"));
        ArrayList<Airline> airlines = parser.makeAirlines();
        int size = airlines.size();
        assertTrue(size == 0);
    }

    /* Invalid files */

    @Test
    public void missingQuotation() throws IOException {
        try {
            AirlineValidator parser = new AirlineValidator(new File("testfiles/Airlines/oneDodgyAirline.txt"));
            ArrayList<Airline> airlines = parser.makeAirlines();
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}