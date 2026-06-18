package io.github.magishanpixel.oddflowers.misc;

public class PrefList {
    public static final StringAdder GINGER_TULIP = of("_ginger_tulip", StringAdder.TYPE.PREFIX);
    public static final StringAdder TALL_TULIP = of("_tall_tulip", StringAdder.TYPE.PREFIX);
    public static final StringAdder TWIN_CENDALION = of("_twin_cendalion", StringAdder.TYPE.PREFIX);
    public static final StringAdder BLEEDING_QUADHEART = of("_bleeding_quadheart", StringAdder.TYPE.PREFIX);
    public static final StringAdder ROMENTA = of("_romenta", StringAdder.TYPE.PREFIX);

    private static StringAdder of(String v, StringAdder.TYPE type) {
        return  new StringAdder(v, type);
    }
}
