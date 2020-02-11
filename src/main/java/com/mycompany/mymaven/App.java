package com.mycompany.mymaven;
import com.mycompany.mymaven.Choclate.*;
import com.mycompany.mymaven.Sweets.*;
import com.mycompany.mymaven.Gift;
/**
 * Hello world!
 *
 */
import com.mycompany.mymaven.Choclate.Choc;
import com.mycompany.mymaven.Choclate.DairyMilk;
import com.mycompany.mymaven.Sweets.GulabJamun;
import com.mycompany.mymaven.Sweets.Kheer;
import com.mycompany.mymaven.Sweets.Laddu;
import com.mycompany.mymaven.Sweets.Sweet;
import java.util.ArrayList;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner io = new Scanner(System.in);
        Choc s1 = new Cadbury("Temptations",100,10);
        Choc s2= new  DairyMilk("Cruch",100,20);
        Sweet s3= new GulabJamun("Jamun",100,5);
        Sweet s4=new Kheer("Kheer",10,10);
        Sweet s5=new Laddu("Laddu",15,15);
        Gift gift=new Gift();
        System.out.println("Sorting Sweets according to price");
        gift.addChoclates(s1,s2);
        gift.addSweets(s3,s4,s5);
        gift.sort();
        int ch=0;
        while(ch<4)
        {
            System.out.println("Enter '1' to view all sweets :\nEnter '2' to view all choclates :\nEnter '3' to get the total price of all items : ");
            System.out.println("Enter '5' to exit");
            ch=io.nextInt();
            switch (ch){
                case 1:{
                    ArrayList<Sweet> arrayList1=gift.getSweets();
                    for (Sweet s:arrayList1){
                        System.out.println(s.toString());
                    }
                    break;
                    }
                case 2:{
                    ArrayList<Choc> arrayList1=gift.getChoclates();
                    for (Choc s:arrayList1){
                        System.out.println(s.toString());}
                    break;
                }
                case 3:{
                    System.out.println("Total Price:"+(gift.getTotalPriceChoclate())+(gift.getTotalPriceSweet()));
                    break;
                }
            }
        }
    }
}
