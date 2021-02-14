package cat.itacademy.proyectoerp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import cat.itacademy.proyectoerp.service.StatsServiceImpl;



//Class responsible to manage the ERPS's statistics

@RestController
@RequestMapping ("/stats")
public class StatsController {
	
	@Autowired
	StatsServiceImpl statsService;
	
	
	//ORDER STATS  -> Only accessible by a Client (only by the one who does the request) and all Admins 
	
		
		//Get the number of the client's orders for a period divided by a specific time frame (weekly, monthly, yearly)

	    //TODO 
	
	
		//Get the accumulated number of the client's orders 
	
	 	//TODO 
	
	
	
	
	
	
		//Get the number of all orders of all clients for a period divided by a specific time frame (weekly, monthly, yearly) -> Only accessible by all Admins
	
	    //TODO 

	
		//Get the number of all orders of all clients for a period divided by a specific time frame (weekly, monthly, yearly) [Page of Clients] -> Only accessible by all Admins
		
	    //TODO 

		//Get the accumulated number of all orders of all clients -> Only accessible by all Admins
	
	 	//TODO 
	
	
		//Get the accumulated number of all orders classified by all clients -> Only accessible by all Admins
		
	 	//TODO 
         
		//Get the accumulated number of all orders classified by  clients [Page of Clients] -> Only accessible by all Admins
		
	 	//TODO 
	
	
	
	
	
	//OVERALL STATS -> Only accessible by a Client (only by the one who does the request) and all Admins 
	
	
	
	//OVERALL STATS: Products
	
	//TODO: Add methods with Client Pages
	
	
			//Get the number of the different client's products for a period divided by a specific time frame (weekly, monthly, yearly)
		
		    //TODO 
		
		
			//Get the total number of the client's products of a period
		
		 	//TODO 
		
		    
			//Get the product most purchased by a client for a period divided by a specific time frame (weekly, monthly, yearly)
			
		    //TODO
		
		
			//Get the product less purchased by a client for a period divided by a specific time frame (weekly, monthly, yearly)
			
		    //TODO
			
		
			//Get the number of all orders of all clients for a period divided by a specific time frame (weekly, monthly, yearly) -> Only accessible by all Admins
		
		    //TODO 
		
		
			//Get the total number of all orders of all clients for a period -> Only accessible by all Admins
		
		 	//TODO 
		
		
			//Get the product most purchased by all clients for a period divided by a specific time frame (weekly, monthly, yearly) -> Only accessible by all Admins
			
		    //TODO
		
		
			//Get the product less purchased by all clients for a period divided by a specific time frame (weekly, monthly, yearly) -> Only accessible by all Admins
			
		    //TODO
		
			//Get the products never purchased by all clients for a period divided by a specific time frame (weekly, monthly, yearly) -> Only accessible by all Admins
			
		    //TODO
		
		
	    
	
		//OVERALL STATS: Expenses
	
	   //TODO: Add methods with Client Pages
		
			//Get the expenses of a client for a period divided by a specific time frame (weekly, monthly, yearly) 
	
    		//TODO
	
			//Get accumulated expenses of a client 
			
			//TODO
	
			//Get the expenses of all clients for a period divided by a specific time frame (weekly, monthly, yearly) -> Only accessible by all Admins
	
				
			//TODO
		
			//Get the accumulated expenses of clients [Page of Clients] -> Only accessible by all Admins
	
			
			//TODO
	
	
	//EMPLOYEE STATS  > Only accessible by all Admins 	 
	
	 //TODO 
	
	
	
	

}
