package com.smc.sort.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.smc.sort.SelectSort;

public class SortTest {
	// ������ �迭
	int[] targetArray = new int[] {3, 1, 15, 20, 8, 5, 10};

	// ���ϴ� ��� �迭
	int[] resultArray = new int[] {1, 3, 5, 8, 10, 15, 20};


	@Test
	public void testSelectSortAlgorithm() {
		// ���� ����
		SelectSort selectSort = new SelectSort(targetArray);
		
		// ���
		assertArrayEquals(resultArray, selectSort.doSelectSort());
	}
}
