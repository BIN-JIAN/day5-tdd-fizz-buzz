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

}
