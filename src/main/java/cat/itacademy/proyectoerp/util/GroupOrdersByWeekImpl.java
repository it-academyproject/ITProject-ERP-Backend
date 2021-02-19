package cat.itacademy.proyectoerp.util;

import java.sql.Date;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import cat.itacademy.proyectoerp.domain.Order;

public class GroupOrdersByWeekImpl implements IGroupOrdersByTimeFrame {

	@Override
	public List<Integer> groupOrders(List<Order> listOrders) {
	

		int counter = 1;		
		int woy = -1;
		List<Integer> listCountOrders = new ArrayList<Integer>();
		
		
		Collections.sort(listOrders, new WeekComparator());
		for (Order order : listOrders) {

			if (woy != getWeekOfYear(order.getDate())) {
				
				woy = getWeekOfYear(order.getDate());
				listCountOrders.add(counter);
				counter = 1;
				

			} else {

				counter++;
			}

			
		}
		
		return null;

	}
	
	
	 public class WeekComparator implements Comparator<Order> {

	       	@Override
			public int compare(Order o1, Order o2) {
				
				Date d1 = o1.getDate();
				Date d2 = o2.getDate();
				
				 int result = getWeekOfYear(d1) - getWeekOfYear(d2);
		            if (result == 0) {
		                result = d1.compareTo(d2);
		            	
		            	
		            }
		            return result;
			}

	    }

	    protected  int getWeekOfYear(Date date) {
	        WeekFields wf = WeekFields.of(Locale.getDefault());	     
	        return date.toLocalDate().get(wf.weekOfYear());
	    }
	
	

}
