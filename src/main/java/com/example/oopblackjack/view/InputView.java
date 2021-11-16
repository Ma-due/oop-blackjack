package com.example.oopblackjack.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public int inputDrawCardOpt() {
        System.out.println("카드를 더 뽑으시겠습니까? 뽑으려면 1, 아니면 2");
        String s = scanner.nextLine();

        /* 검증 */

        return Integer.parseInt(s);
    }
}
