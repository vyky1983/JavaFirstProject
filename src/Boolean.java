public class Boolean {
    public static void main(String[] args) {

        int temp = 38;
        boolean hot = temp > 25;
        boolean cold = temp < 22;
        int time = 23;
        boolean isNight = time > 22 || time < 6;
        if (hot && !isNight) {
            System.out.println(" Кондиционнер включен");
        } else if (cold) {
            System.out.println(" Кондиционнер выключен");
        } else {
            System.out.println(" Кондиционнер ничего не делает");
        }
    }
}



