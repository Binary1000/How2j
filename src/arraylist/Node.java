package arraylist;

import java.util.ArrayList;
import java.util.List;


public class Node {
	public Node leftNode;
	public Node rightNode;
	public Object value;
	
	public void add(Object object) {
		if(value == null) {
			value = object;
		}else {
			if((Integer) object - (Integer) value <= 0) {
				if(leftNode == null) {
					leftNode = new Node();
				}
				leftNode.add(object);
			}else {
				if(rightNode == null) {
					rightNode = new Node();
				}
				rightNode.add(object);
			}
		}
	}
	
	public List<Object> values(){
		List<Object> list = new ArrayList<Object>();
		if(leftNode != null) {
			list.addAll(leftNode.values());
		}
		list.add(value);
		if(rightNode != null) {
			list.addAll(rightNode.values());
		}
		return list;
	}
	
	public static void main(String[] args) {
		int[] randoms = {154,145,53452,123,31,2,5,43,5,76,57,56,132};
		Node root = new Node();
		for(int number : randoms) {
			root.add(number);
		}
		List<Object> list = root.values();
		for(Object object : list) {
			System.out.println(object);
		}
	}
}
