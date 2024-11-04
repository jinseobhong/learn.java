
public class Operator6 {

    public static void main(String[] args) {
        // TODO : Understanding casting operators

        // Logical operators

        // && : and, Returns true only when both sides are true (when both condition expressions 1 and 2 are true)
        // Conditional expression 1 && Conditional expression 2
        int number = 10;
        if (number > 5 && number++ > 10) {
            System.out.println(true);
        }
        // || : or, Returns true if either side is true (when at least one of conditional expressions 1 and 2 is true)
        // Conditional expression 1 || Conditional expression 2
        number = 10;
        if (number < 5 || number++ > 8) {
            System.out.println(true);
        }
        // ! : not, Reverse the evaluation result of a logical value(True→False)
        if (!(number > 5)) {
            System.out.println(true);
        }
    }

}
