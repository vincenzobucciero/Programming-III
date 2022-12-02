public class AritmVarArgs {
    //utilizzo di varargs
    //parametri non definiti
    public int Somma (int ... args) {
        int sum = 0;
        //ciclo for per scorrere tutti gli argomenti
        for (int x : args) {
            sum += x;
        }
        return sum;
    }
}
