import java.lang.StringBuilder;
import java.util.Stack;

public class Vial {
    private Stack<Colour> vial;
    private int length;
    private int maxlength;

    public Vial(int size) {
        vial = new Stack<Colour>();

        length = 0;
        maxlength = size;
    }

    public Vial(Colour[] clist) {
        vial = new Stack<Colour>();

        length = clist.length;
        maxlength = clist.length;

        for (Colour c : clist) { vial.push(c); }
    }

    public boolean isEmpty() { return vial.empty(); }
    public boolean isFull() { return length == maxlength; }

    public Colour top() {
        if (isEmpty()) return null;
        else return vial.peek();
    }

    public Colour pour(Vial other) {
        if (other.isEmpty() || other.top() == top()) return vial.pop();
        else return null; 
    }

    public void fill(Colour fill) {
        if (fill != null) vial.push(fill);
    }

    public String toString() {
        if (isEmpty()) return "The vial is empty.";

        StringBuilder rtn = new StringBuilder();

        for (Colour c : vial) {
            rtn.append(c).append(" ");
        }

        return rtn.toString();
    }

    public static void main(String[] args) {
        Vial v1 = new Vial(5);

        Colour[] v2List = { Colour.BLUE, Colour.RED, Colour.GREEN, Colour.YELLOW }; 

        Vial v2 = new Vial(v2List);

        System.out.println(v1);
        System.out.println(v2);

        System.out.println(v1.top());
        System.out.println(v2.top());
    }
}
