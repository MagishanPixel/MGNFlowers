package io.github.magishanpixel.mgnflowers.misc;

public class StringAdder {
    private final String str;
    private final TYPE type;

    public StringAdder(String v, TYPE type) {
        this.str = v;
        this.type = type;
    };

    public enum TYPE {
        SUFFIX,
        PREFIX
    }


    public String of(String v, boolean capital) {
        String p;
        String g;

        if (capital) {
            p = v.substring(0,1).toUpperCase() + v.substring(1);
            g = "";

            String[] var = str.split("_");

            boolean first = false;

            for (String a : var) {
                if (!a.isBlank()) {
                    //Constants.LOG.info(a);
                    String firstChar = a.substring(0,1).toUpperCase();
                    String mySTR = firstChar + a.substring(1);

                    if (first) {
                        g = g + " " + mySTR;
                    }else {
                        g = g + mySTR;
                        first = true;
                    }
                }
            }

            g = " " + g;
        } else {
            p = v;
            g = str;
        }

        switch (type) {
            case PREFIX -> {
                return p + g;
            }
            case SUFFIX -> {
                return g + p;
            }
        }

        return v;
    }

    public String colorOf(StraddColor col) {
        return of(col.name(), false);
    }

    public String colorOf_Cap(StraddColor col) {
        return of(col.name(), true);
    }

    /*

    public String white(boolean capital)     { return of("white", capital); }
    public String orange(boolean capital)    { return of("orange", capital); }
    public String magenta(boolean capital)   { return of("magenta", capital); }
    public String lightBlue(boolean capital) { return of("light_blue", capital); }
    public String yellow(boolean capital)    { return of("yellow", capital); }
    public String lime(boolean capital)      { return of("lime", capital); }
    public String pink(boolean capital)      { return of("pink", capital); }
    public String gray(boolean capital)      { return of("gray", capital); }
    public String lightGray(boolean capital) { return of("light_gray", capital); }
    public String cyan(boolean capital)      { return of("cyan", capital); }
    public String purple(boolean capital)    { return of("purple", capital); }
    public String blue(boolean capital)      { return of("blue", capital); }
    public String brown(boolean capital)     { return of("brown", capital); }
    public String green(boolean capital)     { return of("green", capital); }
    public String red(boolean capital)       { return of("red", capital); }
    public String black(boolean capital)     { return of("black", capital); }*/

}
