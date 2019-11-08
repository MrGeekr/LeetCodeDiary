package sort;

/**
 * Created by MrGeekr.
 * Date : 2019/11/7.
 * Description :冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
       if (arr==null){
           return;
       }
       int length=arr.length;
       boolean flag;
       //外层控制比较次数，只需要比较n-1次
        for (int i = 0; i <length-1 ; i++) {
            flag=false;
            //内层循环每次比较n-1-i个数字，因为前i个数字已经有序
            for (int j = 0; j <length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }

            }
            if (!flag){
                break;
            }
        }
    }
}
