package exception.test;

import java.util.Scanner;

public class ExceptionTest {


    Double target, operator, numberToCalculate;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionTest test = new ExceptionTest();
        System.out.print("First Number : ");
        test.setTarget(sc.nextDouble());
        System.out.print("Second Number : ");
        test.setNumberToCalculate(sc.nextDouble());
        try {
            System.out.println(test.getTarget() / test.getNumberToCalculate());
        } catch (ArithmeticException e) {
            if (test.getNumberToCalculate() == 0) System.err.println("You can't divide it by zero");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Double getTarget() {
        return target;
    }

    public void setTarget(Double target) {
        this.target = target;
    }

    public Double getOperator() {
        return operator;
    }

    public void setOperator(Double operator) {
        this.operator = operator;
    }

    public Double getNumberToCalculate() {
        return numberToCalculate;
    }

    public void setNumberToCalculate(Double numberToCalculate) {
        this.numberToCalculate = numberToCalculate;
    }
}
