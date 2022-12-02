/*
    Implementare una classe BankAccount che permette di gestire
    un conto bancario contenente un saldo che può essere modificato
    da depositi e prelievi
        costruttore
        metodo deposit per versare denaro nel conto bancario
        metodo withdraw preleva denaro dal conto bancario
        metodo getBalance ritorna il saldo attuale
 */

public class BankAccount {
    private double balance;
    public BankAccount (double mbalance) {
        //this -> parola chiave per accedere al parametro implicito
        this.balance = mbalance;
    }

    //OVERLOADING -> piu metodi con lo stesso nome ma con diversi numeri e tipi di parametri
    //Inizializzo conto bancario a 0
    public BankAccount () {
        this(0);
    }

    public void deposit (double amount) {
        // balance -> parametro implicito, amount -> parametro esplicito
        //variabile inline
        this.balance = this.balance + amount;
    }
    public void withdraw (double amount) {
        //variabile inline
        this.balance = this.balance - amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
