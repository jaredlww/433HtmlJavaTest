package com.sss.javatest;

import java.util.Scanner;
/**题目二
 * 求最小公倍数
 */
public class LeastCommonMultiple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个正整数，例如格式：1,2，然后回车");
		String s = scanner.next();
		String[] nums = s.split(",");
		try {
			if (nums.length != 2) {
				System.out.println("请输入两个正整数!");
				return;
			}
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			System.out.println("这俩个正整数的最小公倍数为" + minMultiple(a, b));
		} catch (NumberFormatException ex) {
			System.out.println("请输入两个正整数!");
		}
	}

	static int minMultiple(int a, int b) {
		int r = a, s = a, t = b;
		if (a < b) {
			r = a;
			a = b;
			b = r;
		}
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return s * t / a;
	}

}
