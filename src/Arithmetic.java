public class Arithmetic <N1 extends Number, N2 extends Number> {
    N1 n1;
    N2 n2;
    public Arithmetic (N1 n1, N2 n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double add() {
        return (n1.doubleValue() + n2.doubleValue());
    }
    public double subtract() {
        return (n1.doubleValue() - n2.doubleValue());
    }
    public double multiply() {
        return (n1.doubleValue() * n2.doubleValue());
    }
    public double divide() {
        return (n1.doubleValue() / n2.doubleValue());
    }
    public double getMin() {
        return Math.min(n1.doubleValue(), n2.doubleValue());
    }
    public double getMax() {
        return Math.max(n1.doubleValue(), n2.doubleValue());
    }
}
//        Arithmetic
//        The Arithmetic class has a constructor that will take
//        two Numbers -- wherein a double, float, int, short, long are considered numbers.
//        These numbers may not be of the same data type.
//        In storing them in the class, they should keep their original data types
//        as how they were declared to be i.e. do not typecast them to float or double
//        upon assignment. You may typecast them in operations.
//        Example:
//        Accepted use of constructors:
//        - (int, float)
//        - (int, int)
//        - (short, long)
//        - (double, short)
//        - and others
//        Not accepted:
//        - (char, int)
//        - (short, boolean)
//        - or any data type that is not a number
//
//        The operations are as follows wherein they would perform the operations
//        on those two numbers and return the result:
//        - add()
//        - subtract()
//        - multiply()
//        - divide()
//        - getMin()
//        - getMax()