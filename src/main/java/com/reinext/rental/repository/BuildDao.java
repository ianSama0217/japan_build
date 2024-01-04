package com.reinext.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Build;

@Repository
public interface BuildDao extends JpaRepository<Build, Integer> {

}
