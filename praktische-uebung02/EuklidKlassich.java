public class EuklidKlassisch {
    private static int x;
    private static int y;
    private final static String[] k = {"K0", "K1", "K2", "K3", "K4", "K5", "K6"};
    public static final void main(final String[] args ){
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        if(x >= 0 && y >= 0) {
        print("| line \t | x \t | y \t | comment");
        print(getBeginFormat(k[1]) + "ggT(" + String.valueOf(x) + ", " + String.valueOf(y) + ")");
            while ( y != 0 ) {
                print(getFormatedWhile());
                print(getFormatedIf());
                if ( x > y ) {
                        print(getFormatedCalc(true));
                        x -= y;
                } else {
                        print(getFormatedCalc(false));
                        y -= x;
                }
             }
                print(getFormatedWhile());
                print(getBeginFormat(k[6]) + "= " + String.valueOf(x));
        } else
                print("nur positive Argumente!!");
    }
    private final static void print(final String text) {
        System.out.println(text);
    }
    private final static String getFormatedCalc(final boolean position) {
        if(position)
                return getBeginFormat(k[4]) + "      x = " + String.valueOf(x) + " - " + String.valueOf(y);
        else
                return getBeginFormat(k[5]) + "      y = " + String.valueOf(y) + " - " + String.valueOf(x);
    }
    private final static String getFormatedIf() {
        return getBeginFormat(k[3]) + "    if (" + String.valueOf(x) + " > " + String.valueOf(y) + ")";
    }
    private final static String getFormatedWhile() {
        return getBeginFormat(k[2]) + "  while(" + String.valueOf(y) + " != 0)";
    }
    private final static String getBeginFormat(final String text) {
        return "| " + text + "\t | " + String.valueOf(x) + "\t | " + String.valueOf(y) + "\t | ";
    }
}
