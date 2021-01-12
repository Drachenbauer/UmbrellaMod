package drachenbauer32.umbrellamod.util;

public enum UmbrellaColors
{
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    LIME("lime"),
    CYAN("cyan"),
    BLUE("blue"),
    PURPLE("purple"),
    MAGENTA("magenta"),
    PINK("pink"),
    LIGHT_BLUE("light_blue"),
    GREEN("green"),
    BROWN("brown"),
    BLACK("black"),
    LIGHT_GRAY("light_gray"),
    GRAY("gray"),
    WHITE("white");
    
    public final String name;
    
    private UmbrellaColors(String name) {
        this.name = name;
    }
    
    public String GetName()
    {
        return name;
    }
}
