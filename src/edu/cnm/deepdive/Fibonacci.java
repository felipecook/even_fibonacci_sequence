package edu.cnm.deepdive;

public class Fibonacci {

//  public static void main(String[] args) {
//    long prevSumOfFibonacci = 0;
//    long currSumOfFibonacci = 1;
//    long evenSumOfFibonacci = 0;
//    long finalSumOfEven = 0;
//    do {
//      if (sumOfFibonacci % 2 == 0) {
//        evenSumOfFibonacci = sumOfFibonacci;
//        finalSumOfEven += evenSumOfFibonacci;
//      }
//      sumOfFibonacci += sumOfFibonacci;
//    } while (sumOfFibonacci <= 4_000_000);
//
//    System.out.println(sumOfFibonacci);
//    System.out.println(evenSumOfFibonacci);
//    System.out.println(finalSumOfEven);
//  }

  public static void main(String[] args) {
    long prev = 0;
    long curr = 1;
    long temp = 0;
    long evenTemp = 0;
    long currEvenTemp = 0;
    do {
      temp = prev + curr;
      if (temp % 2 == 0) {
        evenTemp = temp;
        currEvenTemp += evenTemp;
      }
      prev = curr;
      curr = temp;
    } while (temp < 4_000_000);
    System.out.println(temp);
    System.out.println(evenTemp);
    System.out.println(currEvenTemp);
  }

}
