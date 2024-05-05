import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many integers you want to enter? ");
        int num = scanner.nextInt();

        System.out.println("Enter " + num + " integers: ");
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }


        System.out.print("Your array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        numbers = sortArray(numbers);


        System.out.println("\nMedian of the array is: " + getMedian(numbers));
    }


    public static double getMedian(int[] series) {
        double median = 0;
        series = sortArray(series);
        if (series.length % 2 == 0){
            median = (series[series.length/2] + series[(series.length/2)-1]) /(double)2 ;

        } else {
            median = series[(series.length-1)/2];
        }

        return median;
    }






    public static int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]){
                    temp = array[i];
                array[i] = array[j];
                array[j] = array[i];
                }
            }
        }
        return array;
    }









}