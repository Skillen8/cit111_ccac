/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Simulates basic recorded data about a road trip to Moab, Utah
 * @author Shane
 */
public class RoadTrip {
    public static void main(String[] args){
        
        final double NEDS_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
        
        // declaring and intializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double cashOnHand = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; //declaring varible but not intializing 
        
        
        //simulation of the roadtrip
        System.out.println("*** Road Trip Simulator***");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The cars name is: " + carName);
        System.out.println("Distance to Moab: " + distanceToMoabUtah);
        System.out.println("Number of current passengers: " + currentNumberOfPassengers);
        System.out.println("Trip Budget: " + cashOnHand);
        System.out.println("Distance coverd: " + tripOdometer);
        System.out.println("Destination Reached: " + destinationReached);
        System.out.println("*********************");
        System.out.println();
        System.out.println("Beginning leg 1:");
        
        
        // Calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitch hiker heading west
        System.out.println("Oh, Look! A person who wants to get west too!");
        // Check if there is room in the car, if, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitch hiker");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            // alternative shorter version: currentNumberOfPassengers++
        } //close if()
        
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        
        // deduct $ spent on gas from money remaing and over-write cashOnHand
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        // reprint the varible that i adjusted
        System.out.println();
        System.out.println("**** Variable starts at end of the leg 1****");
        System.out.println("Distance to Moab: " + distanceToMoabUtah);
        System.out.println("Number of current passengers: " + currentNumberOfPassengers);
        System.out.println("Trip Budget: " + cashOnHand);
        System.out.println("Distance coverd: " + tripOdometer);
        System.out.println("Destination Reached: " + destinationReached);
        System.out.println();
        System.out.println();
        
        // reprint status of variables to console
        
        System.out.println("*** Leg 2 ***");
        // add 500 miles for legDistance2
        double leg2 = 500.0;
        legDistance = legDistance + leg2;
        tripOdometer = legDistance;
        System.out.println("Odomoter: " + tripOdometer);
        distanceToMoabUtah = distanceToMoabUtah - leg2;
        //check if there is room for 2 more hitch hikers
        if(carFull == false){
            System.out.println("Car not full, picking up hitch hikers");
        }// close if
        currentNumberOfPassengers = currentNumberOfPassengers + 2;
        // get fuel price for the 500 miles and total of all spent
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        //print stats
        
        
        System.out.println("There are " + currentNumberOfPassengers + " passengers");
        System.out.println("We have traveled " + legDistance + " miles");
        System.out.println("We have $" + cashOnHand + " left");
        System.out.println("Distance to Moab: " + distanceToMoabUtah);
        System.out.println();
        
        System.out.println("*** Leg Distance 3***");
        
        
        //travel remaining distance
        legDistance = distanceToMoabUtah + legDistance;
        System.out.println("we traveled " + legDistance + " miles");
        // odometer
        tripOdometer = legDistance;
        System.out.println("Odomoter reads: " + tripOdometer);
        //Check if there is room for 2 more people
        int hikers = 2;
        System.out.println("More hikers can we fit them?");
        if(currentNumberOfPassengers + hikers <= maxPassengers){
            System.out.println("Able to fit");
            currentNumberOfPassengers = currentNumberOfPassengers + hikers;
        } else {
            System.out.println("Sorry we cant fit both of you");
        }//close if else
                
        //pay for gas and adjust cashOnHand
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("We have $" + cashOnHand + " left");
        //When arrived change boolean
        destinationReached = true;
        System.out.println("Have we Reached Moab? " + destinationReached);
        
        
    } // close main
} // close class RoadTrip
