package src;

import java.util.*;

/**
 * Main class for the demo -- testing BlueJ support.
 */

public class Main{
    public static void main(String [] args){
        System.out.println("Welcome to the demo!");

        System.out.println("Is this the Krusty Krab?");

        Restaurant restaurant = new Restaurant();
        
        restaurant.isThisTheKrustyKrab();
    }
}