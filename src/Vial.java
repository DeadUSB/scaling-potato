public class Vial {

    private int size;
    private char[] liquids;

    public Vial(int s) {
        size = s;
        liquids = new char[size];
    }

    public char[] getLiquids() {
        return liquids;
    }
}
