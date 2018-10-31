package org.xlb.algorithm.sort;

import org.xlb.algorithm.utils.PrintUtils;

/**
 * 希尔排序
 * @author Jack Xie
 */
public class Shell {

	/**
	 * 时间复杂度为O(n^(1.3—2))
	 * @param srcArray
	 * @return
	 */
	public static int[] sort(int[] srcArray){
		int d = srcArray.length;
		while(d>1){
			int temp = 0;
			d=d/2;
			for(int j=d; j<srcArray.length; j++){
				for(int i=j; i-d>=0;i-=d){
					if(srcArray[i]<srcArray[i-d]){
						temp = srcArray[i];
						srcArray[i] = srcArray[i-d];
						srcArray[i-d] = temp;
					}
				}
			}
		}
		return srcArray;
	}
	
	public static void main(String args[]){
		PrintUtils.arrayPrint(Shell.sort(new int[]{10, 14, 73, 25, 23, 13, 27, 94, 33, 39, 25, 59, 94, 65, 82, 45 }));
	}
}
