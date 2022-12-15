public class SwitchTest {
    public void switchClass (int n) {
        switch (n) {
            /*
                    case 1: {
                        System.out.println("ritenta");
                        break;
                    }
             */

            //Utilizzo dell'operatore freccia che non necessita di break
            case 1 ->
                System.out.println("Ritenta");

            case 2 ->
                System.out.println("ritenta");

            case 3 ->
                System.out.println("Esatto");

        }
    }

    public static void main(String[] argd) {
        SwitchTest ogg = new SwitchTest();
        ogg.switchClass(3);
    }
}
