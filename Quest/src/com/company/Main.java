package com.company;

import java.util.Scanner;

public class Main {
    public static Character boyfriend;
    public static Story story;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=============ПРИКЛЮЧЕНИЕ ЗЕФИРКИ==============");
        System.out.println("Добро пожаловать в мир зефирок!\nКак тебя будут звать?");
        System.out.print("Введите имя зефирки:");
        Character zef = new Character(in.next());
        story = new Story(zef.name);
        while (true) {
            zef.M+= story.current_situation.dM;
            zef.K += story.current_situation.dK;
            zef.S += story.current_situation.dS;
            System.out.println(zef.name+"\n=====\nМягкость:" + zef.M + "\tСладость:"
                    + zef.S + "\tКрепкость:" + zef.K + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }
    }
}
