/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymaven.Sweets;

/**
 *
 * @author prane
 */
public class Sweet implements Comparable <Sweet>{
    String name;
     int weight,price;
     public Sweet(String name,int weight,int price)
     {
         this.name=name;
         this.weight=weight;
         this.weight=weight;
     }
     public int getPrice()
     {
         return this.price;
     }
     @Override
     public int compareTo(Sweet o) {
        if(o.price > price)
            return 1;
        if(o.price < price)
            return -1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return "Name:"+name+"   Price:"+price+"\n";
    }
    
}
