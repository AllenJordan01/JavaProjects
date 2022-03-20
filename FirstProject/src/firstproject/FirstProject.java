/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import firstproject.base.Order;
import java.math.BigDecimal;
/**
 *
 * @author Allen Jordan
 */
public class FirstProject {

    public static void main(String[] args) {
        final Order order = new Order("code3642", BigDecimal.valueOf(52.5));
        System.out.println(order);
        System.out.println(order.calculateFee());
    }
    
}
