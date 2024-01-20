public class Speise extends Lebensmittel {

//Lebensmittel.essen()

    protected int essen(int menge){
        this.menge -= menge;
        return this.menge;
    }
    
    protected boolean trinken(int menge){
        return false;
    }


}