//Class for if-else test
public class IfElseTest {

    public void _IfElseTest(int a, int b) {
        if (a == b)
            System.out.println("Uguali");
        else if (a > b)
            System.out.println("a maggiore di b");
        else
            System.out.println("a minore di b");
    }

    /*
    public void IfElseTest(int a, int b) {
        String result;
        result = (a >= b) ? "Pass" : "a è minore di b";
    }

    */

    public static void main (String[] args) {
        IfElseTest ogg = new IfElseTest();
        ogg._IfElseTest(3,4);
        ogg._IfElseTest(3,3);
        ogg._IfElseTest(5,4);
    }
}
