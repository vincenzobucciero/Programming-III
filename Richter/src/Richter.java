import java.io.IOException;

public class Richter {
    public static void main (String [] args) throws IOException {
        ConsoleReader ogg = new ConsoleReader(System.in);
        System.out.println("Immetti una magnitudo della scala Richter:  ");
        double magnitude = ogg.readDouble();

        EarthQuake ogg1 = new EarthQuake(magnitude);
        System.out.println(ogg1.getEarthQuake());
    }
}
