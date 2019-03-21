package StressExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Average {

    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> newList = new ArrayList<>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        newList.add(a);
        newList.add(b);
        newList.add(b);

        Iterator iter = newList.iterator();
        int sum = 0;
        while (iter.hasNext()){
            sum+= (int) iter.next();

        }
    }
}
