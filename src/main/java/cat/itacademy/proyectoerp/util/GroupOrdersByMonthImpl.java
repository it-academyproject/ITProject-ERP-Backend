package cat.itacademy.proyectoerp.util;

import java.sql.Date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cat.itacademy.proyectoerp.domain.Order;


public class GroupOrdersByMonthImpl implements IGroupOrdersByTimeFrame {

	@Override
	public List<Integer> groupOrders(List<Order> listOrders) {
	

		int counter = 1;		
		int moy = -1;
		List<Integer> listCountOrders = new ArrayList<Integer>();
		
		
		Collections.sort(listOrders, new MonthComparator());
		for (Order order : listOrders) {

			if (moy != getMonthOfYear(order.getDate())) {
				
				moy = getMonthOfYear(order.getDate());
				listCountOrders.add(counter);
				counter = 1;
				

			} else {

				counter++;
			}

			
		}
		
		return listCountOrders;

	}
	
	
	 private class MonthComparator implements Comparator<Order> {

	       	@Override
			public int compare(Order o1, Order o2) {
				
				Date d1 = o1.getDate();
				Date d2 = o2.getDate();
				
				 int result = getMonthOfYear(d1) - getMonthOfYear(d2);
		            if (result == 0) {
		                result = d1.compareTo(d2);
		            	
		            	
		            }
		            return result;
			}

	    }

	    protected  int getMonthOfYear(Date date) {
	        return date.toLocalDate().getMonthValue();
	    }
	
}
