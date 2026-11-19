import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[50];

        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(50) + 1; }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | "); }

        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i]; }

        double average = (double) sum / dataPoints.length;

        System.out.println();
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }
}