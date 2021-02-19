package cat.itacademy.proyectoerp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import cat.itacademy.proyectoerp.domain.Client;
import cat.itacademy.proyectoerp.domain.Order;
import cat.itacademy.proyectoerp.dto.StatsClientOrderAccumDTO;
import cat.itacademy.proyectoerp.dto.StatsClientOrderTimeFrameDTO;
import cat.itacademy.proyectoerp.dto.TimeFrameDTOImpl;
import cat.itacademy.proyectoerp.exceptions.ArgumentNotFoundException;
import cat.itacademy.proyectoerp.exceptions.ArgumentNotValidException;
import cat.itacademy.proyectoerp.util.GroupOrdersByMonthImpl;
import cat.itacademy.proyectoerp.util.GroupOrdersByWeekImpl;
import cat.itacademy.proyectoerp.util.GroupOrdersByYearImpl;
import cat.itacademy.proyectoerp.util.IGroupOrdersByTimeFrame;
import cat.itacademy.proyectoerp.util.OrderValidatorImpl;

@Service
public class StatsOrderServiceImpl implements IStatsService {

	@Autowired
	ClientServiceImpl clientService;
	
	@Autowired
	OrderServiceImpl orderService;
	
	@Autowired
	OrderValidatorImpl orderValidator;
	
	// Get the number of the client's orders for a period divided by a specific timeframe (weekly, monthly, yearly)

	public StatsClientOrderTimeFrameDTO getClientOrdersTimeFrame(UUID idClient, TimeFrameDTOImpl timeFrameDTO) {

		// Validate if the timeFrame is correct
		if (orderValidator.checkNotValidTimeFrame(timeFrameDTO))
			throw new ArgumentNotValidException("The specified timeframe is not valid. It must be: W or M or Y ");

		// Check if the user exists. If not, throw exception ArgumentNotFoundException
		Optional<Client> client = clientService.findClientById(idClient);

		if (client.isEmpty())
			throw new ArgumentNotFoundException("The client does not exist");

		// If the user exists, get all orders of a client of the period
		Optional<List<Order>> listOrdersPeriod = orderService.getOrdersClientPeriod(idClient,
				timeFrameDTO.getPeriodInit(), timeFrameDTO.getPeriodFinal());

		if (listOrdersPeriod.isEmpty())
			throw new ArgumentNotFoundException("The client has no orders");

		// Group all orders into a list if there are orders	and count the order for each timeframe	
		
			List<Integer> listCountOrder = new ArrayList<Integer>();
			
			if (timeFrameDTO.getTimeFrame().equals("W")) {
				
		        IGroupOrdersByTimeFrame orderByWeek = new GroupOrdersByWeekImpl();
		        listCountOrder =  orderByWeek.groupOrders(listOrdersPeriod.get());	
		        
			} else if (timeFrameDTO.getTimeFrame().equals("M")) {
				
				IGroupOrdersByTimeFrame orderByMonth = new GroupOrdersByMonthImpl();
		        listCountOrder =  orderByMonth.groupOrders(listOrdersPeriod.get());	
				
				
			} else if (timeFrameDTO.getTimeFrame().equals("Y")) {
				
				IGroupOrdersByTimeFrame orderByYear = new GroupOrdersByYearImpl();
		        listCountOrder =  orderByYear.groupOrders(listOrdersPeriod.get());	
		
			}

		// Create DTO		
		 return new StatsClientOrderTimeFrameDTO(idClient,timeFrameDTO.getTimeFrame(), listCountOrder);

		

	}
	
	
	// Get the accumulated number of the client's orders 
	
	public StatsClientOrderAccumDTO getClientOrdersAccum (UUID idClient) {
		
		// Check if the user exists. If not, throw exception ArgumentNotFoundException
		Optional<Client> client = clientService.findClientById(idClient);

		if (client.isEmpty())
			throw new ArgumentNotFoundException("The client does not exist");

		// If the user exists, get all orders of a client 
		List<Order> listOrders = orderService.findAllOrders();

		if (listOrders.isEmpty())
			throw new ArgumentNotFoundException("The client has no orders");

		// Create DTO: Count all accumulated orders into a list if there are orders
		
		return new StatsClientOrderAccumDTO(idClient,listOrders.size() );
	}
	
	
	
	
}
