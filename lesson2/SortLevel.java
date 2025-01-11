import java.util.*;

public class SortLevel {
    public static void InsertionSortStep(int[] array, int step, int i)
    {
        for (int j = i + step; j < array.length; j += step) {
            int tmpForExchange = array[j];
            for (int k = j - step; k >= i && array[k] > tmpForExchange; k -= step) {
                array[k + step] = array[k];
                array[k] = tmpForExchange;
            }
        }
    }
}



