public class puzzle4{
  public static void main(String[] args) {
    Puzzle4b [] obs = new Puzzle4b[6];
    int y = 1;
    int x = 0;
    int erg = 0;
    while(x<6){
      obs[x] = new Puzzle4b();
      obs[x].ivar = y;
      y = y*10;
      x = x +1;
    }
    x = 6;
    while(x>0){
      x = x-1;
      erg = erg + obs[x].machZeug(x);
    }
    System.out.println("Ergebnis " + erg);
  }
}

class Puzzle4b{
  int ivar;
  public int machZeug(int faktor){
    if(ivar > 100){
      return ivar*faktor;
    }
    else
      return ivar*(5-faktor);
  }
}
