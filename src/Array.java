public class Array {
    public static void main(String[] args) {
        String[] d = new String[12];
        d[0] = "Январь";
        d[1] = "Февраль";
        d[2] = "Март";
        d[3] = "Апрель";
        d[4] = "Май";
        d[5] = "Июнь";
        d[6] = "Июль";
        d[7] = "Август";
        d[8] = "Сентябрь";
        d[9] = "Октябрь";
        d[10] = "Ноябрь";
        d[11] = "Декабрь";
        System.out.print("[");
        for (int i = 0; i < 12; i++) {

            System.out.print(d[i]+", ");

        }System.out.print(".]");


    }
}
