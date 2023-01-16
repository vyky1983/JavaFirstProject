public class Task10 {
    public static void main(String[] args) {
        int[] num={45, 98, 2, 69, 125, 789};
        System.out.print("[");
        for(int i =num.length-1; i>=0;i--){
            System.out.print(num[i]+", ");

//            if(i< num.length-1){
//                System.out.print(".");
//            }else {
//                System.out.print(", ");
//            }
        }
        System.out.print("]");
    }
}
