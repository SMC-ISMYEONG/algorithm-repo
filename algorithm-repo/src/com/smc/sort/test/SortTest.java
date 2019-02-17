package com.smc.sort.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.smc.sort.SelectSort;

public class SortTest {
	// 정렬할 배열
	int[] targetArray = new int[] {3, 1, 15, 20, 8, 5, 10};

	// 원하는 결과 배열
	int[] resultArray = new int[] {1, 3, 5, 8, 10, 15, 20};


	@Test
	public void testSelectSortAlgorithm() {
		// 선택 정렬
		SelectSort selectSort = new SelectSort(targetArray);
		
		// 결과
		assertArrayEquals(resultArray, selectSort.doSelectSort());
	}
}
