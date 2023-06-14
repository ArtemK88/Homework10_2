import java.util.List;

public class Elements {
    public static void elementsList(List<Integer> list, int x) {
        int leftSide = 0;
        int rightSide = list.size() - 1;

        while (leftSide < rightSide) {
            while (list.get(leftSide) <= x && leftSide < rightSide) {
                leftSide++;
            }

            while (list.get(rightSide) > x && leftSide < rightSide) {
                rightSide--;
            }

            if (leftSide < rightSide) {
                int a = list.get(leftSide);
                list.set(leftSide, list.get(rightSide));
                list.set(rightSide, a);
            }
        }
    }
}
