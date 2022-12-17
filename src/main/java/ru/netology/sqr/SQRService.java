package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int min, int max) {
        int result = 0;
        for (int i = 10; i <= 99; i++){
            int j = i * i;
            if (j >= min && j <= max) {
                result++;
            }
        }
        return (result);
    }
}
