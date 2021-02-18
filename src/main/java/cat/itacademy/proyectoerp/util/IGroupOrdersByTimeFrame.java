package cat.itacademy.proyectoerp.util;

import java.util.List;

import cat.itacademy.proyectoerp.domain.Order;

public interface IGroupOrdersByTimeFrame {

	public List<Integer> groupOrders(List<Order> listOrder );
	
}
