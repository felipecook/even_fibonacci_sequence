package edu.cnm.deepdive;

public class Fibonacci {

  public static void main(String[] args) {
    long sumOfFibonacci = 1;
    do {
      sumOfFibonacci += sumOfFibonacci;
    } while (sumOfFibonacci < 4_000_000);
    System.out.println(sumOfFibonacci);
  }
}
