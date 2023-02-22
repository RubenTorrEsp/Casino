package elements;

public class Dice {

    public Dice(){

    }

    public int launch(){
        int result = (int)(Math.random()*6+1);
        return result;
    }

}
