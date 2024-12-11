package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Leader leader = new Leader();

        for (int i = 1; i < 4; i++) {

            System.out.println("Введите название автомобиля №" + i);
            String brand = scanner.nextLine();
            while (true) {
                System.out.println("Введите скорость автомобиля " + brand + " (от 0 до 250)");
                if (scanner.hasNextInt()) {
                    int speed = scanner.nextInt();
                    if (speed < 0 || speed > 250) {
                        System.out.println("Неверная скорость. Повторите ввод");
                    } else {
                        Auto auto = new Auto(brand, speed);
                        leader.identifyLeader(auto.speed, auto.brand);
                        scanner.nextLine();
                        break;
                    }
                } else {
                    scanner.nextLine();
                    System.out.println("Введите целое число. Повторите ввод");
                }
            }

        }
        scanner.close();
        System.out.println("Лидирует автомобиль " + leader.leader);

    }


}

class Auto {

    String brand;
    int speed;

    Auto(String brand, int speed) {

        this.brand = brand;
        this.speed = speed;
    }
}

class Leader {

    String leader = "";
    int distanceLeader = 0;

    void identifyLeader(int speed, String brand) {
        int distance = speed * 24;
        if (distance > distanceLeader) {
            distanceLeader = distance;
            leader = brand;
        }
    }
}
