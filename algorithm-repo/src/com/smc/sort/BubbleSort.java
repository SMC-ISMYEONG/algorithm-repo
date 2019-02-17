package com.smc.sort;

import com.smc.utils.AlgoritimUtils;

/**
 * 
 * ���� ���� �˰���
 * <li>1. ���� ���� �� ���� ���Ͽ� ���� ���� ã�´�.
 * <li>2. ã�� ���� ���ʿ� ��ġ�Ѵ�.
 * <li>3. �ݺ��ؼ� �ּ� ���� ���ʿ� ��ġ�Ѵ�.
 *
 * @class SelectSort.java
 * @author ismyeong
 * @since 2019. 2. 17.
 *
 */
public class BubbleSort {
	/** ���ĵ� �迭 */
	private int[] targetArray = null;

	/**
	 * ������
	 * @param targetArray
	 */
	public BubbleSort(int[] targetArray) {
		this.targetArray = targetArray;
	}
	
	/**
	 * 
	 * ���� ������ �ϴ� �޼���
	 * 
	 * @author ismyeong
	 * @writeday 2019. 2. 17.
	 * @return int[]
	 * @exception NullPointerException
	 *
	 */
	public int[] doBubbleSort() {
		// ���ĵ� �迭�� null�� ��� ����ó��
		if(targetArray == null) {
			throw new NullPointerException();
		}
		
		// 3. �ݺ��ؼ� �ּ� ���� ���ʿ� ��ġ�Ѵ�.
		for(int currentIndex = 0 ; currentIndex < targetArray.length-1 ; currentIndex++) {
			for(int swapIndex = targetArray.length-1 ; swapIndex > currentIndex ; swapIndex--) {
				 // 1. ���� ���� �� ���� ���Ͽ� ���� ���� ã�´�.
				if(targetArray[swapIndex-1] > targetArray[swapIndex]) {
					
					 // 2. ã�� ���� ���ʿ� ��ġ�Ѵ�.
					AlgoritimUtils.swap(targetArray, swapIndex-1, swapIndex);
				}
			}
		}
		
		return targetArray;
	}
	
}
