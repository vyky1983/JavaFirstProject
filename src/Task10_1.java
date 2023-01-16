public class Task10_1 {
    public static void main(String[] args) {
        int[] num = new int[6];
        num[0] = 14;
        num[1] = 41;
        num[2] = 1;
        num[3] = 28;
        num[4] = 5;
        num[5] = 44;

        for(int i = 0; i<= num.length-1; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}

