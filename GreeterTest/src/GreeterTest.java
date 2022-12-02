//classe Test per la classe Greeter
public class GreeterTest {
    public static void main(String[] args) {
        //creo oggetto del metodo della classe Greeter
        Greeter worldGreeter = new Greeter("Vincenzo", "Bucciero", 21);
        //utilizzo metodo implementato nella classe Greeter
        System.out.println(worldGreeter.sayHello());
    }
}
