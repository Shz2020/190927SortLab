public class InsertSort {

    // 直接插入排序
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // 有序   [0, i)
            // 无序   [i, array.length)
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                /*
                if (array[j] < key) {
                    break;
                } else if(array[j]==key) {
                    break;
                }else{
                    array[j + 1] = array[j];
                }
                */
                if (array[j] <= key) {
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = key;
        }
    }

    public static void insertSort0(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }

    //折半插入排序
    public static void bsInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int left = 0;
            int right = i;
            while (left < right) {
                int m = (left + right) / 2;
                if (v >= array[m]) {
                    left = m + 1;
                } else {
                    right = m;
                }
            }
            for (int j = i; j > left; j--) {
                array[j] = array[j - 1];
            }
            array[left] = v;
        }
    }
}
