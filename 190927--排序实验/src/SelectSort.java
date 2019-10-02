public class SelectSort {

    //选择排序
    public static void selectSort(int[] array) {
        // 每次选最大的放到无序区间的最后
        for (int i = 0; i < array.length - 1; i++) {
            // 无序 [0, array.length - i)
            // 有序 [array.length - i, array.length)
            int maxIndex = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(array, maxIndex, array.length - i - 1);
        }
    }
    public static void selectSort0(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 有序区间 [0,i)
            // 无序区间 [i, array.length)
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            swap(array, minIndex, i);
        }
    }
    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    //双向选择排序
    public static void selectSort2(int[] array) {
        // 无序: [begin, end]
        int begin = 0;
        int end = array.length - 1;

        while (begin < end) {
            int minIndex = begin;
            int maxIndex = begin;
            for (int j = begin + 1; j <= end; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(array, minIndex, begin);
            if (maxIndex == begin) {
                maxIndex = minIndex;
            }
            swap(array, maxIndex, end);
            begin++; end--;
        }
    }
}
