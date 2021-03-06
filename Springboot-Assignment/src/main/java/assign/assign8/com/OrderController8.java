package assign.assign8.com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController8 {
	
	@Autowired
	private OrderService orderService;
	
	//get all orders.....
		@RequestMapping("/order")
		public List<Order> getAllOrder(){
			return orderService.getAllOrder();	
		}
		
	//get single order....
		
		@RequestMapping("/order/{id}")
		public Optional<Order> getOrder(@PathVariable String id) {
			return orderService.getOrder(id);
		}
		
		//POST method add order....
		
		@RequestMapping(method = RequestMethod.POST, value="/order")
		public void addOrder(@RequestBody Order orders)
		{
			orderService.addOrder(orders);
		}
		
		//PUT  update Order...
		
		@RequestMapping(method = RequestMethod.PUT, value="/order/{id}")
		public void updateOrder(@RequestBody Order orders, @PathVariable String id)
		{
			orderService.updateOrder(orders);
		}
		
		@RequestMapping(method= RequestMethod.DELETE,value="/order/{id}")
		public void deleteOrder(@PathVariable String id) {
			orderService.deleteOrder(id);
		}

}
