package com.springboot.auctionservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.auctionservice.service.*;
import com.springboot.auctionservice.model.*;


@RestController
public class AuctionController {
	
	
	
	@Autowired(required=true)
	private AuctionService auctionService;

	@PostMapping("/auctionItems")
	public ResponseEntity<Auction> createAuctionItems(@RequestBody Auction auction) {
		//Auction auction = new Auction("abcd","itemDescription",10450.00,1234,0.00,"ABC Dealership",9500.00);
		System.out.println("Creating new auctionitem Id request!");
		return ResponseEntity.ok().body(this.auctionService.createAuctionItems(auction));
		
	}
	
	@PostMapping("/bids")
	public ResponseEntity<Auction> createBids(@RequestBody Auction auction ) {
		return ResponseEntity.ok().body(this.auctionService.createBids(auction));	
	}
	
	@GetMapping("/auctionItems")
	public ResponseEntity < List <Auction>> getAllAuctions(){
		System.out.println("Returning all Auctions!!");
		List<Auction> auc = auctionService.getAllAuctions();
		return ResponseEntity.ok().body(auc);
	}
	
	@GetMapping("/auctionItems/{auctionItemID}")
	public ResponseEntity<List<Auction>> getAllAuctionById(@PathVariable String auctionItemID){
		System.out.println("Return auction by Id");
		List<Auction> aucId = auctionService.getAllAuctionById(auctionItemID);
		return ResponseEntity.ok().body(aucId);
	
	}


}

