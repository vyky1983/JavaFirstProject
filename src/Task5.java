public class Task5 {
    public static void main(String[] args) {
        boolean goodWeather=true;
        boolean isItNightOrNot=false;

        if(isItNightOrNot){
            System.out.println(" Спать ");
        }
        if(!isItNightOrNot&&goodWeather){
            System.out.println(" Гуляьть ");
        }
        if(!isItNightOrNot&&!goodWeather){
            System.out.println(" Читать книгу ");
        }
    }
}
