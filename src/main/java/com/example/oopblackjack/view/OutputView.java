package com.example.oopblackjack.view;

public class OutputView {

    public static void printGameStartMessage() {
        System.out.println("======BlackJack Start");
        System.out.println("최초 2장의 카드를 뽑습니다.");
    }

    public static void turnMessage(String name) {
        System.out.println(name + "님의 차례 입니다.");
    }

    public static void DrawMessage(String name) {
        System.out.println(name + "님이 카드를 뽑았습니다.");
    }

    public static void bustMessage(String name) {
        System.out.println(name + "의 숫자의 합이 21을 넘어서 패배하였습니다.");
    }

    public static void winningMessage(String name) {
        System.out.println(name + "이 승리하였습니다.");
    }
}
