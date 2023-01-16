public class Task10_2 {
    public static void main(String[] args) {
        String[] name = {"Alexandru", "Veronica", "Andreea", "Sanicica"};
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i] + " ");
        }
    }
}
