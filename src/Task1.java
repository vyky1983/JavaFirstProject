public class Task1 {
    public static void main(String[] args) {
        int day=10000;
        int year=day/365;
        int weeks=day%365/30;
        int leftDay=day-(year*365)-(weeks*30);
        System.out.println(year);
        System.out.println(weeks);
        System.out.println(leftDay);


//        int day=365;
//        int years=day/365;
//        int months=(day-(years*365))/30;
//        int leftDays= day-(years*360)-(months*30);
//
//        System.out.println(years);
//        System.out.println(months);
//        System.out.println(leftDays);

    }
}
