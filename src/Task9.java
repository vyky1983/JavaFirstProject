public class Task9 {
    public static void main(String[] args) {
        String[] nameMonths = new String[12];
        nameMonths[0] = "Январь";
        nameMonths[1] = "Февраль";
        nameMonths[2] = "Март";
        nameMonths[3] = "Апрель";
        nameMonths[4] = "Май";
        nameMonths[5] = "Июнь";
        nameMonths[6] = "Июль";
        nameMonths[7] = "Август";
        nameMonths[8] = "Сентябрь";
        nameMonths[9] = "Октябырь";
        nameMonths[10] = "Ноябырь";
        nameMonths[11] = "Декабырь";

        System.out.print("[");
        for (int i = 0; i < nameMonths.length; i++) {
            System.out.print(nameMonths[i]);
            if (i == nameMonths.length-1) {
                System.out.print(".");

            } else {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
