import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(5, 2, 6, 4, 5, 3, 8, 7, 9, 10, 10, 12, 13));
        int x = 6;
        Elements.elementsList(num, x);
        System.out.println("Список чисел : " + num);
    }
}

