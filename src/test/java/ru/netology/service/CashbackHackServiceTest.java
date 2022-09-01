package ru.netology.service;

//import org.junit.jupiter.api.Test;

import org.testng.annotations.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void calculateCashback() {


        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    void calculateCashback800() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    void calculateCashback3000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}
