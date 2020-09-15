package com.dovile.bonusdatesbetween;

public class DatesBetween {

    static void printBonusDatesBetween(int fromYear, int toYear) {

        if (String.valueOf(fromYear).length() == 4 && String.valueOf(toYear).length()==4 && fromYear<toYear ) {
            while (fromYear <= toYear) {
                String s = String.valueOf(fromYear);
                String day_1 = String.valueOf(s.charAt(0));
                String day_2 = String.valueOf(s.charAt(1));
                int day = Integer.parseInt(day_2 + day_1);
                String month_1 = String.valueOf(s.charAt(2));
                String month_2 = String.valueOf(s.charAt(3));
                int month = Integer.parseInt(month_2 + month_1);
                if (month > 0 && month < 13 && day > 0 && day < 32) {
                    switch (month) {
                        case 2:
                            if (day < 29) {
                                System.out.println(fromYear + "-" + month_2 + month_1 + "-" + day_2 + day_1);
                            }
                            break;
                        case 4:
                            if (day < 31) {
                                System.out.println(fromYear + "-" + month_2 + month_1 + "-" + day_2 + day_1);
                            }
                            break;
                        case 6:
                            if (day < 31) {
                                System.out.println(fromYear + "-" + month_2 + month_1 + "-" + day_2 + day_1);
                            }
                            break;
                        case 9:
                            if (day < 31) {
                                System.out.println(fromYear + "-" + month_2 + month_1 + "-" + day_2 + day_1);
                            }
                            break;
                        case 11:
                            if (day < 31) {
                                System.out.println(fromYear + "-" + month_2 + month_1 + "-" + day_2 + day_1);
                            }
                            break;
                        default:
                            System.out.println(fromYear + "-" + month_2 + month_1 + "-" + day_2 + day_1);
                    }
                }
                fromYear++;
            }
        } else {
            System.out.println("Problem with enters Years, please check conditions!!");
        }
    }


    public static void main(String[] args) {
        printBonusDatesBetween(1000,9999);
    }
}
