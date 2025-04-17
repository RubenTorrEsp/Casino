package utils;

public class Texts {

    //Victory texts
    public void victoryText (int apuesta) {
        System.out.println("Has ganado, ahora tienes " + apuesta + " euros.");
    }
    public void defeatText (int apuesta) {
        System.out.println("Has perdido, ahora tienes " + apuesta + " euros.");
    }

    //General texts
    public String wellcome = "Bienvenido a la app de casino. ¿A qué desea jugar?";
    public String availableGames =
        """
            0. Salir\n\
            1. BlackJack.\n\
            2. Carta alta.\n\
            3. Ruleta.\n\
            4. Dados.""";
    public String quantityToPlay = "¿Cuanto quieres apostar?";
    public String notImplemented = "Todavía no se puede. Pronto llegará.";
    public String thanks = "Gracias por jugar. Vuelva pronto.";
    public String notAvailable = "Opción no disponible. Seleccione otra.";
    public String notValidQuantity(String quantity) { return "Lo siento, pero "+quantity+" no es una cantidad válida. Anda a tomar por culo.";}
    public String correctBet(int quantity) { return "Genial! Ahora tienes "+quantity+" euros en fichas. Gástalos bien.";}
    public String crupierValue(int quantity) { return "El crupier ha sacado "+ quantity +" puntos.";}
    public String notValidValue(String quantity) { return quantity +" no es un número válido";}

    //BlackJack texts
    public String blackJackWellcome = "Bienvenido a la mesa de BlackJack";
    public String blackJackGameContinue =
        """
            ¿Que desea hacer a continuacion?\
            1. Separar cartas\
            2. Pedir nueva carta\
            3. Plantarse""";
    public String stucked(int quantity){ return "Te has plantado con " + quantity + " puntos. A ver si hay suerte.";}
    public String totalValue(int quantity){ return "El valor total de sus cartas es " + quantity + ".";}

    //High Card texts
    public String highCardWellcome = "Bienvenido a la mesa de Carta Alta. Ganará el jugador que saque la carta más alta.";

    //Roulette texts
    public String rouletteWellcome = "Bienvenido a la ruleta del casino";
    public String rouletteBet =
        """
            ¿Que apuesta quieres realizar?\n\
            1. Número\n\
            2. Color\n\
            3. Par-Impar\n\
            4. Falta-Pasa\n\
            5. Columna\n\
            6. Docena\n\
            7. Fila""";
    public String rouletteChooseNumber = "Elige un número entre 0 y 36: ";
    public String rouletteChooseColor = "Elige un color entre ROJO y NEGRO: ";
    public String rouletteChoosePair = "Elige una paridad entre PAR o IMPAR: ";



}
