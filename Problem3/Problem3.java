import java.lang.Math;

public class Problem3
{
    public static void main(String[] args) {
        long e = 600851475143L;

        int i = 2;
        long maxPrim = 0;

        while (true) {
            if (isPrim(i)) {
                if (e%i == 0) {
                    e = e/i;
                    if (i>maxPrim) {
                        maxPrim = i;
                    }
                    if (isPrim(e)) {
                        if (e > maxPrim) maxPrim = e;
                        break;
                    }
                    i = 1;
                }
            }
            ++i;
        }

        System.out.println(maxPrim);
    }

    private static boolean isPrim(long x) {
        for (int i=2; i<Math.sqrt(x)+1; i++) {
            if (x%i == 0 && x != i) return false;
        }
        return true;
    }
}
