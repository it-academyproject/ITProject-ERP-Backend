package cat.itacademy.proyectoerp.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import cat.itacademy.proyectoerp.domain.Client;
import cat.itacademy.proyectoerp.dto.StatsClientOrderTimeFrameDTO;
import cat.itacademy.proyectoerp.dto.TimeFrameDTOImpl;

@Service
public class StatsOrderServiceImpl implements IStatsService {

	@Autowired
	ClientServiceImpl clientService;
	
	//@Autowired
	//OrderService orderService;
	
	
	
	
	//Get the number of the client's orders for a period divided by a specific time frame (weekly, monthly, yearly) 

   
	
	
	public StatsClientOrderTimeFrameDTO getClientOrdersTimeFrame (UUID idClient, TimeFrameDTOImpl timeFrameDTO) {
	
	//Check if the user exists. If not, throw exception ArgumentNotFoundException
		Client client = clientService.findClientById(idClient).get();
	
	//Check if period and time frame are correct	
		
		 //TODO 
		
	//If the user exists, get all orders of a client of the period
		
		//List<Order> listOrdersPeriod = orderService.getOrdersPeriod(UUID idClient, timeFrameDTO.getPeriodInit(), timeFrameDTO.getPeriodFinal() );
	
		 //TODO 
		
    //Group all orders into a list 
		
		 //TODO 
		
		if (timeFrameDTO.getTimeFrame().equals("weekly")) {
			
			
		} else if (timeFrameDTO.getTimeFrame().equals("monthly")) {
			
			
		} else {
			
			
			
		}
     //TODO 	
	//return new StatsClientOrderTimeFrameDTO();
	
		return null;
		
		
	}	
	
}
