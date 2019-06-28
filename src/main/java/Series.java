public class Series {

    private int n;

    public Series(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int fibonacci1(int n) {
        int result = 0;
        int prevPrev = 0;
        int prev = 1;

        if (n == 0 || n == 1) return n;
        else {
            for (int i = 2; i <= n; i++) {
                result = prevPrev + prev;
                prevPrev = prev;
                prev = result;
            }
            return result;
        }
    }

    public int fibonacci2(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci2(n - 1) + fibonacci2(n - 2);
    }

    public int factorial1(int n) {
        int fact = 1;
        if (n == 0) return 1;
        else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public int factorial2(int n) {
        if (n == 0) return 1;
        return factorial2(n - 1) * n;
    }

    public int sumOfPowers1(int n, int p) {
        int sum = 0;
        if (n == 0) return n;
        else {
            for (int i = 1; i <= n; i++) {
                sum += (int)Math.pow(i, p);
            }
            return sum;
        }
    }

    public int sumOfPowers2(int n, int p) {
        if (n == 0) return n;
        return (int)(Math.pow(n, p) + sumOfPowers2(n - 1, p));
    }
}

