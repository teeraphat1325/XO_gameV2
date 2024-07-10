/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.xo_game;

import java.util.Scanner;

/**
 *
 * @author teeraphat
 */
public class XO_game {

    private static char[][] table = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    private static char turn = 'X';
    private static Scanner sc = new Scanner(System.in);
    private static int row;
    private static int col;

    public static void main(String[] args) {
        printWelcome();
        showTable();
        showTurn();
        switchTurn();
        intpuRowCol();

    }

    private static void printWelcome() {
        System.out.println("Welcome to my XO Game");
    }

    private static void showTable() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(table[r][c] + " ");
            }
            System.out.println(" ");
        }
    }

    private static void showTurn() {
        System.out.println("Turn " + turn);
    }

    private static void switchTurn() {
        if (turn == 'X') {
            turn = 'O';
        } else {
            turn = 'X';
        }
    }

    private static void intpuRowCol() {
        System.out.print("please enter(row,col) : ");
        row = sc.nextInt();
        col = sc.nextInt();
        System.out.println(row+" "+col);
    }
}
