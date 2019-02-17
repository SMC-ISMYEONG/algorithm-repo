package com.smc.utils;

/**
 * 
 * �˰��� ���Ǵ� ��ƿŬ����
 *
 * @class AlgoritimUtils.java
 * @author ismyeong
 * @since 2019. 2. 17.
 *
 */
public class AlgoritimUtils {
	
	/**
	 * 
	 * �迭�� ���� ���� �ٲ��ִ� �޼���
	 * 
	 * @author ismyeong
	 * @writeday 2019. 2. 17.
	 * @param targetArray
	 * @param indexX
	 * @param indexY
	 * @return void
	 *
	 */
	public static void swap(int[] targetArray, int indexX, int indexY) {
		if(indexX == indexY) {
			return;
		}
		
		int tempValue = targetArray[indexX];
		targetArray[indexX] = targetArray[indexY];
		targetArray[indexY] = tempValue;
	}
	
	/**
	 * 
	 * �迭�� �����Ͽ� ��½�Ű�� �޼���
	 * 
	 * @author ismyeong
	 * @writeday 2019. 2. 17.
	 * @param sortedArray
	 * @exception 
	 * @return void
	 *
	 */
	public static void printResult(int[] sortedArray) {
		try {
			StringBuilder resultString = new StringBuilder();
			for(int item : sortedArray) {
				resultString.append(item+" ");
			}
			System.out.println("Sorted Item : " + resultString.toString());
			
		}catch (NullPointerException e) {
			System.out.println("null");
		}
	}
}
