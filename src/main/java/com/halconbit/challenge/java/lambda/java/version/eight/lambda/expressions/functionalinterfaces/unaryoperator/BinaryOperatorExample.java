package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.unaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    
    public void biOperator_Integer(int x, int y) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(x, y));
    }
    
    public void biOperatorWithComparatorMax_Integer(int x, int y) {
        Comparator<Integer> comparator            = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBinaryOperator = BinaryOperator.maxBy(comparator);
        System.out.println(maxBinaryOperator.apply(x, y));
    }
    
    public void biOperatorWithComparatorMin_Integer(int x, int y) {
        Comparator<Integer> comparator            = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBinaryOperator = BinaryOperator.minBy(comparator);
        System.out.println(maxBinaryOperator.apply(x, y));
    }
    
    public void intBiOperatorWithComparatorMultiply_Integer(int x, int y) {
        IntBinaryOperator intBinaryOperator = (a, b) -> a * b;
        System.out.println(intBinaryOperator.applyAsInt(x, y));
    }
    
    public void longBiOperatorWithComparatorMultiply_Long(Long x, Long y) {
        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
        System.out.println(longBinaryOperator.applyAsLong(x, y));
    }
    
    public void doubleBiOperatorWithComparatorMultiply_Double(double x, double y) {
        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
        System.out.println(doubleBinaryOperator.applyAsDouble(x, y));
    }
    
}