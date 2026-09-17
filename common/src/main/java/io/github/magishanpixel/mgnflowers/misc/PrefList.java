package io.github.magishanpixel.mgnflowers.misc;

public class PrefList {
    // If you wondering why I'm doing these because I'm tired of typo on registry name and translation lmaoo
    public static final PrefixAdder GINGER_LILY = of("_ginger_lily");
    public static final PrefixAdder TALL_TULIP = of("_tall_tulip");
    public static final PrefixAdder TWIN_POPPY = of("_twin_poppy");
    public static final PrefixAdder BLEEDING_HEART = of("_bleeding_heart");
    public static final PrefixAdder ROMENTA = of("_romenta");
    public static final PrefixAdder HYACINTH = of("_hyacinth");
    public static final PrefixAdder VINE_LOTUS = of("_vine_lotus");
    public static final PrefixAdder LACECAP_HYDRANGEA = of("_lacecap_hydrangea");
    public static final PrefixAdder CYCLAMEN = of("_cyclamen");

    private static PrefixAdder of(String v) {
        return  new PrefixAdder(v);
    }
}
