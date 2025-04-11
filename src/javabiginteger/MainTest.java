package javabiginteger;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void sumAndMultiplyTwoBigIntegers() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            Main.sumAndMultiplyTwoBigIntegers("1234", "20");

            String output = outputStream.toString().trim();
            String[] lines = output.split(System.lineSeparator());
            assertEquals("1254", lines[0]);
            assertEquals("24680", lines[1]);
        } finally {
            System.setOut(originalOut);
        }
    }
}
