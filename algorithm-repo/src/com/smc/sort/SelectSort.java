package com.smc.sort;

import com.smc.utils.AlgoritimUtils;

/**
 * 
 * ���� ���� �˰���
 * 1. ��ü �� �� �ּ� ���� ã�´�. (����������)
 * 2. ã�� ���� ���ʿ� ��ġ�Ѵ�.
 * 3. �ݺ��ؼ� �ּ� ���� ���ʿ� ��ġ�Ѵ�.
 *
 * @class SelectSort.java
 * @author ismyeong
 * @since 2019. 2. 17.
 *
 */
public class SelectSort {
	
	/** ���ĵ� �迭 */
	private int[] targetArray = null;

	/**
	 * ������
	 * @param targetArray
	 */
	public SelectSort(int[] targetArray) {
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
	public int[] doSelectSort() {
		// ���ĵ� �迭�� null�� ��� ����ó��
		if(targetArray == null) {
			throw new NullPointerException();
		}
		
		int targetIndex = 0;
		
		// 3. �ݺ��ؼ� �ּ� ���� ���ʿ� ��ġ�Ѵ�.
		for(int currentIndex = 0 ; currentIndex < targetArray.length ; currentIndex++) {
			
			int minimumValue = targetArray[currentIndex];
			
			// 1. ��ü �� �� �ּ� ���� ã�´�. (����������)
			for(int index = currentIndex ; index < targetArray.length ; index++) {
				if(targetArray[index] <= minimumValue)  {
					minimumValue =  targetArray[index];
					targetIndex = index;
				}
			}
			
			// 2. ã�� ���� ���ʿ� ��ġ�Ѵ�.
			AlgoritimUtils.swap(targetArray, currentIndex, targetIndex);
		}
		
		return targetArray;
	}
}
