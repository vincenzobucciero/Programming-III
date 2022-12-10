//Console Reader for earthquake

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleReader {
    /**
     Costruisce un lettore da console da un flusso di input
     come per esempio System.in
     @param inStream un flusso di input
     */
    private BufferedReader reader;

    public ConsoleReader(InputStream inStream) {
        reader = new BufferedReader(new InputStreamReader(inStream));
    }

    public String readLine() {
        String inputLine = "";
        try {
            inputLine = reader.readLine();
        } catch (IOException exc) {
            System.out.println(exc);
            System.exit(1);
        }
        return inputLine;
    }

    public int readInt() {
        String input = readLine();
        int n = Integer.parseInt(input);

        return n;
    }
    public double readDouble() {
        String input = readLine();
        double n = Double.parseDouble(input);

        return n;
    }

}
