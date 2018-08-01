class GuterHund{
  private int größe;

  public int getGröße(){
    return größe;
  }
  public void setGröße(int s){
    größe = s;
  }

  void bellen(){
    if(größe > 60){
      System.out.println("WUFF!");
    }
    else if(größe > 14){
      System.out.println("Wau!");
    }
    else{
      System.out.println("Jipp!");
    }
  }
}

class einGuterHundTestlauf{
  public static void main(String[] args) {
    GuterHund Fye = new GuterHund();
    GuterHund Kalua = new GuterHund();
    Fye.setGröße(70);
    Kalua.setGröße(8);
    System.out.println("Fye: " + Fye.getGröße());
    Fye.bellen();
    System.out.println("Kalua: " + Kalua.getGröße());
    Kalua.bellen();
  }
}
