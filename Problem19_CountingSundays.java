public class Problem19_CountingSundays {

//    Counting Sundays
//    Problem 19
//    You are given the following information, but you may prefer to do some research for yourself.
//
//    1 Jan 1900 was a Monday.
//    Thirty days has September,
//    April, June and November.
//    All the rest have thirty-one,
//    Saving February alone,
//    Which has twenty-eight, rain or shine.
//    And on leap years, twenty-nine.
//    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
//    How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?


    public static void main(String[] args) {


//        System.out.println(getNumberOfDay(1944, 2));
        int total_num_of_days = 0;
        int num_of_sundays = 1;
        for (int j = 1901; j <= 2000; j++){
            for(int i = 1; i <= 12; i++) {
                total_num_of_days += getNumberOfDay(j,i);
                if (total_num_of_days % 7 == 0) {
                    num_of_sundays += 1;
                }
            }
        }

        System.out.println("Total number of Sundays that fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000) = " + num_of_sundays);

    }

    public static boolean IsLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
    }

    public static int getNumberOfDay(int year, int month) {
        if (month == 1 || month > 2 && month <= 12) {
            if(month == 4 || month == 6|| month == 9 || month == 11) {
                return 30;
            } else {
                return 31;
            }
        } else {
            if (IsLeapYear(year)) {
                    return 29;
            } else {
                    return 28;
                }
            }
        }





}
