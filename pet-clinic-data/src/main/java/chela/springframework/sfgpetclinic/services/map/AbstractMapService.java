package chela.springframework.sfgpetclinic.services.map;

import chela.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map= new HashMap<>();

	Set<T> findAll(){
		return new HashSet<T>(map.values());
	}

	T findById(ID id){
		return map.get(id);
	}

	T save(T t){
		if (t != null){
			if( t.getId() ==null){
				t.setId(generateId());
			}
			map.put(t.getId(), t);
		}
		else{
			throw new RuntimeException("Object can't be null");
		}
		return t;
	}

	void deleteById(ID id){
		map.remove(id);
	}

	void delete(T t){
		map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(t));
	}
//	Create equals methods on entity objects

	private Long generateId(){
		Long nextId = null;
		try{
			nextId = Collections.max(map.keySet())+1;
		}catch( NoSuchElementException e){
			nextId = 1L; //this will value to the first element I suppose
		}

		return nextId;
	}
}
