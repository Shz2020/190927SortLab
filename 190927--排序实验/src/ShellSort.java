public class ShellSort {

    //希尔排序
    public static void shellSort(int[] array) {
        int gap = array.length;//gap 间隔
        while (true) {
            gap = (gap / 3) + 1;
            //gap = gap / 2;
            insertSortWithGap(array, gap);
            if (gap == 1) {
                break;
            }
        }
    }
    private static void insertSortWithGap(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - gap; j >= 0 && array[j] > key; j -= gap) {
                array[j + gap] = array[j];
            }
            array[j + gap] = key;
        }
    }
}
