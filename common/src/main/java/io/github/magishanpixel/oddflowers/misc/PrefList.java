package io.github.magishanpixel.oddflowers.misc;

public class PrefList {
    // If you wondering why I'm doing these because I'm tired of typo on registry name and translation lmaoo
    public static final StringAdder GINGER_TULIP = of("_ginger_tulip", StringAdder.TYPE.PREFIX);
    public static final StringAdder TALL_TULIP = of("_tall_tulip", StringAdder.TYPE.PREFIX);
    public static final StringAdder TWIN_CELALION = of("_twin_celalion", StringAdder.TYPE.PREFIX);
    public static final StringAdder BLEEDING_QUADHEART = of("_bleeding_quadheart", StringAdder.TYPE.PREFIX);
    public static final StringAdder ROMENTA = of("_romenta", StringAdder.TYPE.PREFIX);
    public static final StringAdder HIBISCUS = of("_hibiscus", StringAdder.TYPE.PREFIX);
    public static final StringAdder HYACINTH = of("_tall_hyacinth", StringAdder.TYPE.PREFIX);
    public static final StringAdder VINE_LOTUS = of("_vine_lotus", StringAdder.TYPE.PREFIX);
    public static final StringAdder LACECAP_HYDRANGEA = of("_lacecap_hydrangea", StringAdder.TYPE.PREFIX);

    private static StringAdder of(String v, StringAdder.TYPE type) {
        return  new StringAdder(v, type);
    }
}
