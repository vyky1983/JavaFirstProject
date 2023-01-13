public class Boolean {
    public static void main(String[] args) {

        int temp = 30;
        boolean hot = temp > 25;
        boolean cold=temp<22;
        if (hot) {
            System.out.println(" Кондиционнер включен");
        } else if (cold) {
            System.out.println(" Кондиционнер выключен");
        } else {
            System.out.println(" Кондиционнер ничего не делает");
        }
    }
}



