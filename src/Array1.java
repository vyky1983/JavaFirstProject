public class Array1 {
    public static void main(String[] args) {
        int[] num = {25, 98, 2, 36};
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);

            if(i< num.length-1){
                System.out.print(", ");
            }else {
                System.out.print(".");
            }
           }
        System.out.println("]");
        }


    }


//