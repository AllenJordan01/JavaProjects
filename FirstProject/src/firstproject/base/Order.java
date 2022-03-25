
package firstproject.base;

import java.math.BigDecimal;
/**
 * @author Allen Jordan
 * @version 1.0.0
 * @see BigDecimal
 * @since release 1.0.0
 */
public class Order {
    private final String code;
    private final BigDecimal totalValue;
    
    /**
     * Construtor da classe
     * @param code  Código do pedido
     * @param totalValue Valor total do pedido
     */
    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }
    
    /**
     * Calcula as taxas de acordo com o valor total do pedido. Se o pedido for maior que R$100,00 uma taxa é cobrada.
     * 
     * @return Valor total do pedido com as taxas.
     * @throws RuntimeException Se o valor do pedido for negativo.
     */
    public BigDecimal calculateFee() throws RuntimeException {
        if (this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido nao pode ter valor negativo");
        } 
        
        if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
    }
        return this.totalValue;
    }
    
     @Override
    public String toString(){
        return "Order={" + "code= '" + code + "'," + totalValue + "}"; 
}
}
