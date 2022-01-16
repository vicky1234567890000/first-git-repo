package com.array.demo;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKSortedList {

	public static class Pair implements Comparable<Pair>{

		int li;
		int di;
		int val;

		public Pair(int li, int di, int val) {
			this.li = li;
			this.di = di;
			this.val = val;
		}

		@Override
		public String toString() {
			return "Pair [li=" + li + ", di=" + di + ", val=" + val + "]";
		}

		@Override
		public int compareTo(Pair o) {
			return val-o.val;
		}
		
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		System.out.println("Enter the number of Lists to be merged");
		int noOfLists = s.nextInt();

		int k = noOfLists;

		for (int i = 1; i <= k; i++) {

			System.out.println("Enter the size of " + i + " list");
			int n = s.nextInt();

			ArrayList<Integer> list = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				list.add(s.nextInt());
			}
			lists.add(list);
		}

		System.out.println(lists);

		ArrayList<Integer> result = mergeKSortedLists(lists);
		System.out.println(result);

	}

	public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {

		ArrayList<Integer> rv = new ArrayList<>();
		
		PriorityQueue<Pair> queue = new PriorityQueue<>();

		for(int i=0;i<lists.size();i++) {
			queue.add(new Pair(i,0,lists.get(i).get(0)));
		}
		System.out.println(queue);
		
		while(queue.size()>0) {
			Pair p = queue.remove();
			rv.add(p.val);
			p.di++;
			
			if(p.di<lists.get(p.li).size()) {
				p.val = lists.get(p.li).get(p.di);
		        queue.add(p);
			}
		}
		return rv;
	}

}
