public class Quadrat {
        public final static void main(final String[] args) {
                final int sqrt_number = Integer.parseInt(args[0]);
                int result = 0;
                for (int i = 0; i < sqrt_number; i++)
                        result += 2*i + 1;
                System.out.println(result);
        }
}
