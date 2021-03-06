package com.wright.OOPIntroStocks_Portfolio;

import java.util.ArrayList;

public class PortfolioStockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Bros");
		
		Stock stock1 = new Stock();
		Stock stock2 = new Stock();
		Stock stock3 = new Stock();

		stock1.setName("QYLD");
		stock2.setName("TSLA");
		stock3.setName("MARA");
		stock1.setPrice(22.98);
		stock2.setPrice(800.11);
		stock3.setPrice(44.02);
		
		Portfolio portfolio1 = new Portfolio();
		
		
		portfolio1.setName("Patrick");
		portfolio1.setTotalBalance(1000);
		portfolio1.setDiamondHands(true);
		ArrayList<Stock> patrickStocks = new ArrayList<Stock>();
		patrickStocks.add(stock3);
		patrickStocks.add(stock2);
		
		portfolio1.setStocks(patrickStocks);
	
		System.out.println(String.format("stock 1 info: Name- %s. Price- %s", stock1.getName(), stock1.getPrice()));
		System.out.println(portfolio1.getStocks());
	}
}
