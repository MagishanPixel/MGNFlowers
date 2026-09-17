package io.github.magishanpixel.mgnflowers.misc;

public class PrefixAdder {
    private final String str;

    public PrefixAdder(String v) {
        this.str = v;
    };

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

        return p + g;
    }

    public String colorOf(StraddColor col) {
        return of(col.name(), false);
    }
    public String colorOf_Cap(StraddColor col) {
        return of(col.name(), true);
    }

}
