package elements;

public class Texts {

    public String wellcome = "Bienvenido a la app de casino. ¿A qué desea jugar?";
    public String availableGames =
            "0. Salir" +
            "\n1. BlackJack." +
            "\n2. Carta alta.";

    public String quantityToPlay = "¿Cuanto quieres apostar?";
    public String notImplemented = "Todavía no se puede. Pronto llegará.";
    public String thanks = "Gracias por jugar. Vuelva pronto.";
    public String notAvailable = "Opción no disponible. Seleccione otra.";

    public String highCardWellcome = "Bienvenido a la mesa de Carta Alta. Ganará el jugador que saque la carta más alta.";

    public String blackJackWellcome = "Bienvenido a la mesa de BlackJack";
    public String blackJackGameContinue = "\n¿Que desea hacer a continuacion?\n1. Separar cartas\n2. Pedir nueva carta\n3. Plantarse";

    public String stucked(int quantity){
        return "Te has plantado con " + quantity + " puntos. A ver si hay suerte.";
    }
    public String correctBet(int quantity) {return "Genial! Ahora tienes "+quantity+" euros en fichas. Gástalos bien.";}
    public String totalValue(int quantity){
        return "El valor total de sus cartas es " + quantity + ".";
    }
    public String crupierValue(int quantity) { return "El crupier ha sacado "+ quantity +" puntos."; }

}
