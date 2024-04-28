package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions;

import com.halconbit.challenge.java.lambda.helloworld.HelloWorldTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.callable.SumOfNumberUsingCallable;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.consumer.ConsumerExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.function.FunctionExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.predicate.PredicateExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.predicateandbiconsumer.PredicateAndBiConsumerExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.supplier.SupplierExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.unaryoperator.BinaryOperatorExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.unaryoperator.UnaryOperatorExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.ConcatenateLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.traditional.ConcatenateTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.HelloWorldLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.IncrementByFiveInterfaceLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.traditional.IncrementByFiveTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.runnable.RunnableExampleLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.runnable.RunnableExampleTraditional;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brayan Esteves
 */
public class Main {
    
    // ==================== //
    // TRADITIONAL. //
    private static HelloWorldTraditional helloWorldTraditional;
    private static IncrementByFiveTraditional incrementByFiveTraditional;
    private static ConcatenateTraditional concatenateTraditional;
    // TRADITIONAL RUNNABLE. //
    private static RunnableExampleTraditional runnableExample;
    // ==================== //
    // LAMBDA. //
    private static HelloWorldLambda helloWorldLambda;
    private static IncrementByFiveInterfaceLambda incrementByFiveInterfaceLambda;
    private static ConcatenateLambda concatenateLambda;
    // LAMBDA RUNNABLE. //
    private static RunnableExampleLambda runnableExampleLambda;
    // LAMBDA CALLABLE. //
    private static SumOfNumberUsingCallable sumOfNumberUsingCallable;
    // CONSUMER. //
    private static ConsumerExample consumerExample;
    // PREDICATE. //
    private static PredicateExample predicateExample;
    // PREDICATE & BICONSUMER. //
    private static PredicateAndBiConsumerExample predicateAndBiConsumerExample;
    // FUNCTION. //
    private static FunctionExample functionExample;
    // UNARY OPERATOR. //
    private static UnaryOperatorExample unaryOperatorExample;
    // BIOPERATOR //
    private static BinaryOperatorExample binaryOperatorExample;
    // SUPPLIER //
    private static SupplierExample supplierExample;
    // ==================== //
    
    public Main() {
        // ==================== //
        // TRADITIONAL. //
        helloWorldTraditional      = new HelloWorldTraditional();
        incrementByFiveTraditional = new IncrementByFiveTraditional();
        concatenateTraditional     = new ConcatenateTraditional();
        // TRADITIONAL RUNNABLE. //
        runnableExample = new RunnableExampleTraditional();
        // ==================== //
        // LAMBDA. //
        helloWorldLambda               = new HelloWorldLambda();
        incrementByFiveInterfaceLambda = new IncrementByFiveInterfaceLambda();
        concatenateLambda              = new ConcatenateLambda();
        // LAMBDA RUNNABLE. //
        runnableExampleLambda = new RunnableExampleLambda();
        // LAMBDA CALLABLE. //
        sumOfNumberUsingCallable = new SumOfNumberUsingCallable();
        // CONSUMER. //
        consumerExample = new ConsumerExample();
        // PREDICATE //
        predicateExample = new PredicateExample();
        // PREDICATE & BICONSUMER //
        predicateAndBiConsumerExample = new PredicateAndBiConsumerExample();
        // FUNCTION //
        functionExample = new FunctionExample();
        // UNARY OPERATOR //
        unaryOperatorExample = new UnaryOperatorExample();
        // BIOPERATOR //
        binaryOperatorExample = new BinaryOperatorExample();
        // SUPPLIER //
        supplierExample = new SupplierExample();
        // ==================== //
    }
    
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("TRADITIONAL");
        System.out.println(Main.helloWorldTraditional.sayHelloWorld());
        System.out.println();
        System.out.println(Main.incrementByFiveTraditional.incrementByFive(2));
        System.out.println();
        System.out.println(Main.concatenateTraditional.sconcat("Hello", "World!"));
        System.out.println("TRADITIONAL RUNNABLE");
        Main.runnableExample.runnableExample();
        System.out.println("====================");
        
        System.out.println("====================");
        System.out.println("LAMBDA");
        System.out.println(Main.helloWorldLambda.HelloWorldInterface());
        System.out.println();
        System.out.println(Main.helloWorldLambda.HelloWorldInterfaceSingle());
        System.out.println();
        System.out.println(Main.incrementByFiveInterfaceLambda.IncrementByFive(2));
        System.out.println(Main.incrementByFiveInterfaceLambda.IncrementByFiveSingle(2));
        System.out.println();
        System.out.println(Main.concatenateLambda.Concatenate("Hello", "World!"));
        System.out.println(Main.concatenateLambda.ConcatenateSingle("Hello", "World!"));
        System.out.println("LAMBDA RUNNABLE");
        Main.runnableExampleLambda.runnableExample();
        Main.runnableExampleLambda.threadExampleWithLambda();
        System.out.println("LAMBDA CALLABLE");
        try {
            Main.sumOfNumberUsingCallable.callableLambda();
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("LAMBDA CONSUMER");
        Main.consumerExample.consumerString();
        Main.consumerExample.consumerInteger();
        Main.consumerExample.consumerObjectInstructor();
        System.out.println("INT, LONG & DOUBLE (CONSUMER)");
        Main.consumerExample.intConsumer();
        Main.consumerExample.longConsumer();
        Main.consumerExample.doubleConsumer();
        System.out.println("BICONSUMER");
        Main.consumerExample.biConsumer_PrintingTwoNumbers(2, 4);
        Main.consumerExample.biConsumer_CalculatingTwoNumbers(2, 4);
        Main.consumerExample.biConsumer_ConcatenateString("Fell on", "deaf ears");        
        Main.consumerExample.biConsumer_PrintNameAndGender();
        Main.consumerExample.biConsumer_PrintNameAndListCourses();
        Main.consumerExample.biConsumer_PrintNameAndGenderAllInstructors();        
        System.out.println("LAMBDA PREDICATE");
        Main.predicateExample.predicate_ReturnTrueOrFalse();
        Main.predicateExample.predicate_NumberGreatherTenAndNumberIsEvenNumber();
        Main.predicateExample.predicate_NumberGreatherTenOrNumberIsEvenNumber();
        Main.predicateExample.predicate_GreatherThanTenAndNotEqualZero();
        System.out.println("OBJECT");
        Main.predicateExample.predicate_AllInstructorWhoTeachesOnline();
        Main.predicateExample.predicate_IsInstructorTeachesOnlineAndExperienceIsGreatherThanTen();
        System.out.println("INT, LONG & DOUBLE (PREDICATE)");
        Main.predicateExample.intPredicate();
        Main.predicateExample.longPredicate();
        Main.predicateExample.doublePredicate();
        System.out.println("PREDICATE & BICONSUMER");
        Main.predicateAndBiConsumerExample.allInstructorWhoTeachesOnline();
        System.out.println("BIPREDICATE");
        Main.predicateExample.allInstructorWhoTeachesOnline();
        System.out.println("FUNCTION");
        Main.functionExample.squareRoot(64);
        Main.functionExample.squareRoot(81);
        Main.functionExample.toLowerCase("PROGRAMMING");
        Main.functionExample.concatenate("PROGRAMMING", "In Java");
        Main.functionExample.toLowerCaseAndConcatenate("PROGRAMMING", "In Java");
        Main.functionExample.toLowerCaseAndConcatenateWithCompose("PROGRAMMING", "In Java");
        System.out.println("OBJECT");
        Main.functionExample.mapOfInstructorsWithNameAndYearsOfExperience();
        Main.functionExample.mapOfInstructorsWithNameAndYearsOfExperiencePredicate();
        System.out.println("BIFUNCTION");
        Main.functionExample.biFunction_TwoInputs();
        System.out.println("UNARY OPERATOR");
        Main.unaryOperatorExample.multiply(100);
        Main.functionExample.multiply(100);
        System.out.println("INT, LONG & DOUBLE (UNARY)");
        Main.unaryOperatorExample.intUnaryOperator(100);
        Main.unaryOperatorExample.longUnaryOperator(10000000000000000L);
        Main.unaryOperatorExample.doubleUnaryOperator(2000000.20000000);
        System.out.println("BIOPERATOR");
        Main.binaryOperatorExample.biOperator_Integer(2, 4);
        Main.binaryOperatorExample.biOperatorWithComparatorMax_Integer(7, 8);
        Main.binaryOperatorExample.biOperatorWithComparatorMin_Integer(7, 8);
        System.out.println("INT, LONG & DOUBLE (BINARY OPERATOR)");
        Main.binaryOperatorExample.intBiOperatorWithComparatorMultiply_Integer(2, 4);
        Main.binaryOperatorExample.longBiOperatorWithComparatorMultiply_Long(20000000L, 22222222222222222L);
        Main.binaryOperatorExample.doubleBiOperatorWithComparatorMultiply_Double(2222.22222, 22222222222222.22222);
        System.out.println("SUPPLIER");
        Main.supplierExample.supplier_Integer();
        System.out.println("====================");
    }
}