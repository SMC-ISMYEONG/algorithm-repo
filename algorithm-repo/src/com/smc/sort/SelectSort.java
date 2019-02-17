package com.smc.sort;

import com.smc.utils.AlgoritimUtils;

/**
 * 
 * 선택 정렬 알고리즘
 * 1. 전체 값 중 최소 값을 찾는다. (순차적으로)
 * 2. 찾은 값을 왼쪽에 배치한다.
 * 3. 반복해서 최소 값을 왼쪽에 배치한다.
 *
 * @class SelectSort.java
 * @author ismyeong
 * @since 2019. 2. 17.
 *
 */
public class SelectSort {
	
	/** 정렬될 배열 */
	private int[] targetArray = null;

	/**
	 * 생성자
	 * @param targetArray
	 */
	public SelectSort(int[] targetArray) {
		this.targetArray = targetArray;
	}

	/**
	 * 
	 * 선택 정렬을 하는 메서드
	 * 
	 * @author ismyeong
	 * @writeday 2019. 2. 17.
	 * @return int[]
	 * @exception NullPointerException
	 *
	 */
	public int[] doSelectSort() {
		// 정렬될 배열이 null일 경우 예외처리
		if(targetArray == null) {
			throw new NullPointerException();
		}
		
		int targetIndex = 0;
		
		// 3. 반복해서 최소 값을 왼쪽에 배치한다.
		for(int currentIndex = 0 ; currentIndex < targetArray.length ; currentIndex++) {
			
			int minimumValue = targetArray[currentIndex];
			
			// 1. 전체 값 중 최소 값을 찾는다. (순차적으로)
			for(int index = currentIndex ; index < targetArray.length ; index++) {
				if(targetArray[index] <= minimumValue)  {
					minimumValue =  targetArray[index];
					targetIndex = index;
				}
			}
			
			// 2. 찾은 값을 왼쪽에 배치한다.
			AlgoritimUtils.swap(targetArray, currentIndex, targetIndex);
		}
		
		return targetArray;
	}
}
