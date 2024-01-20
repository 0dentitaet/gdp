public abstract class Lebensmittel 
{
    private final String name;
    protected int menge; // in Milliliter bzw. Gramm

    protected Lebensmittel(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }

    protected abstract boolean essen();

    protected abstract boolean trinken();


    protected String toString() {
        return "Lebensmittel";
    }
}