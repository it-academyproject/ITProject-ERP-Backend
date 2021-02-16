package cat.itacademy.proyectoerp.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.proyectoerp.dto.StatsClientOrderAccumDTO;
import cat.itacademy.proyectoerp.dto.StatsClientOrderTimeFrameDTO;
import cat.itacademy.proyectoerp.dto.TimeFrameDTOImpl;
import cat.itacademy.proyectoerp.service.StatsOrderServiceImpl;
import cat.itacademy.proyectoerp.util.WrapperResponse;



//Class responsible to manage the ERPS's statistics

@RestController
@RequestMapping ("/stats")
public class StatsController {
	
	@Autowired
	StatsOrderServiceImpl statsService;
	
	
	//ORDER STATS  -> Only accessible by a Client (only by the one who does the request) and all Admins 
	
		
		//Get the number of the client's orders for a period divided by a specific time frame (weekly, monthly, yearly) 

	    //TODO 
	
		
	    @PutMapping (value="/orders/{idClient}")
	    public ResponseEntity<WrapperResponse<StatsClientOrderTimeFrameDTO>> getClientOrdersTimeFrame(@PathVariable UUID idClient, @RequestBody TimeFrameDTOImpl timeFrameDTO) {
	        
	   
	    	
	    	
	    	
	    	//new WrapperResponse<>(true, "statistics fetched", gameMapper.fromAllEntitiesByUser(user, listGamesByUser))
			//		.createResponse();
	       
	    	return null;
	    }

	
	
		//Get the accumulated number of the client's orders 
	
	 	//TODO 
	    
	    
	    @PutMapping (value="/orders/accum/{idClient}")
	    public ResponseEntity<WrapperResponse<StatsClientOrderAccumDTO>> getAccumClientOrders(@PathVariable UUID idClient) {
	        
	    	//new WrapperResponse<>(true, "statistics fetched", gameMapper.fromAllEntitiesByUser(user, listGamesByUser))
			//		.createResponse();
	       
	    	
	        return null;
	    }
	    
	
	
	
	
	
	
		//Get the number of all orders of all clients for a period divided by a specific time frame (weekly, monthly, yearly) [Page of Clients] -> Only accessible by all Admins
	
	    //TODO 
         
	  
	    /*@PutMapping (value="/orders")
	    public ResponseEntity<WrapperResponse> getAllClientOrdersTimeFrame(@RequestBody TimeFramePageDTO) {
	        
	    	  Pageable page = PageRequest.of(pageNumber, pageSize);
	    	  
	        return null;
	    }

	    */
	    
		

		//Get the accumulated number of all orders classified by clients [Page of Clients]-> Only accessible by all Admins
	
	 	//TODO 
	
	    
	    /*
	    @PutMapping (value="/orders/accum")
	    public ResponseEntity<WrapperResponse<null>> getAllAccumClientOrders(@RequestBody PageDTO) {
	        
	    	
	        return null;
	    }

	
	    */
	
	
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
