package org.xlb.algorithm.sort;

import org.xlb.algorithm.utils.PrintUtils;

/**
 * ц╟ещеепР
 * @author Jack Xie
 */
public class Bubble {
	
	public static int[] sort(int[] srcArray){
		int temp = 0;
		for(int i=0;i<srcArray.length;i++){
			for(int j=srcArray.length-i-1;j<srcArray.length-1;j++){
				if(srcArray[j]>srcArray[j+1]){
					temp = srcArray[j];
					srcArray[j] = srcArray[j+1];
					srcArray[j+1] = temp;
				}
			}
		}
		return srcArray;
	}

	public static void main(String[] args) {
		PrintUtils.arrayPrint(Bubble.sort(new int[]{12,33,11,35,4,6,24,77}));

	}

}
