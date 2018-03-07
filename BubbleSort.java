package com.sss.javatest;

//import java.util.Arrays;
import java.util.Scanner;

/**题目三：排序算法
 * 冒泡排序 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入五个数，例如格式：3,2,4,1,5，然后回车");
		String s = scanner.next();
		String[] strs = s.split(",");
		double[] nums = new double[strs.length];
		for (int i = 0; i < strs.length; i++) {
			nums[i] = Double.valueOf(strs[i]);
		}
	   bubbleSort(nums);
	   //System.out.println(Arrays.toString(nums));//打印出数组
	   for (int i = 0; i < nums.length; i++) {  
		   System.out.print(nums[i] + ", ");  
		} 
	}

	public static void bubbleSort(double[] numbers) {
		double temp = 0;
		int size = numbers.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) // 交换两数位置
				{
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

}
