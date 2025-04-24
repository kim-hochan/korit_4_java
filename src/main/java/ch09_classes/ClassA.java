package ch09_classes;

import java.util.Scanner;

public class ClassA {
    int num;
    String name;
    double score;
    public void callName() {
        System.out.println(name + "을 부릅니다.");
    }

    public void displayProfile() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(num + "학번의 학생의 이름은" + name + "이고, " + score + "입니다. ");

    }

}