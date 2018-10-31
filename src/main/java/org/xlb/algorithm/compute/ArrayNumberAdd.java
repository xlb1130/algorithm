package org.xlb.algorithm.compute;

import org.xlb.algorithm.sort.Selection;

/**
 * @Auther: Jack Xie
 * @Date: 2018/10/31/031 08:22
 * @Description:
 * 一个已知整形数组，给定一个整数，在数组中找出两个数的和等于这个数并打印出来
 */
public class ArrayNumberAdd {

    /**
     * 时间复杂度为O(n2)
     * @param srcArray
     * @param number
     */
    public static void compute(int[] srcArray, int number){
        System.out.println("数组相减法查找：和要求"+number);
        int[] desArray = new int[srcArray.length];
        for(int i=0; i<srcArray.length; i++){
            desArray[i] = number - srcArray[i];
            //因为两个数组是相减得到 具有对称性 第二次只需要从i向后找
            for(int j=i; j<srcArray.length; j++){
                if(desArray[i] == srcArray[j])
                    System.out.println("数组相减法查找：srcArray["+i+"]="+srcArray[i]+"   srcArray["+j+"]="+srcArray[j]);
            }
        }
    }

    //可先排序 然后进行二路归并 可降低时间复杂度
    //可选择时间复杂度较低的排序算法 从而降低整体时间复杂度 但是此方法会打乱所有数据元素最初的位置
    //所以不可取
    public static void compute1(int[] srcArray, int number){
        int[] desArray = srcArray.clone();
        srcArray = Selection.sort(srcArray);
        desArray = Selection.sort(desArray);
        int i=0,j=0;
        while(i<srcArray.length && j<desArray.length){
            if(srcArray[i] == desArray[j]){
                System.out.println("二路归并查找：srcArray["+i+"]="+srcArray[i]+"   srcArray["+j+"]="+srcArray[j]);
                i++;j++;
            }else if(srcArray[i] < desArray[j]){
                i++;
            }else if(srcArray[i] > desArray[j]){
                j++;
            }
        }
    }

    //可O(n)算出desArray 并同时将desArray与srcArray映射到hash表 然后遍历哈希表，为2的就是 此方法时间复杂度最低
    //待完成
    public static void compute2(int[] srcArray, int number){

    }

    public static void main(String args[]){
        ArrayNumberAdd.compute(new int[]{12,33,11,35,4,6,24,77,1},36);
    }
}
