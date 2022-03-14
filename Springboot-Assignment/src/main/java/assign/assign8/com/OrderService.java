package assign.assign8.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
	
		
		@Autowired
		private OrderRepository orderRepository;
		
		public List<Order>getAllOrder()
		{
			List<Order> orders = new ArrayList<>();
			orderRepository.findAll()
			.forEach(orders::add);
			return orders;
		}
		
		public Optional<Order> getOrder(String id) {
			//return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
			return orderRepository.findById(id);
		
		}
		
		//POST
		public void addOrder(Order orders) {
			orderRepository.save(orders);
		}
		
		//PUT update
		public void updateOrder(Order orders) {
			orderRepository.save(orders);
		}

		public void deleteOrder(String id) {
			orderRepository.deleteById(id);
		}

	}


