package com.sowmya.DMS.repository;
import java.util.List;

/**
 * @Sowmya Kondepati
 */
import org.springframework.data.repository.CrudRepository;

import com.sowmya.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer>
{
	 List<Dog> findByName(String  name);
	
	
	
	}
