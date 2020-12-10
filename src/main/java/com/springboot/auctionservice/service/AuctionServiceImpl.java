package com.springboot.auctionservice.service;
import com.springboot.auctionservice.model.*;
import com.springboot.auctionservice.exception.*;
import com.springboot.auctionservice.repository.*;


import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component("auctionServiceImpl")
@Service
@Transactional
public class AuctionServiceImpl implements AuctionService {
	private static final Logger LOG = LoggerFactory.getLogger(AuctionServiceImpl.class);
	
	@Autowired
	private  AuctionRepository auctionRepository;
	
	
	
	
	@Override
	public Auction createAuctionItems(Auction auction){
		//auction = new Auction();
		return this.auctionRepository.save(auction);
		
	}
	@Override
	public List<Auction> getAllAuctions(){
		// Optional<Auction> a = this.auctionRepository.findById("abcd");
		return this.auctionRepository.findAll();
		
	}
	@Override
	public List<Auction> getAllAuctionById(String auctionItemID){
		return this.auctionRepository.findAllByID(auctionItemID);
		
	}
	@Override
	public Auction createBids(Auction auction)  {
		if(auction.getCurrentBid() < auction.getReservePrice()){
			//auction.setCurrentBid(auction.getMaxAutoBidAmt());
			System.out.println("Reserve price not met"); 
	//throw new ReservePriceException("Reserve price not met");
	
		 //throw new ReservePriceException(Response.status(Response.Status.NOT_FOUND).entity("Reserve price not met").build());
		}
		/*else {
			if(auction.getCurrentBid() > auction.getMaxAutoBidAmt()){
				throw new Exceptions("You have been outbid for !"+ this.auctionRepository.getOne(auction.getAuctionItemID()));
			}
			//auction.setAuctionItemID(auction.getAuctionItemID());
			//auction.setMaxAutoBidAmt(auction.getMaxAutoBidAmt());
			//auction.setBidderName(auction.getBidderName());
			this.auctionRepository.save(auction);
			LOG.info("A Bid is made for the Item with ItemId"+auction.getItemID()+ "for the the Bid amount" +auction.getCurrentBid());
		}
		return auction;*/
		return this.auctionRepository.save(auction);
	}
	@Override
	public Auction getAuctionById(String auctionItemsID){
		
		return this.auctionRepository.getOne(auctionItemsID);
	}
	
	
	@Override
	public void update(Auction auction){
		Optional<Auction> auction1 = this.auctionRepository.findById(auction.getAuctionItemID());
		
	}
	
}
