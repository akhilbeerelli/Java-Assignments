//import java.util.ArrayList;

public class ProductDB extends Order {
	
//	public int ProductId;
//    public String name;
//    public String description;
//    public int price;
//    public int quantity;
	
	String[][] product={{"2","name","description","100","1000"},{"4","name","description","200","100"}};
	
	  
	
	

      public String getId(int i,int j){
    	  return product[i][j];
      }
      public void setId(){
    	  this.product[0]=product[0];
      }
      public String getQuantity(int i){
    	  return product[i][4];
      }
      public String getPrice(int i){
    	  return product[i][3];
      }
      
    
    
    
    
    
	
	
 
}
