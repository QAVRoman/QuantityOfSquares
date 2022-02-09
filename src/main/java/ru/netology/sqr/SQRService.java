package ru.netology.sqr;

public class SQRService {
    public int countSquare(int lowLimit, int uplimit) {
        int num = 0;
        for (int i = 10; i < 99; i++) {
            int squares = i * i;
            if (squares >= lowLimit && squares <= uplimit) {
                num++;
            }
        }
        return num;
    }
}