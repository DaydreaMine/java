package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月21日 下午10:15:59
* 类说明
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist li = new Linkedlist();
		System.out.println("空"+li.isEmpty());
		li.put("A");
		li.put("BB");
		li.put("C");		
		System.out.println("空"+li.isEmpty());
		Object ob = li.get();
		System.out.println(ob);
		System.out.println(li.toString());
	}

}
