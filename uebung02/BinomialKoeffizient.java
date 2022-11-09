public class BinomialKoeffizient {
        public final static void main(final String[] args) {
                final int n = Integer.parseInt(args[0]);
                final int k = Integer.parseInt(args[1]);
                int result = n - k + 1;
                int i = 2;
                String text = "";
                while (i != k) {
                        result *= (n - k + i);
                        result /= i;
                        i++;
                        text += "\n------------------\n n = " + String.valueOf(n)
                        + "\n k = " + String.valueOf(k)
                        + "\n result = " + String.valueOf(result)
                        + "\n i = " + String.valueOf(i);
                }
                System.out.println(text);

        }
}
