package tutorial1;

public class Demo {

  public String source() {
    return "secret";
  }

  public void sink(String msg) {
    System.out.println("leak "+msg);
  }
}
