package cat.itacademy.proyectoerp.util;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cat.itacademy.proyectoerp.domain.Order;


public class GroupOrdersByYearImpl implements IGroupOrdersByTimeFrame {

	@Override
	public List<Integer> groupOrders(List<Order> listOrders) {
	

		int counter = 1;		
		int yoy = -1;
		List<Integer> listCountOrders = new ArrayList<Integer>();
		
		
		Collections.sort(listOrders, new YearComparator());
		for (Order order : listOrders) {

			if (yoy != getYear(order.getDate())) {
				
				yoy = getYear(order.getDate());
				listCountOrders.add(counter);
				counter = 1;
				

			} else {

				counter++;
			}

			
		}
		
		return listCountOrders;

	}
	
	
	 private class YearComparator implements Comparator<Order> {

	       	@Override
			public int compare(Order o1, Order o2) {
				
				Date d1 = o1.getDate();
				Date d2 = o2.getDate();
				
				 int result = getYear(d1) - getYear(d2);
		            if (result == 0) {
		                result = d1.compareTo(d2);
		            	
		            	
		            }
		            return result;
			}

	    }

	    protected  int getYear(Date date) {
	        return date.toLocalDate().getYear();
	    }
	
}
