public class EinfachesDotCom{
  int[] zielorte;
  int anzahlTreffer;

  public void setZielorte(int [] orte){
    zielorte = orte;
  }

  public String prüfDich(String Stringtipp){
    int tipp = Integer.parseInt(Stringtipp);
    String ergebnis = "Vorbei";
    for(int zelle : zielorte){
      if(tipp == zelle){
        ergebnis = "Treffer";
        anzahlTreffer++;
        break;
      }
    }
    if(anzahlTreffer == zielorte.length){
      ergebnis = "Versenkt";
    }
    System.out.println(ergebnis);
    return ergebnis;
  }
}
