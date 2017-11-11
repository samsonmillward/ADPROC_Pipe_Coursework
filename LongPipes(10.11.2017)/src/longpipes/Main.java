package longpipes;
import java.text.*;
public class Main {

  public static void main(String[] args) {
    NumberFormat nf;
    TypeOne test = new TypeOne(1, 5, false, 39.37, 2);
    nf = NumberFormat.getNumberInstance();
    nf.setMaximumFractionDigits(2);
    System.out.println(nf.format(test.calculateCost()));
  }
}
