/**
 * Lab 10 Car class
 * @author Nathan T. Moon
 * 
 */
public class Car extends Vehicle {

	private int numDoors;
	private int numPassengers;

	public Car(String aMake, String aModel, String aPlate, int aDoorNum, int aPassengerNum) {
		//call the super constructor
		super(aMake, aModel, aPlate);

		//initialize the Car specific fields
		this.numDoors = aDoorNum;
		this.numPassengers = aPassengerNum;

	}

	/**
	 * Gets the number of doors
	 * @return the number of doors
	 */
	public int getDoors() {
		return this.numDoors;
	}

	/**
	 * Gets the number of passengers
	 * @return the number of passengers
	 */
	public int getPassengers() {
		return this.numPassengers;
	}

	/**
	 * Returns a readable string representing the Car object
	 * @return result the readable string of the Car object
	 */
	@Override
	public String toString() {
		String result = String.format("%d-door %s %s with license %s", this.numDoors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	}

	/** 
	 * Determines if two car objects are equal
	 * @param other the other Object to compare to the Car
	 * @return a Boolean, true if the cars are equal and false otherwise
	 */
	@Override
	public boolean equals(Object other) {
		//return false if the other object is not a Car object
		if(!(other instanceof Car)) {
			return false;
		}

		//cast other to a Car
		Car otherCar = (Car) other;

		//compare the instance variables
		if(this.numDoors == otherCar.getDoors()) {
			if(this.numPassengers == otherCar.getPassengers()) {
				//call the super equals method
				return super.equals(other);
			}
		}

		//otherwise return false
		return false;
	}

	/**
	 * Creates a copy of the Car object
	 * @return carCopy a copy of the Car object
	 */
	public Car copy() {
		//get the instance variables
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		int theDoors = this.numDoors;
		int thePassengers = this.numPassengers;

		//create a new Car object
		Car carCopy = new Car(theMake, theModel, thePlate, theDoors, thePassengers);

		//return the copy
		return carCopy;
	}

}

