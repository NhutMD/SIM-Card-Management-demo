package Objects;

public class SIM {

    public static String sim;
    public static int price;
    public static String telecom;
    public static String kind_of;

    public static void Make_null() {
        sim = null;
        price = 0;
        telecom = null;
        kind_of = null;
    }

    public static boolean Empty() {
        return sim == null && price == 0 && telecom == null && kind_of == null;
    }
}
