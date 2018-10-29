package org.xlb.algorithm.utils;

/**
 * 数组打印工具类
 * @author xlb
 *
 */
public class PrintUtils {
	public static void arrayPrint(int[] array){
		if(array == null)
			System.out.println("Array is null!");
		else{
			for(int i=0; i<array.length; i++){
				System.out.print(array[i]+" ");
			}
		}
	}
}
