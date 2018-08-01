class Eccho{
  int zähler = 0;
  void hallo() {
    System.out.println("Halloooo... ");
  }
}

public class EchoTestlauf {

  public static void main(String [] args){
    Eccho e1 = new Eccho();
    Eccho e2 = e1;
    int x = 0;
    while ( x < 4 ) {
      e1.hallo();
      e1.zähler = e1.zähler + 1;
      if ( x == 3 ) {
        e2.zähler = e2.zähler + 1;
      }
      if ( x > 0 ) {
        e2.zähler = e2.zähler + e1.zähler;
      }
      x = x + 1;
    }
      System.out.println(e2.zähler);
  }
}
