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
public class Rabbit extends Animal {
    private String color, name;
    
    public Rabbit(String name, boolean vegetarian, String food, int legs, String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getName(){
        return this.name;
    }
}
