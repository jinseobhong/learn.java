package generic.hierarchy.test;


public class GenericBoundTypeTest {

    Integer result;

    public static void main(String[] args) {
        GenericBoundTypeTest test = new GenericBoundTypeTest();
        test.setResult(test.max(2, 1));
        System.out.println(test.getResult());
    }

    // Bound type : Only objects of the appropriate type can be assigned as parameters.
    public <T extends Comparable<T>> T max(T target, T value) {
        return target.compareTo(value) > 0 ? target : value;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
