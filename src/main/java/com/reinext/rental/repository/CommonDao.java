package com.reinext.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Common;

@Repository
public interface CommonDao extends JpaRepository<Common, Integer> {

}
