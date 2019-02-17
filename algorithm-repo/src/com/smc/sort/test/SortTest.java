package com.smc.sort.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.smc.sort.BubbleSort;
import com.smc.sort.InsertSort;
import com.smc.sort.SelectSort;

public class SortTest {
	// ������ �迭
	int[] targetArray = new int[] {5,3,4,7,2,8,6,9,1};

	// ���ϴ� ��� �迭
	int[] resultArray = new int[] {1,2,3,4,5,6,7,8,9};

	@Test
	public void testSelectSortAlgorithm() {
		// ���� ����
		SelectSort selectSort = new SelectSort(targetArray);
		
		// ���
		assertArrayEquals(resultArray, selectSort.doSelectSort());
	}

	@Test
	public void testBubbleSortAlgorithm() {
		// ���� ����
		BubbleSort bubbleSort = new BubbleSort(targetArray);
		
		// ���
		assertArrayEquals(resultArray, bubbleSort.doBubbleSort());
	}

	@Test
	public void testInsertSortAlgorithm() {
		// ���� ����
		InsertSort insertSort = new InsertSort(targetArray);
		
		// ���
		assertArrayEquals(resultArray, insertSort.doInsertSort());
	}
}
