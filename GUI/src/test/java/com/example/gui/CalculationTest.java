package com.example.gui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

  @Test
  void getStandardDeviation() {
    double[] input = {1, 2, 3};
    assertEquals(0.81649658092773, Calculation.getStandardDeviation(input), 1e-9);
  }

  @Test
  void sqrt() {
    assertEquals(2.0, Calculation.sqrt(4.0), 1e-9);
    assertEquals(1.41421356237, Calculation.sqrt(2.0), 1e-9);
  }

  @Test
  void abs() {
    assertEquals(0.0, Calculation.abs(0.0));
    assertEquals(30, Calculation.abs(30));
    assertEquals(12.2, Calculation.abs(-12.2));
  }

  @Test
  void getStandardDeviationWithString() {
    double expected=0.81649658092773;
    String inputStringWithCommas = "1, 2, 3";
    assertEquals(expected, Calculation.getStandardDeviationWithString(inputStringWithCommas), 1e-9);

    String mixedInputString = "1, 2   3";
    assertEquals(expected, Calculation.getStandardDeviationWithString(mixedInputString), 1e-9);

    String changeLineInputString = "1, \n2   3";
    assertEquals(expected, Calculation.getStandardDeviationWithString(changeLineInputString), 1e-9);
  }

  @Test
  void testGetStandardDeviationWithStringThrowsException() {
    assertThrows(NumberFormatException.class, () -> {
      Calculation.getStandardDeviationWithString("");
    });

    assertThrows(NumberFormatException.class, () -> {
      Calculation.getStandardDeviationWithString("1,test,2,2");
    });
  }

  @Test
  void testSqrtThrowsException() {
    assertThrows(IllegalArgumentException.class, () -> {
      Calculation.sqrt(-1);
    });
  }

}