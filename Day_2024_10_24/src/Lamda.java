interface Add {
    int add(int x, int y);
}

public class Lamda {
    public static void main(String[] args) {
        // Implicit with lambda expressions
        Add lambda = (x, y) -> { return x + y; }; // 람다식 끝에 세미콜론을 잊지말자
        
        int result = lambda.add(1, 2);
        System.out.println(result);
    }
}