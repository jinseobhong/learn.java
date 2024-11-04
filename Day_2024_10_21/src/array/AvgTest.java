package array;

import java.util.Scanner;

public class AvgTest {

    private Double avg;
    private Scanner sc;

    public static void main(String[] args) {
        // Calculate the total and average of people's Korean scores
        AvgTest avg = new AvgTest();
        avg.sc = new Scanner(System.in);
        System.out.print("Students : ");
        int countOfStudents = avg.sc.nextInt();
        int[] scores = new int[countOfStudents];
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print("score of " + (i + 1) + "th student :");
            scores[i] = avg.sc.nextInt();
            total += scores[i];
        }
        avg.avg = (double) total / countOfStudents;
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg.avg);
    }

}
