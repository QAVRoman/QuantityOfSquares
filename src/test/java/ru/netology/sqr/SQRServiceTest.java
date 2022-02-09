package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Проверить диапозон от 200 до 300',200,300,3",
            "'Проверить диапозон от 201 до 300',201,300,3",
            "'Проверить диапозон от 202 до 300',200,299,3",
            "'Проверить диапозон от 250 до 300',250,300,2",
            "'Проверить диапозон от 100 до 1000',100,1000,22",
            "'Проверить диапозон от 101 до 1000',101,1000,21",
            "'Проверить диапозон от 102 до 1000',102,1000,21",
            "'Проверить диапозон от 103 до 1000',103,1000,21",
            "'Проверить диапозон от 100 до 999',100,999,22",
            "'Проверить диапозон от 100 до 1001',100,1001,22",
            "'Проверить диапозон от 1000 до 1000000',100,1000000,89"})
    void countSquare(String testName, int lowLimit, int uplimit, int expected) {
        SQRService run = new SQRService();

        int actual = run.countSquare(lowLimit, uplimit);
        assertEquals(expected, actual);
    }
}