
public class OrderService  extends ProductDB{	
		ProductDB productDb=new ProductDB();


		public void processOrder(Order order){
			int j=0;
			for(int i=0;i<=1;i++){
	    	if(order.getProductId().equals(productDb.getId(i,j))){
	    		if(order.getQuantity().compareTo(productDb.getQuantity(i))<=0){
	    			System.out.println("order processed");
	    			System.out.println("productid:"+order.getProductId());
	    			System.out.println("quantity ordered:"+ order.getQuantity());
	    			System.out.println("price of the product:"+productDb.getPrice(i));
	    		}else{
	    			System.out.println("insufficient quantity");
	    			System.out.println("productid:"+order.getProductId());
	    			System.out.println("quantity ordered:"+ order.getQuantity());
	    			System.out.println("price of the product:"+productDb.getPrice(i));
	    		}
	    		
	    		
	    	}
			}
	    }
		public static void main(String[] args){
			Order order= new  Order();
			order.setProductId("4");
			order.setQuantity("100");
			OrderService order2=new OrderService();
			
			ProductDB productDb=new ProductDB();
			
			
			
			order2.processOrder(order);
			
			
			
		}
		

		
		
	}


