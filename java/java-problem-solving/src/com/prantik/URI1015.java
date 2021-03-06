package com.prantik;
// URI Online Judge | 1015 | Distance Between Two Points | Java 8 | +1.9

import java.util.Scanner;

public class URI1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt( ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) );

        System.out.printf("%.4f\n", distance);
    }

}
