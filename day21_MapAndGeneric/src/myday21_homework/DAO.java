package myday21_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DAO<T> {

	Map<String, T> map = new HashMap();

	public DAO() {

	}

	public DAO(Map<String, T> map) {
		super();
		this.map = map;
	}

	public void save(String id, T entity) {
		map.put(id, entity);
	}

	public T get(String id) {
		return map.get(id);
	}

	public void update(String id, T entity) throws Exception {
		if (map.containsKey(id)) {
			map.put(id, entity);
		} else {
			throw new Exception("输入id不存在");
		}
	}

	public List<T> list() {
		List<T> list = new ArrayList<>();
		list.addAll(map.values());
		return list;

	}

	public void delete(String id) {
		map.remove(id);
	}

	@Override
	public String toString() {
		return "DAO [map=" + map + "]";
	}

}
