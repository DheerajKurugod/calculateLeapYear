public class LeapYear {

    public static void main(String[] args) {

        boolean x = isLeapYear(-1200);
        System.out.println(x);
    }

 /*   public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if(year%4 == 0){
                if (year%100 == 0){
                    if (year%400 == 0){
                    return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }*/

        public static boolean isLeapYear(int year){
            if ((year >=1 && year <=9999 ) && ( (year %4==0 && year %100!=0) ||(year %4==0 && year %400==0))) {
                return true;

            }else
                return false;
        }
    }
