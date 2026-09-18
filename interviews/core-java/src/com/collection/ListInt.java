package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInt {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println(list);

		list.add(2, 30);
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		list.set(2, 80);
		System.out.println(list);
		System.out.println(list.get(3));

		System.out.println(list.lastIndexOf(50));

		System.out.println(list.indexOf(10));

		System.out.println(list.subList(2, 5));

		System.out.println("++++++++++++++++++++++++++++++++++++++++");

		LinkedList<Integer> li = new LinkedList<Integer>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);

		System.out.println(li.element());
		System.out.println(li);
		
		System.out.println(li.peek());
		
		System.out.println(li.peekFirst());
		System.out.println(li.peekLast());
		
		System.out.println(li.offer(50));
		System.out.println(li);
		System.out.println(li.offerFirst(40));
		System.out.println(li);
		System.out.println(li.offerLast(30));
		System.out.println("++++++++++++++++++++++++++");
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s.empty());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search(20));
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v.elementAt(3));
		v.insertElementAt(34, 2);
		System.out.println(v);
		
		System.out.println(v.hashCode());
		System.out.println(v.capacity());
		System.out.println(v.size());

	}
}
