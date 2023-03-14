package com.jsp.LinkedList;

public class SingleLinkedList {
private Node first=null;
private int count=0;
public void add(Object e) {
	if(first==null) {
		first=new Node(e,null);
		count++;
		return;
	}
	Node last=first;
	while(last.next!=null) {
		last.next=last;
	}
	last.next=new Node(e,null);
	count++;
}
public void add(int index,Object e) {
	if(index<=-1||index>=size()) {
		throw new IndexOutOfBoundsException();
	}
	if(index==0) {
		first=new Node(e,null);
		count++;
		return;
	}
	Node curr=first;
	for(int i=1;i<=index;i++) {
		curr=curr.next;
	}
	curr.next=new Node(e,curr.next);
	count++;

}
public int size() {
	return count;
}
public Object get(int index) {
	if(index<=-1||index>=size()) {
		throw new IndexOutOfBoundsException();
	}
	Node curr=first;
	for(int i=1;i<=index;i++) {
		curr=curr.next;
	}
	return curr.ele;
}
public String toString() {
	if(first==null) return"[]";
	String s="[+first.ele";
	Node curr=first;
	while(curr.next!=null) {
	s=s+","+curr.ele;
	}
	s=s+"]";
	return s;
}
}
