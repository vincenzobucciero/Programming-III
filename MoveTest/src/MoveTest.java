//quando si usa una llibreria diversa da java.lang, bisogna importarla

import java.awt.Rectangle;

public class MoveTest {
    public static void main (String [] args) {
        //Rectangle passa in input 4 parametri
        Rectangle oggetto = new Rectangle(5,10,20,30);
        //Stampa dell'oggetto
        System.out.println(oggetto);
        //utilizzo metodo translate della classe Rectangle che trasla il lati del rettangolo
        oggetto.translate(15,25);
        System.out.println(oggetto);
    }
}
