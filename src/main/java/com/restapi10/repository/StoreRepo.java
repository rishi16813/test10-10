package com.restapi10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi10.entity.StoreInfo;
@Repository
public interface StoreRepo extends JpaRepository<StoreInfo, Integer> {

}
