package com.cdr.cdrConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdr.cdrConsumer.dto.CDRdto;
import com.cdr.cdrConsumer.entity.CDREntity;

@Repository
public interface CDRRepository extends JpaRepository<CDREntity,Long>{

	void save(CDRdto cdr);

	
}
