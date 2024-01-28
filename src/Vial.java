import java.util.Map;

public class Vial {
    enum Colour {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        VIOLET,
        PINK,
        EMPTY
    }

    private int size;
    private Map<Colour, Integer> topLiquid;
    private char[] liquids;
    private boolean full;

    public Vial(int s) {
        size = s;
        liquids = new char[size];
        full = false;
    }

    public boolean validate(Vial other) { // used in the fill method.
        if (other.getLiquids().length != this.liquids.length) { // length mismatch.
            System.out.println("[ERROR] Length mismatch.");
            return false;
        } else if (this.full) { // full vial.
            System.out.println("[ERROR] Current vial is full.");
            return false;
        } else if (this.topLiquid != other.topLiquid) { // liquid mismatch.
            System.out.println("[ERROR] Liquid mismatch.");
            return false; 
        }

        return true;
    }

    public void fill(Vial other) { // add liquid from other vial
        while (validate(other)) {

        }
    }

    public char[] getLiquids() {
        return liquids;
    }
}
