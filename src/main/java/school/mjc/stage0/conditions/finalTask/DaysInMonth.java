package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public boolean isLeapYear(int year) {
        boolean result = year % 100 == 0 && year % 400 == 0 ? true : false;
        result = result == false ?
                (year % 4 == 0 && year % 100 !=0) ? true : false :
                (year % 4 == 0) ? true: false ;
        return result;
    }
    public void printDays(int year, int month) {
        boolean isLeapYear = isLeapYear(year);
        int days;
        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                days = 31;
                System.out.println(days);
                break;
            case (2):
                days = isLeapYear ? 29 : 28;
                System.out.println(days);
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                days = 30;
                System.out.println(days);
                break;
            default:
                days = 0;
                System.out.println("invalid date");
        }
    }
}
