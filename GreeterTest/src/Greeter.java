
/*
//classe pubblica non contenente il main
public class Greeter {
    //dichiarazione metodo interno alla classe
    public String sayHello() {
        //messaggio da ritornare di tipo stringa String message = "Ciao Vincenzo !"
        //Ritorno del metodo
        return "Ciao Vincenzo !";
    }
}
*/

//modifica classe Greeter con utilizzo delle variabili istanza
public class Greeter {
    //Variabile istanza
    private final String name;
    private final String surname;
    private final int eta;
    //utilizzo del costruttore
    public Greeter (String mioNome, String mioCognome, int miaEta) {
        name = mioNome;
        surname = mioCognome;
        eta = miaEta;
    }
    public String sayHello() {
        return "Ciao " + name + " " + surname + " " + eta;
    }
}

//costruttore -> Inizializza gli oggetti, generalmente dichiarati public
//costruttori + metodi = interfaccia pubblica

//VAriabile istanza -> generalmenete dichiarate private, solo i metodi della classe possono accedervi, INCAPSULAMENTO.