package elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pocket {

    List<Integer> blackNumbers = new ArrayList<>(Arrays.asList(
            2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35
    ));

    public Pocket(){}

    public int newLaunch(){
        Random r = new Random();
        return r.nextInt(37);
    }

    public Boolean isBlack(int number){
        return blackNumbers.contains(number);
    }

    public Boolean isPair(int number){ return number % 2 == 0; }

    public Boolean isPass(int number){
        return number >= 18;
    }
}