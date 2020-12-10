package com.springboot.auctionservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


	@Entity
	@NamedQuery(name = "Auction.findAllByID" , query = "SELECT a FROM Auction a WHERE auctionItemID IN(a.auctionItemID)")
	@Table(name="auction")
	public class Auction implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "itemID")
		private String itemID;
		
		@Column(name = "itemDescription")
		private String itemDescription;
		
		@Column(name = "reservePrice")
		private float reservePrice;
		
		
		@Column(name = "auctionItemID")
		private  String auctionItemID;
		
		@Column(name = "currentBid")
		private  float currentBid;
		
		@Column(name = "bidderName")
		private String bidderName;
		
		@Column(name = "maxAutoBidAmt")
		private float maxAutoBidAmt;
		
		
		
		public String getItemID() {
			return itemID;
		}
		public void setItemID(String itemID) {
			this.itemID = itemID;
		}
		public String getItemDescription() {
			return itemDescription;
		}
		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
		}
		public float getReservePrice() {
			return reservePrice;
		}
		public void setReservePrice(float reservePrice) {
			this.reservePrice = reservePrice;
		}
		public  String getAuctionItemID() {
			return auctionItemID;
		}
		public void setAuctionItemID(String auctionItemID) {
			this.auctionItemID = auctionItemID;
		}
		public float getCurrentBid() {
			return currentBid;
		}
		public void setCurrentBid(float currentBid) {
			this.currentBid = currentBid;
		}
		public String getBidderName() {
			return bidderName;
		}
		public void setBidderName(String bidderName) {
			this.bidderName = bidderName;
		}
		public float getMaxAutoBidAmt() {
			return maxAutoBidAmt;
		}
		public void setMaxAutoBidAmt(float maxAutoBidAmt) {
			this.maxAutoBidAmt = maxAutoBidAmt;
		}
}

