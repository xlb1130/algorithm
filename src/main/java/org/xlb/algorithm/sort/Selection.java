package org.xlb.algorithm.sort;

import org.xlb.algorithm.utils.PrintUtils;

/**
 * 选择排序
 * @author Jack Xie
 */
public class Selection {
	
	public static int[] sort(int[] srcArray){
		int temp = 0;
		for(int i=0; i<srcArray.length; i++){
			int indexMin = i;
			for(int j=i+1; j<srcArray.length; j++){
				// if判断重要
				if(srcArray[j]<srcArray[indexMin])
					indexMin = j;
			}
			temp = srcArray[i];
			srcArray[i] = srcArray[indexMin];
			srcArray[indexMin] = temp;
		}
		return srcArray;
	}
	
	public static void main(String[] args){
		PrintUtils.arrayPrint(Selection.sort(new int[]{12,33,11,35,4,6,24,77}));
	}
}
