/*
@Author Anthony Garzon
@Date 9/29/2018
@Program Number Of Days In Month
@Description Create a method called getDaysInMonth provided with parameters month and year both of type int. It should
return number of days in a month.
Hints: Using a switch statement would probably be the best and cleanest way to code the month part. However be careful
for leap years. That is why we require the previous isLeapYear method coded to help us with this solution. We can call
our isLeapYear method in getDaysInMonth method and pass year as a parameter to check for leap years.
 */
public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        int check = getDaysInMonth(1,2020);
        System.out.println(check);//should return 31 days
        int check2 = getDaysInMonth(2,2020);
        System.out.println(check2);//should return 29 since February has 29 days in a leap year and 2020 is a leap year
        int check3 = getDaysInMonth(2,2018);//should return 28 since February has 28 days if it is not a leap year and
        //2018 is not a leap yer
        System.out.println(check3);
        int check4 = getDaysInMonth(-1,2020);//should return -1 since month is not valid
        System.out.println(check4);
        int check5 = getDaysInMonth(1,-2020);//should return -1 since year is not valid
        System.out.println(check5);
    }

    public static boolean isLeapYear(int year){
        if((year < 1) || (year > 9999)){
            return false;
        }else{
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year){
        boolean leapYear = isLeapYear(year);
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }else{
            switch(month){
                case 1:
                    return 31;

                case 2:
                    if(leapYear)
                        return 29;
                    else
                        return 28;

                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;

            }
        }
    }
}
