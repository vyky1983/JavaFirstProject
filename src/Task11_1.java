public class Task11_1 {
    public static void main(String[] args) {
        String nameOfMonth = "May";
        switch (nameOfMonth) {
            case "December":
            case "January":
            case "February":
                System.out.println("Зима");
                break;
            case "Math":
            case "April":
            case "May":
                System.out.println("Весна");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Лето");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Error");


        }
    }
}