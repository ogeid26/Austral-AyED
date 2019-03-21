package StressExercises;

public class TimesPrint {

    //Clase del 21 de marzo.

    public static void timesPrint(int a, int b){

        for (int i  = 0; i < b; i++){
            System.out.print(a);

        }
    }

    public static void main(String[] args){

        TimesPrint.timesPrint(3, 6);
    }
}
