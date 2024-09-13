package nau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static String readNumbers(String fileName) {
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(fileName);
        if (inputStream != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return "";
        }
    }

    public static void testGCD(int[] numbers) {
        GCD gcd = new GCD();

        long startTime = System.nanoTime();
        int result = gcd.findGCD(numbers);
        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Result: " + result + ". Time of execution: " + duration + " ms");
    }

    public static void main(String[] args) {
        int[] numbers1000 = Arrays.stream(readNumbers("Numbers_1000.txt").split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers10000 = Arrays.stream(readNumbers("Numbers_10000.txt").split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers100000 = Arrays.stream(readNumbers("Numbers_100000.txt").split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        testGCD(numbers1000);
        testGCD(numbers10000);
        testGCD(numbers100000);
    }
}