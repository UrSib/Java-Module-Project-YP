package org.example;

public class Leader {
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
