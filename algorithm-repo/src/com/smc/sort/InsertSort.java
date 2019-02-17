package com.smc.sort;

/**
 * 
 * 삽입 정렬 알고리즘<br>
 * 가정) 초기에 맨 왼쪽 값은 정렬 되었다고 가정한다.
 * <li>1. 두번째 값부터 정렬 된 좌측 값들과 대소를 비교하여 자신보다 작은 값의 다음위치와 바꾼다.
 * <li>2. 반복해서 진행한다.
 *
 * @class SelectSort.java
 * @author ismyeong
 * @since 2019. 2. 17.
 *
 */
public class InsertSort {
	/** 정렬될 배열 */
	private int[] targetArray = null;

	/**
	 * 생성자
	 * @param targetArray
	 */
	public InsertSort(int[] targetArray) {
		this.targetArray = targetArray;
	}
	
	/**
	 * 
	 * 삽입 정렬을 하는 메서드
	 * 
	 * @author ismyeong
	 * @writeday 2019. 2. 17.
	 * @return int[]
	 * @exception NullPointerException
	 *
	 */
	public int[] doInsertSort() {
		// 정렬될 배열이 null일 경우 예외처리
		if(targetArray == null) {
			throw new NullPointerException();
		}

		int tempIndex = 0;
		int swapIndex = 0;
		
		// 2. 반복해서 진행한다.
		for(int currentIndex = 1; currentIndex < targetArray.length; currentIndex++){
			
			tempIndex = targetArray[currentIndex];
			
			// 1. 두번째 값부터 정렬 된 좌측 값들과 대소를 비교하여 자신보다 작은 값의 다음위치와 바꾼다.
			for(swapIndex = currentIndex-1 ; swapIndex >= 0 && tempIndex < targetArray[swapIndex] ; swapIndex--){
				targetArray[swapIndex+1] = targetArray[swapIndex];
			}
			
			targetArray[swapIndex+1] = tempIndex;
		}

		return targetArray;
	}
}
