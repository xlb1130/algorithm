package org.xlb.algorithm.sort;

import org.xlb.algorithm.utils.PrintUtils;

/**
 * 插入排序
 * @author Jack Xie
 */
public class Insertion {

	/**
	 * 时间复杂度为O(n2)
	 * @param srcArray
	 * @return
	 */
	public static int[] sort(int[] srcArray){
		int temp = 0;
		for(int i=1;i<srcArray.length;i++){
			for(int j=i;j>0;j--){
				if(srcArray[j]<srcArray[j-1]){
					temp = srcArray[j];
					srcArray[j] = srcArray[j-1];
					srcArray[j-1] = temp;
				}
			}
		}
		return srcArray;
	}

	public static void main(String[] args) {
		PrintUtils.arrayPrint(Insertion.sort(new int[]{10, 14, 73, 25, 23, 13, 27, 94, 33, 39, 25, 59, 94, 65, 82, 45 }));
	}

}
