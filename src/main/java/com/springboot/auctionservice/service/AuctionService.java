package com.springboot.auctionservice.service;

import java.util.List;



import com.springboot.auctionservice.model.Auction;


public interface AuctionService {
	
	Auction createAuctionItems(Auction auction);
	Auction createBids(Auction auction) ;
	void update(Auction auction);
	
	List < Auction > getAllAuctions();
	Auction getAuctionById(String auctionItemsID);
    List<Auction> getAllAuctionById(String auctionItemsID);

   // void deleteAuction(String itemID);

}
