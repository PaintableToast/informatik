public class ItierteQuersumme {
        public final static void main(final String[] args) {
                int x = Integer.parseInt(args[0]);
                while(x > 9)
                        x = getQuersumme(x);
                System.out.println(x);
        }
        private final static int getQuersumme(final int x) {
                int y = 0;
                for(final char charactervar : String.valueOf(x).toCharArray())
                        y += Integer.parseInt(String.valueOf(charactervar));
                return y;
        }
}
