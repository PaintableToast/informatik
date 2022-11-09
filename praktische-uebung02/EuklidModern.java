public class EuklidModern {
    private static int x;
    private static int y;
    private static int r = -1;
    private final static String[] m = {"M0", "M1", "M2", "M3", "M4", "M5", "M6"};
    public final static void main(final String[] args){
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        if(x >= 0 && y >= 0) {
        print("| line \t | x \t | y \t | r \t| comment");
        print(getPreBeginFormat(m[1]) + "ggT(" + String.valueOf(x) + ", " + String.valueOf(y) + ")");
        while ( y != 0 ) {
            if (r < 0)
                print(getPreFormatedWhile());
            else
                print(getFormatedWhile());
            r = x % y;
            print(getFormatedCalcForR());
            x = y;
            print(getFormatedCalc(true));                                     // M4
            y = r;
            print(getFormatedCalc(false));
           }
        print(getPreBeginFormat(m[6]) + "= " + String.valueOf(x));
        }
        else print("nur positive Zahlen verwenden!");
    }
    private final static String getFormatedWhile() {
        return getBeginFormat(m[2]) + "  while(" + String.valueOf(y) + " != 0)";
    }
    private final static String getPreFormatedWhile() {
        return getPreBeginFormat(m[2]) + "  while(" + String.valueOf(y) + " != 0)";
    }
    private final static void print(final String text) {
        System.out.println(text);
    }
    private final static String getBeginFormat(final String text) {
        return getPreBeginFormat(text).replace("-", String.valueOf(r));
    }
    private final static String getPreBeginFormat(final String text) {
        return "| " + text + "\t | " + String.valueOf(x) + "\t | " + String.valueOf(y) + "\t | - \t| ";
    }
    private final static String getFormatedCalc(final boolean position) {
        if(position)
                return getBeginFormat(m[4]) + "    x = " + String.valueOf(x);
        else
                return getBeginFormat(m[5]) + "    y = " + String.valueOf(y);
    }
    private final static String getFormatedCalcForR() {
        return getBeginFormat(m[3]) + "    r = " + String.valueOf(x) + " % " + String.valueOf(y);
    }
}
