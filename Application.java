import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application{
  public static void main(final String[] args) {
    System.out.println("Starting... (thread: " + Thread.currentThread() + ")");
  }
  EventQueue.invokeLater(Runnable runna){
    public void run(){
      System.out.println("Creating GUI...(thread: " + Thread.currentThread() + ")");

      new JFrame().setVisible(true);
    }
  }
}
