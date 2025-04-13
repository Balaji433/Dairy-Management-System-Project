package com.KrushiSevaCenter.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.KrushiSevaCenter.entity.Farmer;
import com.nt.entity.Employee;


public interface FarmerDao extends JpaRepository<Farmer, Integer> {

	
	@Modifying
    @Transactional
    @Query(value = "UPDATE farmers SET name = :name WHERE id = :id", nativeQuery = true)
    int updateFarmerNameById(@Param("id") Integer id, @Param("name") String name);
	
	 List<Farmer> findAll();

	
	@Modifying
	@Transactional
	@Query(value = "UPDATE farmers SET address = :address WHERE id = :id", nativeQuery = true)
	int updateFarmerAddressById(@Param("id") Integer id, @Param("address") String address);

	List<Farmer> findByNameContainingIgnoreCase(String name);

}
