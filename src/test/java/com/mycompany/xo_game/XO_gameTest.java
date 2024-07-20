/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.xo_game;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author teeraphat
 */
public class XO_gameTest {

    public XO_gameTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class XO_game.
     */
    @Test
    public void switchTurn_X_O() {
        char turn = 'X';
        char result = XO_game.switchTurn(turn);
        assertEquals('O', result);
    }

    @Test
    public void checkRow_Row0_true_ByX() {
        char[][] table = {{'X', 'X', 'X'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        int row = 0;
        boolean result = XO_game.checkRow(table, turn, row);
        assertTrue(result);
    }
    
    @Test
    public void checkRow_Row1_true_ByO() {
        char[][] table = {{'-', '-', '-'}, {'O', 'O', 'O'}, {'-', '-', '-'}};
        char turn = 'O';
        int row = 1;
        boolean result = XO_game.checkRow(table, turn, row);
        assertTrue(result);
    }
    
    @Test
    public void checkRow_Row1_false() {
        char[][] table = {{'-', '-', '-'}, {'O', 'O', '-'}, {'-', '-', '-'}};
        char turn = 'O';
        int row = 1;
        boolean result = XO_game.checkRow(table, turn, row);
        assertFalse(result);
    }
}
