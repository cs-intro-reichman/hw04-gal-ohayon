public class Primes {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[n + 1];

        int i = 2;
        while (i <= n) {
            isPrime[i] = true;
            i++;
        }

        i = 2;
        while (i * i <= n) {       
            if (isPrime[i]) {      
                int j = i * i;    
                while (j <= n) {
                    isPrime[j] = false;   
                    j += i;               
                }
            }
            i++;
        }

        System.out.println("Prime numbers up to " + n + ":");

        int count = 0;
        i = 2;
        while (i <= n) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
            i++;
        }

        int percent = (int) Math.round(100.0 * count / n);

        System.out.println("There are " + count + " primes between 2 and " + n +
                           " (" + percent + "% are primes)");
    }
}
