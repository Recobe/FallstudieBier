package FallstudieBier;
 
public class Brauerei extends Standort {
 
    private int kapazitaet;
    private int range = 5;
    private Spieler spieler;
    //Kosten bitte beim Spieler dazuz�hlen, hier wird nur die Kapazitaet gespeichert!
     
    public Brauerei(int kapazitaet,  int pos_x, int pos_y, String name){
        super(pos_x, pos_y, name);
        this.kapazitaet = kapazitaet;
        //this.spieler = besitzer;
    }
 
    public void herstellen(){
        if(spieler.getRohstoffe() < kapazitaet){
            spieler.einlagern(spieler.getRohstoffe(), "Rohstoffe");
            spieler.einlagern(spieler.getRohstoffe(), "Bier");
            //Hier Meldung an GUI, dass Rohstoffe nicht vorhanden!
        }
        else{
            spieler.einlagern(-kapazitaet, "Rohstoffe");
            spieler.einlagern(kapazitaet, "Bier");  
        }
    }
     
    public void setSpieler(Spieler besitzer){
        this.spieler = besitzer;
    }
     
    public int getKapazit�t() {
        return kapazitaet;
    }
 
    public void setKapazit�t(int kapazit�t) {
        this.kapazitaet = kapazit�t;
    }
     
    public void erhoeheRange(int i){
        range = range + i;
    }
     
    public int getRange(){
        return range;
    }   
}
 
