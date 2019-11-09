package sort;

import java.util.Arrays;

/**
 * Created by MrGeekr.
 * Date : 2019/11/8.
 * Description :插入排序
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr==null){
            return;
        }
        int length=arr.length;
        //从1开始，因为第0张默认就是有序的
        for (int i = 1; i <length ; i++) {
            int j=i;
            int target=arr[j];//记录新插入的元素
            while (j>0&&target<arr[j-1]){
                arr[j]=arr[j-1];//元素后移
                j--;
            }
            //放置到对应顺序的位置
            arr[j]=target;

        }
    }
}
