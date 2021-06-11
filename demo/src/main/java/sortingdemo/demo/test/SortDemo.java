package sortingdemo.demo.test;

import lombok.Data;

/**
 * @author yxm
 * @date 20210611
 * 十大排序算法demo
 */
@Data
public class SortDemo {
    public static void main (String[] args){
        int[] str = new int[]{8,3,2,4,1,5,9};
        //冒泡排序
        SortingUtil.bubbleSort(str);
        //选择排序
        SortingUtil.selectSort(str);
        //插入排序
        SortingUtil.insertSort(str);
    }
}
