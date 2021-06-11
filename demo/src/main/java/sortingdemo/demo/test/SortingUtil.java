package sortingdemo.demo.test;

import lombok.Data;

/**
 * @author  yxm
 * @date  20210601
 * 十大排序算法demo-工具包
 */
@Data
public class SortingUtil {
    /**
     * 排序算法一
     * 冒泡排序法
     * 顾名思义：从左往右依次冒泡、往小的移动。
     * 例子： [ 8,2,5,9,7 ]
     * 首先比较第一个数和第二个数的大小,8>2,不作变动
     * 指针走向下一步,2<5,位置进行变化。
     * 以上
     */
    public static void bubbleSort(int[] str) {
        for(int i = 0;i<str.length-1;i++){
            for(int j = 0; j<str.length-1;j++){
                if(str[j] < str[j+1]){
                    int str3 = str[j];
                    str[j] = str[j+1];
                    str[j+1] = str3;
                }
            }
        }
        printSort(str);
    }

    /**
     * 排序算法二
     * 选择排序的思路是这样的：
     * 首先,找到数组中最小的元素,拎出来,将它和数组的第一个元素交换位置,
     * 第二步,在剩下的元素中继续寻找最小的元素,拎出来,和数组的第二个元素交换位置,
     * 如此循环,直到整个数组排序完成。
     */
    public static void selectSort(int[] str) {
        for(int i = 0;i<str.length-1;i++){
            int str1 = str[i];
            for(int j = 0; j<str.length-1;j++){
                if(str1 > str[j]){
                    str1 = str[j];
                    str[j] = str[i];
                    str[i] = str1;
                }
            }
        }
        printSort(str);
    }

    /**
     * 排序算法三
     * 插入排序
     * 插入排序的思想和我们打扑克摸牌的时候一样,从牌堆里一张一张摸起来的牌都是乱序的,
     * 我们会把摸起来的牌插入到左手中合适的位置,让左手中的牌时刻保持一个有序的状态。
     *
     */

    public static void insertSort(int[] str){
        for(int i = 1;i<str.length-1;i++){
            int value = str[i];
            int j = 0;
            for(j=i-1;j>=0;j--){
                if(value < str[j]){
                    str[j+1] = str[j];
                }else{
                    break;
                }
            }
            str[j+1] = value;
        }
        printSort(str);
    }

    /**
     * 排序算法四
     * 快速排序
     * 快速排序的核心思想也是分治法,分而治之。
     * 它的实现方式是每次从序列中选出一个基准值,其他数依次和基准值做比较,比基准值大的放右边,比基准值小的放左边,
     * 然后再对左边和右边的两组数分别选出一个基准值,进行同样的比较移动,重复步骤,直到最后都变成单个元素,整个数组就成了有序的序列。
     * todo
     */


    private static void printSort(int[] str){
        for(int s:str){
            System.out.println(s);
        }
    }
}
