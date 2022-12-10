
//class test for Purse
public class PurseTest {
    public static void main (String [] args) {
        Purse ogg = new Purse();
        ogg.addNickels(10.25);
        ogg.addDimes(2.26);
        ogg.addQuarter(5);

        System.out.println("Il totale è:  " + ogg.getTotal());
    }
}
