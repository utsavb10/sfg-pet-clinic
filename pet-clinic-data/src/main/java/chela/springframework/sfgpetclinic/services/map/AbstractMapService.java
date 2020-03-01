package chela.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T> map= new HashMap<>();

	Set<T> findAll(){
		return new HashSet<T>(map.values());
	}

	T findById(ID id){
		return map.get(id);
	}

	T save(ID id, T t){
		map.put(id, t);
		return t;
	}

	void deleteById(ID id){
		map.remove(id);
	}

	void delete(T t){
		map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(t));
	}
//	Create equals methods on entity objects
}
