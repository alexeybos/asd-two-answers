
public class SortLevel2 {
    public static void InsertionSortStep( int[] array, int step, int i )
    {
        for (int j = i + step; j < array.length; j += step) {
            int tmpForExchange = array[j];
            for (int k = j - step; k >= i && array[k] > tmpForExchange; k -= step) {
                if (array[k] > tmpForExchange) {
                    array[k + step] = array[k];
                    array[k] = tmpForExchange;
                }
            }
        }

    }
}



