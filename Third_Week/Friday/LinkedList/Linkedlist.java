package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月21日 下午10:08:49 类说明
 */
public class Linkedlist {

	LinkedList<Object> lk = new LinkedList<Object>();
	
	public boolean isEmpty() {
		return lk.size()==0?true:false;
	}
	
	public void put (Object o) {
		lk.add(o);
	}
	
	public Object get() {
		Object obj = lk.getFirst();
		lk.removeFirst();
		return obj;
	}

	@Override
	public String toString() {
		return "Linkedlist [lk=" + lk + "]";
	}

	

	

}
