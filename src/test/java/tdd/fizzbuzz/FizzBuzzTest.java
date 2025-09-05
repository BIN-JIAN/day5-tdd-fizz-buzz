package tdd.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  @Test
  void Should_return_normal_number_when_countOff_then_normal_number(){
    //Given
    int number = 1;
    FizzBuzz fizzBuzz = new FizzBuzz();
    //when
    String result = fizzBuzz.create(number);
    //Then
    assertEquals("1",result);
  }

  @Test
  void Should_return_multiple_3_when_countOff_then_Fizz(){
    //Given
    int number = 3;
    FizzBuzz fizzBuzz = new FizzBuzz();
    //when
    String result = fizzBuzz.create(number);
    //Then
    assertEquals("Fizz",result);
  }
  @Test
  void Should_return_multiple_5_when_countOff_then_Buzz(){
    //Given
    int number = 5;
    FizzBuzz fizzBuzz = new FizzBuzz();
    //when
    String result = fizzBuzz.create(number);
    //Then
    assertEquals("Buzz",result);
  }
  @Test
  void Should_return_common_multiple_3_and_5_when_countOff_then_FizzBuzz(){
    //Given
    int number = 15;
    FizzBuzz fizzBuzz = new FizzBuzz();
    //when
    String result = fizzBuzz.create(number);
    //Then
    assertEquals("FizzBuzz",result);
  }

}
