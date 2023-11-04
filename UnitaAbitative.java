
public class UnitaAbitative {
    protected int totale;
    protected int postiLettoTotali;
    public UnitaAbitative(){
        this.totale = 0;
        this.postiLettoTotali = 0;
    }
    public UnitaAbitative(int totale, int postiLettoTotali) {
        this.totale = totale;
        this.postiLettoTotali = postiLettoTotali;
    }
    public int getTotale() {
        return totale;
    }
    public void setTotale(int totale) {
        this.totale = totale;
    }
    public int getPostiLettoTotali() {
        return postiLettoTotali;
    }
    public void setPostiLettoTotali(int postiLettoTotali) {
        this.postiLettoTotali = postiLettoTotali;
    }
    public String toString(){
        return "Unità abitative totali: " + totale + ", posti totali: " + postiLettoTotali;
    }
}
