package com.cbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbs.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver,Integer> {

}
