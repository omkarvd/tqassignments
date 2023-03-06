package com.questions;

public class RemoveDuplicate {
	public static int removeDuplicates(char[] a, int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}

		a[j++] = a[n - 1];

		return j;
	}

	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'b', 'n', 'u', 'y', 'x', 's', 'y' };

		int n = a.length;

		int j = 0;

		j = removeDuplicates(a, n);

		for (int i = 0; i < j; i++)
			System.out.print(a[i] + " ");
	}
}
