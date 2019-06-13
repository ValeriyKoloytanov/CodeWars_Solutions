import java.util.stream.IntStream;
public class Codewars {
  public static String oddOrEven (int[] array) {
  int sum = IntStream.of(array).sum();
  if  (sum%2!=0) return  "odd";
   else return "even";
  }
}