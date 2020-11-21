/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan53rabbitoo;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF-1
 * 10119024
 */
public class If110119024Latihan53RabbitOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is ".concat(rabbit.getName()));
        System.out.println(rabbit.getName().concat(" is Vegetarian? ") + rabbit.isVegetarian());
        System.out.println(rabbit.getName().concat(" eats ").concat(rabbit.getEats()));
        System.out.println(rabbit.getName().concat(" has ") + rabbit.getNoOfLegs() + " legs");
        System.out.println(rabbit.getName().concat(" has ").concat(rabbit.getColor()));
    }
    
}
