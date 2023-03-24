package elements;

public class Pocket {
    int number;
    Boolean isBlack;
    Boolean isPair;
    Boolean isPass;

    public Pocket(){
        newLaunch();
    }

    public void newLaunch(){
        number = (int)(Math.random()*36);
    }
}
