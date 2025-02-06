package elements;

public class Dice {

    public Dice(){

    }

    public int launch(){
        return (int)(Math.random()*6+1);
    }

//    TODO: Probar
    public int multiLaunch(int launches) {
        int total = 0;
        for (int i = 1; i<= launches; i++) {
            total = total + launch();
        }
        return total;
    }
}