package utils;

public class Texts {

    //General texts
    public String wellcome = "Bienvenido a la app de casino. ¿A qué desea jugar?";
    public String availableGames =
            "0. Salir" +
            "\n1. BlackJack." +
            "\n2. Carta alta." +
            "\n3. Ruleta." +
            "\n4. Dados.";
    public String quantityToPlay = "¿Cuanto quieres apostar?";
    public String notImplemented = "Todavía no se puede. Pronto llegará.";
    public String thanks = "Gracias por jugar. Vuelva pronto.";
    public String notAvailable = "Opción no disponible. Seleccione otra.";
    public String correctBet(int quantity) { return "Genial! Ahora tienes "+quantity+" euros en fichas. Gástalos bien.";}
    public String crupierValue(int quantity) { return "El crupier ha sacado "+ quantity +" puntos.";}
    public String notValidValue(String quantity) { return quantity +" no es un número válido";}

    //BlackJack texts
    public String blackJackWellcome = "Bienvenido a la mesa de BlackJack";
    public String blackJackGameContinue = "\n¿Que desea hacer a continuacion?\n1. Separar cartas\n2. Pedir nueva carta\n3. Plantarse";
    public String stucked(int quantity){ return "Te has plantado con " + quantity + " puntos. A ver si hay suerte.";}
    public String totalValue(int quantity){ return "El valor total de sus cartas es " + quantity + ".";}

    //High Card texts
    public String highCardWellcome = "Bienvenido a la mesa de Carta Alta. Ganará el jugador que saque la carta más alta.";

    //Roulette texts
    public String rouletteWellcome = "Bienvenido a la ruleta del casino";
    public String rouletteBet = "¿Que apuesta quieres realizar?\n1. Número\n2. Color\n3. Par-Impar\n4. Falta-Pasa";
    public String rouletteChooseNumber = "Elige un número entre 0 y 36: ";
    public String rouletteChooseColor = "Elige un color entre ROJO y NEGRO: ";
    public String rouletteChoosePair = "Elige una paridad entre PAR o IMPAR: ";



}
