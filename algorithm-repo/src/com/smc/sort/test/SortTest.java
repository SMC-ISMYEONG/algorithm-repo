package com.smc.sort.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.smc.sort.BubbleSort;
import com.smc.sort.InsertSort;
import com.smc.sort.SelectSort;

public class SortTest {
	// 정렬할 배열
	int[] targetArray = new int[] {5,3,4,7,2,8,6,9,1};

	// 원하는 결과 배열
	int[] resultArray = new int[] {1,2,3,4,5,6,7,8,9};

	@Test
	public void testSelectSortAlgorithm() {
		// 선택 정렬
		SelectSort selectSort = new SelectSort(targetArray);
		
		// 결과
		assertArrayEquals(resultArray, selectSort.doSelectSort());
	}

	@Test
	public void testBubbleSortAlgorithm() {
		// 버블 정렬
		BubbleSort bubbleSort = new BubbleSort(targetArray);
		
		// 결과
		assertArrayEquals(resultArray, bubbleSort.doBubbleSort());
	}

	@Test
	public void testInsertSortAlgorithm() {
		// 버블 정렬
		InsertSort insertSort = new InsertSort(targetArray);
		
		// 결과
		assertArrayEquals(resultArray, insertSort.doInsertSort());
	}
}
