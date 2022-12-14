package cat.xtec.ioc.utils;

public class Settings {

    // Mida del joc, s'escalarÃ  segons la necessitat
    public static final int GAME_WIDTH = 240;
    public static final int GAME_HEIGHT = 135;

    // Propietats de la nau
    public static final float SPACECRAFT_VELOCITY = 75;
    public static final int SPACECRAFT_WIDTH = 36;
    public static final int SPACECRAFT_HEIGHT = 15;
    public static final float SPACECRAFT_STARTX = 20;
    public static final float SPACECRAFT_STARTY = GAME_HEIGHT/2 - SPACECRAFT_HEIGHT/2;

    // Rang de valors per canviar la mida de l'asteroide.
    public static final float MAX_ASTEROID = 1.5f;
    public static final float MIN_ASTEROID = 0.5f;

    // ConfiguraciÃ³ Scrollable
    public static final int ASTEROID_SPEED = -150;
    public static final int ASTEROID_GAP = 75;
    public static final int BG_SPEED = -100;

    // TODO Exercici 2: Propietats per la moneda
    public static final int SCORE_INCREASE = 100; // s'incrementa en 100 cada cop que toca una moneda
    public static final int SCORE_SPEED = -175;


}
