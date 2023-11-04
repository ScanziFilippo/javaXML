import java.io.*;

public class Struttura {
    protected String tipologia;
    protected String classificazione;
    protected String denominazione;
    protected String indirizzo;
    protected Camere camere;
    protected UnitaAbitative unitaAbitative;
    public Struttura(){
        this.tipologia = "";
        this.classificazione = "";
        this.denominazione = "";
        this.indirizzo = "";
        this.camere = new Camere();
        this.unitaAbitative = new UnitaAbitative();
    }
    public Struttura(String tipologia, String classificazione, String denominazione, String indirizzo, Camere camere, UnitaAbitative unitaAbitative) {
        this.tipologia = tipologia;
        this.classificazione = classificazione;
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
        this.camere = camere;
        this.unitaAbitative = unitaAbitative;
    }
    public String toString(){
        return denominazione + ", " + indirizzo + ", " + tipologia + ", " + classificazione + ", " + camere.toString() + ", " + unitaAbitative.toString();
    }

    public String getTipologia() {
        return tipologia;
    }
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    public String getClassificazione() {
        return classificazione;
    }
    public void setClassificazione(String classificazione) {
        this.classificazione = classificazione;
    }
    public String getDenominazione() {
        return denominazione;
    }
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public Camere getCamere() {
        return camere;
    }
    public void setCamere(Camere camere) {
        this.camere = camere;
    }
    public UnitaAbitative getUnitaAbitative() {
        return unitaAbitative;
    }
    public void setUnitaAbitative(UnitaAbitative unitaAbitative) {
        this.unitaAbitative = unitaAbitative;
    }
}
