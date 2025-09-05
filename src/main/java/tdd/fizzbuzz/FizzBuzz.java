package tdd.fizzbuzz;

public class FizzBuzz {

  public final String FIZZ = "Fizz";
  public final String BUZZ = "Buzz";
  public String create(int number) {
    if(number%3 == 0){
      return FIZZ;
    }else if (number%5 == 0){
      return BUZZ;
    }
    return String.valueOf(number);
  }
}
