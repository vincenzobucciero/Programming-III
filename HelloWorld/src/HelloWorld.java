
//Qualsiasi applicazione deve sempre avere un metodo main

/*
Classe HelloWorld pubblica
 */

/*
    System -> classe di Object (superclasse)
    out -> oggetto della classe System
    println -> metodo della classe
*/

public class HelloWorld {
    //Metodo main non agisce su un oggetto (sempre static)
    public static void main(String[] args) {    //(...) argomenti dalla linea di comando
        System.out.println("Hello World!!");
    }
}


//classe -> astrazione indicante un insieme di oggetti che condividono le stesse caratteristiche e le stesse funzionalità
//oggetto -> istanza (creazione fisica) di una classe

//classe -> definisce i metodi che si possono applicare ai suoi oggetti
//metodo -> definisce una funzionalità che deve avere il concetto che si sta astraendo con la classe
