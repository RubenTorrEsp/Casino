package elements;

import java.util.List;

public class Dado {

    public Dado(){

    }

    public int lanzar(){
        int resultado = (int)(Math.random()*6+1);
        return resultado;
    }

}
