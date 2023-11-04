import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Struttura> strutture = new ArrayList <Struttura> ();
        ArrayList <Struttura> struttureLette = new ArrayList <Struttura> ();
        Struttura struttura = new Struttura("Albergo", "5 stelle", "Albergo Scanzi", "Via Roma 16", new Camere(3, 3, 2, 3, 0, 1), new UnitaAbitative(4, 12));
        Struttura struttura2 = new Struttura("Albergo", "4 stelle", "Albergo Volpi", "Via Venezia 12", new Camere(2, 4, 2, 3, 2, 1), new UnitaAbitative(3, 10));
        Struttura struttura3 = new Struttura("Albergo", "3 stelle", "Albergo Carissimi", "Via Milano 3", new Camere(1,1,1,1,1,1), new UnitaAbitative(1, 1));
        strutture.add(struttura);
        strutture.add(struttura2);
        strutture.add(struttura3);
        scriviXML(strutture);
        struttureLette = leggi();
        for(Struttura s : struttureLette){
            System.out.println(s.toString());
        }
    }
    public static void scriviXML(ArrayList <Struttura> strutture){
        try {
            XMLEncoder e = new XMLEncoder(
                 new BufferedOutputStream(
                     new FileOutputStream("strutture-out.xml")
                 )
            );
            e.writeObject(strutture);
            e.close();
        }
        catch (Exception ex) {
            System.out.println("Errore");
        }
    }
    public static ArrayList <Struttura> leggi(){
        ArrayList <Struttura> strutture = null;
        try {
            XMLDecoder d = new XMLDecoder(
                new BufferedInputStream(
                    new FileInputStream("strutture-out.xml")
                )
            );
            strutture = (ArrayList<Struttura>) d.readObject();
            d.close();
        }
        catch (Exception e) {
            System.out.println("Errore");
        }
        return strutture;
    }
    public String toString(ArrayList <Struttura> strutture){
        return strutture.stream().map(struttura -> struttura.toString()).reduce("", (a, b) -> a + b);
    }
}