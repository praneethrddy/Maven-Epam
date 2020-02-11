/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymaven;

import com.mycompany.mymaven.Choclate.Choc;
import com.mycompany.mymaven.Sweets.Sweet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author prane
 */
public class Gift 
{
    private ArrayList<Sweet> sweets;
    private ArrayList<Choc> choclates;
    public Gift(){
        choclates = new ArrayList<Choc>();
        sweets = new ArrayList<Sweet>();
    }
    public void addChoclates(Choc... choclates){
        this.choclates.addAll(Arrays.asList(choclates));
    }
    public ArrayList<Choc> getChoclates() {
        return choclates;
    }
    public void sort(){
        Collections.sort(choclates);
        Collections.sort(sweets);
    }
    public int getTotalPriceChoclate(){
        int price = 0;
        for(Choc s:choclates){
            price+=s.getPrice();
        }
        return price;
    }
    public void addSweets(Sweet... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }
    public ArrayList<Sweet> getSweets() {
        return sweets;
    }
    public int getTotalPriceSweet(){
        int price = 0;
        for(Sweet s:sweets){
            price+=s.getPrice();
        }
        return price;
    }
}
