package arrays;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = {1,2,4,5,3,9};
		/**
		 * copyOf(int[] original, int newLength)
		 * int newLength
		 */
		int d[] = Arrays.copyOf(i, 9);
		/**
		 * parallelPrefix(int[] array, IntBinaryOperator op);
		 * a 前一个 b 本身
		 */
		Arrays.parallelPrefix(d, (a,b)->a+b);
		System.out.println(Arrays.toString(d));
		/**
		 * parallelSetAll(int[] array, IntUnaryOperator generator)
		 * c 下标
		 */
		Arrays.parallelSetAll(d, c->d[c]+1);
		System.out.println(Arrays.toString(d));
		/**
		 * sort(int[] a, int fromIndex, int toIndex)
		 */
		Arrays.sort(i,0,5);
		System.out.println(Arrays.toString(i));
		/**
		 * parallelSort(int[] a)
		 * parallelSort(int[] a, int fromIndex, int toIndex)
		 * fromIndex - 要排序的第一个元素的索引（包括） 
		 * toIndex - 要排序的最后一个元素的索引，排他 
		 */
		Arrays.parallelSort(d,2,5);
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.stream(i).max());
		System.out.println(Arrays.stream(i).min());
		System.out.println(Arrays.stream(i).average());
		System.out.println(Arrays.stream(i).sum());
		System.out.println(2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
		long s = System.currentTimeMillis();
		System.out.println(4*4*4*4*4*4*4*4*4*4*4*4*4*4*4);
		long e = System.currentTimeMillis();
		System.out.println("总用时："+(e-s));
		s = System.currentTimeMillis();
		System.out.println(1<<30);
		e = System.currentTimeMillis();
		System.out.println("总用时："+(e-s));
//		Arrays.spliterator(array);
	}

}
