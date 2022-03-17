
package firstproject.base;

import java.math.BigDecimal;

public class Order {
    private final String code;
    private final double totalValue;
    
    public Order(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }
    
    public double calculateFee() {
        if (this.totalValue > 100) {
            return this.totalValue * 0.99;
        } else {
            return this.totalValue;
        }
    }
    
     @Override
    public String toString(){
        return "Order={" + "code='" + code + "'," + totalValue + "}"; 
}
}
