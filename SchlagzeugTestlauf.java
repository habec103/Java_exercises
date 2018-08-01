class Schlagzeug{
  boolean tomTom = true;
  boolean snare = true;

  void spieleSnare(){
    System.out.println("pamm pamm pa-pamm");
  }

  void spieleTomTom(){
    System.out.println("dumm dumm du-dumm");
  }
}

class SchlagzeugTestlauf{

  public static void main(String[] args) {
  Schlagzeug s = new Schlagzeug();
  s.spieleSnare();
  s.spieleTomTom();

  s.snare = false;
  if(s.snare == true){
    s.spieleSnare();
  }
  }
}
