public class PhrasOMat{
  public static void main(String[] args) {
    //Erste Wortliste
    String[] ersteWortliste = {"verlässliche", "erfolgsorientierte", "webbasierte",
    "allumfassende", "clevere", "kundenorientierte", "pfadkritische", "dynamische",
    "konkurrenzfähige", "verteilte", "zielgerichtete"};
    //Zweite Wortliste
    String[] zweiteWortliste = {"gepowerte ", "haftende ", "Mehrwert-", "zentrierte ",
    "geclusterte ", "proaktive ","Out-of-the-Box-", "positionierte ", "vernetzte ",
    "fokussierte ", "kraftvolle ", "geordnete ", "geteilte ", "kooperative ",
    "beschleunigte ", "Multi-Tier-","Enterprise-","B2B-","Frontend-"};
    //Dritte Wortliste
    String[] dritteWortliste = {"Schicht", "Endstufe", "Lösung", "Architektur",
    "Kernkompetenz", "Strategie", "Kooperation", "Ausrichtung", "Räumlichkeit",
    "Vision", "Dimension", "Mission"};

    int länge_erste  =  ersteWortliste.length;
    int länge_zweite =  zweiteWortliste.length;
    int länge_dritte =  dritteWortliste.length;

    int wort1 = (int) (Math.random() * länge_erste);
    int wort2 = (int) (Math.random() * länge_zweite);
    int wort3 = (int) (Math.random() * länge_dritte);

    System.out.println("Was wir brauchen ist eine " + ersteWortliste[wort1] + " " + zweiteWortliste[wort2] + dritteWortliste[wort3]);
  }
}
