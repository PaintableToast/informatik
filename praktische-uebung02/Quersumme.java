public class Quersumme {
        public final static void main(final String[] args) {
                int x = 0;
                for(final char charactervar : args[0].toCharArray())
                        x += Integer.parseInt(String.valueOf(charactervar));
                System.out.println(x);
        }
}
