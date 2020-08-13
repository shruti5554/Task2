package com.epam.training.home_task_2;

import brandes.*;

import Candies.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Chocolates.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
    	
    	
    	String str = "BRANDES\n  |--Cadbury\n  |--Fererro Rocher\n  |--KitKat\nCHOCOLATES\n  |--Milk Chocolates\n  |--Dark Chocolates\n  |--White Chocolate\nCANDIES\n  |--Gimmies\n  |--Licorice\n  |--Lollipop\n";
    	//System.out.println(str);
   
    	int choice = 0 ;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("*************************************************************");
    	System.out.println("--------WELCOME TO WILLY WONKAS CANDY STORE--------------");
    	System.out.println("*************************************************************");
        do {
         	System.out.println("Enter choice :");
        	System.out.println("1:Display Menu\n2:Display Baskets\n3s:Exit");
        	choice = sc.nextInt();
        	
        	switch(choice)
        	{
        	case 1:
        		System.out.println(str);
        		break;
        		
        	case 2:
        		int c;
        		int totalprice = 0;
        		System.out.println("Enter which basket you want to buy:\n1.New Years Basket\n2.Candy Special Delight Basket\n3.Chocolate Special Basket");
        		c = sc.nextInt() ;
        		switch(c) {
        		case 1:
        			 ArrayList<Object> NewYearsBasket = new ArrayList<Object>() ;
        			  NewYearsBasket.add(new Cadbury());
        			  NewYearsBasket.add(new Cadbury());
        			  NewYearsBasket.add(new FererroRocher()) ;
        			  NewYearsBasket.add(new KitKat());
        			  System.out.println(NewYearsBasket);
        			  System.out.println("Cost : 500");
        			  break;
        		case 2:
        			  ArrayList<Object> CandySpecials = new ArrayList<Object>();
        			  CandySpecials.add(new Candy()); CandySpecials.add(new Candy());
        			  CandySpecials.add(new Gummies()); CandySpecials.add(new Licorice());
        		      CandySpecials.add(new Lollipop());
        		      System.out.println(CandySpecials);
        			  System.out.println("Cost : 400");
        		      break;
        		case 3:
        			 ArrayList<Object> ChocolateSpecial = new ArrayList<Object>();
        			  ChocolateSpecial.add(new Chocolate()); ChocolateSpecial.add(new Chocolate());
        			  ChocolateSpecial.add(new DarkChocolate()) ; ChocolateSpecial.add(new MilkChocolate());
        			  ChocolateSpecial.add(new WhiteChocolate());
        			  System.out.println(ChocolateSpecial);
        			  System.out.println("Cost : 450");
        		      break;
        		
        		
        		}
        		
        	
        		
        	
        		
        	
        	}
        }while(choice != 3);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
