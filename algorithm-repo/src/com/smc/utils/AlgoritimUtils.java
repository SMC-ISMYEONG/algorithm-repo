package com.smc.utils;

/**
 * 
 * 알고리즘에 사용되는 유틸클래스
 *
 * @class AlgoritimUtils.java
 * @author ismyeong
 * @since 2019. 2. 17.
 *
 */
public class AlgoritimUtils {
	
	/**
	 * 
	 * 배열의 값을 서로 바꿔주는 메서드
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
	 * 배열을 나열하여 출력시키는 메서드
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
