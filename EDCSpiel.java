public class EDCSpiel{
  public static void main(String[] args) {
    int anzahlTipps = 0;
    SpielHelfer helfer = new SpielHelfer();
    DotCom dasDotCom = new DotCom();
    int zufallszahl = (int) (Math.random()*5);

    ArrayList<> = {zufallszahl,zufallszahl+1,zufallszahl+2};
    dasDotCom.setZielorte(orte);

    boolean lebt = true;

    while(lebt == true){
      String tipp = helfer.getBenutzereingabe("Geben Sie eine Zahl ein");
      String ergebnis = dasDotCom.prüfDich(tipp);
      anzahlTipps++;
      if(ergebnis.equals("Versenkt")){
        lebt = false;
        System.out.println("Sie haben " + anzahlTipps + " verwendet.");
      }
    }
  }
}
