public class WhileTest {
    public void whileTest (int n) {
       int i = 0;
       while (i <= n){
           System.out.println(i);
           i++;
       }
    }
    public static void main(String[] args) {
        WhileTest ogg = new WhileTest();
        ogg.whileTest(5);
    }
}
