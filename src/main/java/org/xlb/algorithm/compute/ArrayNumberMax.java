package org.xlb.algorithm.compute;

import org.xlb.algorithm.utils.PrintUtils;

/**
 * @Auther: Jack Xie
 * @Date: 2018/10/31/031 09:02
 * @Description:
 * 给定长度为n的数组，找出连续的m个数相加和最大
 */
public class ArrayNumberMax {

    /**
     * 时间复杂度O(nm)
     * 采用m次数组错位相加，取出最大值
     * @param srcArray
     * @param m
     */
    public static void compute(int[] srcArray, int m){
        int[] desArray = srcArray.clone();
        for(int i=1; i<m; i++) {
            for (int j = 0; j < desArray.length; j++) {
                if (j + i < desArray.length) {
                    desArray[j] += srcArray[j + i];
                }
            }
        }
        PrintUtils.arrayPrint(desArray);
        int maxIndex = 0;
        for(int i=0; i<desArray.length; i++){
            if(desArray[i]>desArray[maxIndex])
                maxIndex = i;
        }
        System.out.println("给定数组中连续"+m+"个数和最大为第"+maxIndex+"个元素"+srcArray[maxIndex]+"开始，最大值为"+desArray[maxIndex]);
    }

    public static void main(String args[]){
        ArrayNumberMax.compute(new int[]{12,33,11,35,4,6,24,77},3);
    }
}
