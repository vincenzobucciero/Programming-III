//Class Test BankAccount

/*
    Implementare una classe BankAccountTest per il collaudo
    della classe BankAccount:
        -Inserimento denaro
        -Prelievo
        -Stampa Saldo

 */
public class BankAccountTest {
    public static void main (String[] args) {
        BankAccount conto = new BankAccount();

        conto.deposit(1000);
        conto.withdraw(500);
        System.out.println(conto.getBalance());
    }
}
