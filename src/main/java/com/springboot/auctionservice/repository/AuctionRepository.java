package com.springboot.auctionservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.auctionservice.model.*;
@Repository
public interface AuctionRepository extends  JpaRepository<Auction ,String>{
	
	
    public List<Auction> findAllByID(String auctionItemID);
}

