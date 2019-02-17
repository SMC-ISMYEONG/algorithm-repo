package com.smc.sort;

/**
 * 
 * ���� ���� �˰���<br>
 * ����) �ʱ⿡ �� ���� ���� ���� �Ǿ��ٰ� �����Ѵ�.
 * <li>1. �ι�° ������ ���� �� ���� ����� ��Ҹ� ���Ͽ� �ڽź��� ���� ���� ������ġ�� �ٲ۴�.
 * <li>2. �ݺ��ؼ� �����Ѵ�.
 *
 * @class SelectSort.java
 * @author ismyeong
 * @since 2019. 2. 17.
 *
 */
public class InsertSort {
	/** ���ĵ� �迭 */
	private int[] targetArray = null;

	/**
	 * ������
	 * @param targetArray
	 */
	public InsertSort(int[] targetArray) {
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
	public int[] doInsertSort() {
		// ���ĵ� �迭�� null�� ��� ����ó��
		if(targetArray == null) {
			throw new NullPointerException();
		}

		int tempIndex = 0;
		int swapIndex = 0;
		
		// 2. �ݺ��ؼ� �����Ѵ�.
		for(int currentIndex = 1; currentIndex < targetArray.length; currentIndex++){
			
			tempIndex = targetArray[currentIndex];
			
			// 1. �ι�° ������ ���� �� ���� ����� ��Ҹ� ���Ͽ� �ڽź��� ���� ���� ������ġ�� �ٲ۴�.
			for(swapIndex = currentIndex-1 ; swapIndex >= 0 && tempIndex < targetArray[swapIndex] ; swapIndex--){
				targetArray[swapIndex+1] = targetArray[swapIndex];
			}
			
			targetArray[swapIndex+1] = tempIndex;
		}

		return targetArray;
	}
}
