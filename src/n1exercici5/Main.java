package n1exercici5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(3);
		nums.add(5);
		nums.add(8);
		nums.add(12);
		List<Integer> nums2 = new ArrayList<Integer>();
		
		/////////////////Primera opción////////////////
		/*
		ListIterator li = nums.listIterator(nums.size());
		while(li.hasPrevious()) {
			nums2.add((int)li.previous());
		}
		*/
		
		////////////////Segunda opción//////////////
		Collections.reverse(nums);
		Iterator<Integer> mi_it = nums.iterator();
		while(mi_it.hasNext()) {
			nums2.add(mi_it.next());
		}
		
		
		
		System.out.println(nums2);

	}

}
