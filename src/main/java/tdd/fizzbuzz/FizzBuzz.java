package tdd.fizzbuzz;

public class FizzBuzz {
 public final String FIZZ="Fizz";
  public String create(int number) {
    if(number%3 == 0){
      return FIZZ;
    }
    return String.valueOf(number);
  }
}
