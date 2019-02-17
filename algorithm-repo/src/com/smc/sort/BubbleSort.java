package com.smc.sort;

import com.smc.utils.AlgoritimUtils;

/**
 * 
 * 버블 정렬 알고리즘
 * <li>1. 현재 값과 전 값을 비교하여 작은 값을 찾는다.
 * <li>2. 찾은 값을 왼쪽에 배치한다.
 * <li>3. 반복해서 최소 값을 왼쪽에 배치한다.
 *
 * @class SelectSort.java
 * @author ismyeong
 * @since 2019. 2. 17.
 *
 */
public class BubbleSort {
	/** 정렬될 배열 */
	private int[] targetArray = null;

	/**
	 * 생성자
	 * @param targetArray
	 */
	public BubbleSort(int[] targetArray) {
		this.targetArray = targetArray;
	}
	
	/**
	 * 
	 * 버블 정렬을 하는 메서드
	 * 
	 * @author ismyeong
	 * @writeday 2019. 2. 17.
	 * @return int[]
	 * @exception NullPointerException
	 *
	 */
	public int[] doBubbleSort() {
		// 정렬될 배열이 null일 경우 예외처리
		if(targetArray == null) {
			throw new NullPointerException();
		}
		
		// 3. 반복해서 최소 값을 왼쪽에 배치한다.
		for(int currentIndex = 0 ; currentIndex < targetArray.length-1 ; currentIndex++) {
			for(int swapIndex = targetArray.length-1 ; swapIndex > currentIndex ; swapIndex--) {
				 // 1. 현재 값과 전 값을 비교하여 작은 값을 찾는다.
				if(targetArray[swapIndex-1] > targetArray[swapIndex]) {
					
					 // 2. 찾은 값을 왼쪽에 배치한다.
					AlgoritimUtils.swap(targetArray, swapIndex-1, swapIndex);
				}
			}
		}
		
		return targetArray;
	}
	
}
