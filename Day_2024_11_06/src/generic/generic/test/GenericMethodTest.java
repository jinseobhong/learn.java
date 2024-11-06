package generic.generic.test;

public class GenericMethodTest {
    Integer integer;
    Double dble;

    public static void main(String[] args) {
        GenericMethodTest test = new GenericMethodTest();
        test.setInteger(10);
        test.print(test.integer);
    }

    public <T> void print(T t) {
        System.out.println(t);
    }


    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Double getDble() {
        return dble;
    }

    public void setDble(Double dble) {
        this.dble = dble;
    }
}
