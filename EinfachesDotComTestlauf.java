public class EinfachesDotComTestlauf{
  public static void main(String[] args) {
    EinfachesDotCom dot = new EinfachesDotCom();
    int[] orte = {2,3,4};
    dot.setZielorte(orte);
    String tipp = "2";
    String ergebnis = dot.prüfDich(tipp);
  }
}
