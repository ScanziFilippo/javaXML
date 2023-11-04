import java.io.*;

public class Camere {
    protected int singole;
    protected int doppie;
    protected int triple;
    protected int quadruple;
    protected int quintuple;
    protected int sestuple; 
    public Camere(){
        this.singole = 0;
        this.doppie = 0;
        this.triple = 0;
        this.quadruple = 0;
        this.quintuple = 0;
        this.sestuple = 0;
    }
    public Camere(int singole, int doppie, int triple, int quadruple, int quintuple, int sestuple) {
        this.singole = singole;
        this.doppie = doppie;
        this.triple = triple;
        this.quadruple = quadruple;
        this.quintuple = quintuple;
        this.sestuple = sestuple;
    }
    public int getSingole() {
        return singole;
    }
    public void setSingole(int singole) {
        this.singole = singole;
    }
    public int getDoppie() {
        return doppie;
    }
    public void setDoppie(int doppie) {
        this.doppie = doppie;
    }
    public int getTriple() {
        return triple;
    }
    public void setTriple(int triple) {
        this.triple = triple;
    }
    public int getQuadruple() {
        return quadruple;
    }
    public void setQuadruple(int quadruple) {
        this.quadruple = quadruple;
    }
    public int getQuintuple() {
        return quintuple;
    }
    public void setQuintuple(int quintuple) {
        this.quintuple = quintuple;
    }
    public int getSestuple() {
        return sestuple;
    }
    public void setSestuple(int sestuple) {
        this.sestuple = sestuple;
    }
    public String toString(){
        return "Camere singole: " + singole + ", camere doppie: " + doppie + ", camere triple: " + triple + ", camere quadruple: " + quadruple + ", camere quintuple: " + quintuple + ", camere sestuple: " + sestuple;
    }
}