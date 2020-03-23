package Dao;

import java.util.ArrayList;

/**
* @author DaydreaminE
* @version 创建时间：2020年3月23日 下午5:46:29
* 类说明
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dao<T> {
	Map<String, T> map = new HashMap();

	public void save(String id, T entity) {
		map.put(id, entity);
	}

	public T get(String id) {
		T t = null;
		for (String key : map.keySet()) {
			if (key == id) {
				t = map.get(id);
			}
		}
		if (t == null) {
			System.out.println("key值不对");
		}
		return t;
	}

	public void update(String id, T entity) {
		for (String key : map.keySet()) {
			if (id == key) {
				map.replace(id, entity);
			}
		}
	}

	public List<T> list() {
		List<T> list = new ArrayList<T>();
		for (String key : map.keySet()) {
			list.add(map.get(key));
		}
		return list;
	}

	public void delete(String id) {
		String id1 = null;
		for (String key : map.keySet()) {
			if (id == key) {
				id1 = id;
			}
		}
		if (id1 != null) {
			map.remove(id1);
		} else {
			System.out.println("key值不对");
		}
	}

	@Override
	public String toString() {
		return "Dao [map=" + map + "]";
	}
}
