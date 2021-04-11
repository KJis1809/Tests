package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.netology.Main.isInputValid;
import static ru.netology.Main.isYearLeap;

public class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {2000, 2008, 2096, 2400})
    void isYearLeap_true(Integer argument) {
        boolean condition = isYearLeap(argument);
        assertTrue(condition);
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100, 2200, 2300})
    void isYearLeap_false(Integer argument) {
        boolean condition = isYearLeap(argument);
        assertFalse(condition);
    }

    @ParameterizedTest
    @ValueSource(ints = {1000, 1300, 1560, 1770})
    void isInputValid_true(Integer argument) {
        boolean condition = isInputValid(argument);
        assertTrue(condition);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 457, 999, -457})
    void isInputValid_false(Integer argument) {
        boolean condition = isInputValid(argument);
        assertFalse(condition);
    }
}
