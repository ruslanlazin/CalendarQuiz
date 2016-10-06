package ua.pp.lazin;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        boolean isLeap;
        int count = 0;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int firstDayOfMonth = 3;  //the 1-st January 1901 was TUESDAY.
        for (int year = 1901; year < 2001; year++) {
            if (year % 4 == 0 && (year % 100 != 0 || year / 400 == 0)) {
                isLeap = true;
            } else {
                isLeap = false;
            }
            for (int month = 0; month < 12; month++) {
                if (firstDayOfMonth % 7 == 1) {
                    count++;
                }
                firstDayOfMonth += daysInMonth[month];
                if (month == 1 && isLeap) {
                    firstDayOfMonth++;
                }
            }
        }
        System.out.println(count);          //Answer: 171
    }
}
