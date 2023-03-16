package elements;

public class Texts {

    public String blackJackGameContinue = "\n¿Que desea hacer a continuacion?\n1. Separar cartas\n2. Pedir nueva carta\n3. Plantarse";
    public String notImplemented = "Todavía no se puede. Pronto llegará.";

    public String stucked(int quantity){
        return "Te has plantado con " + quantity + " puntos. A ver si hay suerte.";
    }

    public String totalValue(int quantity){
        return "El valor total de sus cartas es " + quantity + ".";
    }

}
