

/**
 * A car class tracks fuel capacity and consumption based on efficiency
 * 
 * @author cheezy
 * @version 9/12/2014
 */
public class Car
{
    /** fuel efficiancy of car in miles per gallon(mpg) */
    private int fuelEfficiency;
    
    /** Ammount of fuel in gas tank measured in gallons */
    private int fuelInTank;
    

    /**
     * constructor that specifies fuel efficiance of this car
     */
    public Car(int efficiency)
    {
        efficiency = this.fuelEfficiency;
        this.fuelInTank = 0;
    }

    /**
     * adds the specified amount of gas to this cars tank.
     *
     *
     * @pre     the specified amount of gas does not exceed the capacity of the cars tank.
     * 
     * @param   gallons     number of galons to add to the car's tank.
     */
    public void addGas(int gallons)
    {
        
    }

    /**
     * the drive method reduces the fuel in the tank based on the specified 
     *              miles and efficiency of the car.
     * 
     * @pre        this method is never invoked with a value for miles 
     *             that consumes more than the available gas in the tank.
     * 
     * @param    miles      number of miles driven
     */
    public void drive(int miles)
    {
        
    }
    
    /**
     * Returns the number of gallons in this car's tank
     * 
     *
     * @return  returns the number of gallons remaining in this cars tank
     */
    public double getGasInTank()
    {
        // put your code here
        return 0;
    }



}
