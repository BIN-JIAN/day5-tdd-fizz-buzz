package tdd.fizzbuzz;

public class FizzBuzz {

  public final String FIZZ = "Fizz";
  public final String BUZZ = "Buzz";
  public final String FIZZBUZZ = "FizzBuzz";

  public String create(int number) {
    if(number%3 == 0 && number%5 == 0){
      return  FIZZBUZZ;
    }else if (number%5 == 0){
      return BUZZ;
    } else if (number%3 == 0){
      return FIZZ;
    }else{
      return String.valueOf(number);
    }
  }
}
