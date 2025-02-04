package elements;

public class Dice {

    public Dice(){

    }

    public int launch(){
        return (int)(Math.random()*6+1);
    }

    public int doubleLaunch() {
        return launch()+launch();
    }

}