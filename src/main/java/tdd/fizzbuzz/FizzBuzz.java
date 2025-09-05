package tdd.fizzbuzz;

public class FizzBuzz {

  public final String FIZZ = "Fizz";
  public final String BUZZ = "Buzz";
  public final String FIZZBUZZ = "FizzBuzz";
  public final String WHIZZ = "Whizz";
  public final String FIZZWHIZZ = "FizzWhizz";
  public final String BUZZWHIZZ = "BuzzWhizz";
  public String create(int number) {
    boolean isMultipleOf3 = number % 3 == 0;
    boolean isMultipleOf5 = number % 5 == 0;
    boolean isMultipleOf7 = number % 7 == 0;
    if(isMultipleOf3 && isMultipleOf5) {
      return FIZZBUZZ;
    } else if (isMultipleOf3 && isMultipleOf7 && !isMultipleOf5) {
      return FIZZWHIZZ;
    } else if (isMultipleOf5 && isMultipleOf7) {
      return BUZZWHIZZ;
    } else if (number%5 == 0){
      return BUZZ;
    } else if (number%3 == 0){
      return FIZZ;

    } else if (number%7 == 0) {
      return WHIZZ;
    } else{
      return String.valueOf(number);
    }
  }
}
