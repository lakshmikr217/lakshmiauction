package com.springboot.auctionservice;

//import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
//import org.mockito.internal.matchers.Any;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.test.context.ActiveProfiles;

import com.springboot.auctionservice.controller.AuctionController;
import com.springboot.auctionservice.model.Auction;
import com.springboot.auctionservice.repository.AuctionRepository;
import com.springboot.auctionservice.service.AuctionService;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.AssertFactory;

//import org.aspectj.lang.annotation.Before;



@RunWith(TestRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("memory")
public class ApplicationTests {

	@LocalServerPort
	private int Port;
	
	@Mock
	private AuctionService auctionService;
	@Mock
	private Auction auction;
	
	@Autowired
	private TestRestTemplate restTemplate;
	private AuctionController auctionController;
	
	private AuctionRepository auctionRepository;
	
	@Test
	public void test() throws Exception{
		assertThat(auctionController).isNotNull();
	}
	
	@Test
	public void test1() throws Exception{
		HttpEntity<Void> request = new HttpEntity<Void>((Void)null);
		ResponseEntity<Auction> response = this.restTemplate.exchange("http://localhost:" + Port + "/auctionItems", HttpMethod.POST, request, Auction.class);
		auction = response.getBody();
		assertThat(auction).isNotNull();
	
	}
	
	@Test
    public void testWithInvalidAuctionItemId() throws Exception {
    	Auction auction = new Auction();
    	auction.setAuctionItemID("1234");
    	//assertThat(this.auctionService.getAllAuctionById(auction.getAuctionItemID()),is(false));

	
	}
	
	

	

	
	
	
	

}
