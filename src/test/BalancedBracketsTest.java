package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void Grapes() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void Cantaloupe() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void Durian() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void Strawberry() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void Apple() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void Orange() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void DragonFruit() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void Kiwano() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void Banana() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void Kiwi() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("][[]"));
    }

    @Test
    public void ScrewPine() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
    }

    @Test
    public void Pineapple() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]][["));
    }
}