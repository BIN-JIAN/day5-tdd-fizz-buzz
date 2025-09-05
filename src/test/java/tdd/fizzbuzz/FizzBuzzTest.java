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

}
