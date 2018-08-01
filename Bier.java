public class Bier{

  public static void main(String[] args) {
    int bottles = 99;
    String b = "bottles";

    while(bottles > 0){
      System.out.println(bottles + " " + b + " of beer on the wall,");
      System.out.println(bottles + " " + b + " of beer.");
      System.out.println("Take one down, pass it around.");
      bottles -= 1;
      if(bottles == 1){
        b = "bottle";
      }
    }
    System.out.println("No more bottles of beer on the wall.");
  }
}
