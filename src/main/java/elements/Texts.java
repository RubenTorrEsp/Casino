package elements;

public class Texts {

    public String wellcome = "Bienvenido a la app de casino. ¿A qué desea jugar?";
    public String availableGames = "1. BlackJack.\n2. Carta más alta.";

    public String notImplemented = "Todavía no se puede. Pronto llegará.";

    public String blackJackGameContinue = "\n¿Que desea hacer a continuacion?\n1. Separar cartas\n2. Pedir nueva carta\n3. Plantarse";

    public String stucked(int quantity){
        return "Te has plantado con " + quantity + " puntos. A ver si hay suerte.";
    }
    public String totalValue(int quantity){
        return "El valor total de sus cartas es " + quantity + ".";
    }
    public String crupierValue(int quantity) { return "El crupier ha sacado "+ quantity +" puntos."; }

}
