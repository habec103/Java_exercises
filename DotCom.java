import java.util.ArrayList;

public class DotCom{
  private ArrayList<String> zielorte;

  public void setZielorte(ArrayList<String> orte){
    zielorte = orte;
  }

  public String prüfDich(String benutzerEingabe){
    String ergebnis = "Vorbei";
    int index = zielorte.indexOf(benutzerEingabe);
    if(index >= 0){
      zielorte.remove(index);
      if(zielorte.isEmpty()){
        ergebnis = "Versenkt";
      } else{
        ergebnis = "Treffer";
      }
    }
    System.out.println(ergebnis);
    return ergebnis;
  }
}
