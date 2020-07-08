import java.util.List;
import java.util.ArrayList;

public class Problem2
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<100; i++) {
            if (list.size()<2) list.add(i);
            else {
                int fib = list.get(list.size()-2)+list.get(list.size()-1);
                if (fib < 4000000) list.add(fib);
                else break;
            }
        }

        int sum = 0;
        for (int i : list) {
            if (i%2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
