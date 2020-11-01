/**
 * Listing class contains all of the different features and properties of a listing, as well as the functions to add to a listing.
 * @author hkumte Bravo Team 10/17/20
 *
 */
import java.util.ArrayList;

public class Listing {
  protected String address;
  protected Long numBeds;
  protected double numBaths;
  protected Long squareFootage;
  protected ArrayList<String> amenities;
  protected Long rentCost;
  protected boolean utilitiesIncluded;
  protected String leaseDuration;
  protected boolean canSublet;
  protected Long distanceFromCampus;
  protected boolean isHandicapAccessible;
  protected Long id;
  //protected Type type;

  public Listing(String address, Long numBeds, double numBaths, Long squareFootage,
	      ArrayList<String> amenities, Long rentCost, boolean utilitiesIncluded, String leaseDuration,
	      boolean canSublet, Long distanceFromCampus, boolean isHandicapAccessible/*, Type type*/) {
    this.address = address;
    this.numBaths = numBaths;
    this.numBeds = numBeds;
    this.squareFootage = squareFootage;
    this.amenities = amenities;
    this.rentCost = rentCost;
    this.utilitiesIncluded = utilitiesIncluded;
    this.leaseDuration = leaseDuration;
    this.canSublet = canSublet;
    this.distanceFromCampus = distanceFromCampus;
    this.isHandicapAccessible = isHandicapAccessible;
    //this.type = type;
  }

  /*
   * General methods
   */

  /**
   * Gets the String address of the listing
   * 
   * @return String address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address for the listing
   * 
   * @param address is the listing's address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the Long number of beds of the listing
   * 
   * @return number of beds
   */
  public Long getNumBeds() {
    return numBeds;
  }

  /**
   * Sets the number of beds of the listing
   * 
   * @param numBeds is the number of beds in the listing
   */
  public void setNumBeds(Long numBeds) {
    this.numBeds = numBeds;
  }

  /**
   * Gets the Long number of baths of the listiing
   * 
   * @return the number of baths
   */
  public double getNumBaths() {
    return numBaths;
  }

  /**
   * Sets the number of baths for the listing
   * 
   * @param numBaths the number of baths
   */
  public void setNumBaths(Long numBaths) {
    this.numBaths = numBaths;
  }

  /**
   * Gets the Long square feet of the listing
   * 
   * @return square feet
   */
  public Long getSquareFootage() {
    return squareFootage;
  }

  /**
   * Sets the square feet of the listing
   * 
   * @param squareFootage of the listing
   */
  public void setSquareFootage(Long squareFootage) {
    this.squareFootage = squareFootage;
  }

  /**
   * Gets the array list of amenities
   * 
   * @return amenities of the listing
   */
  public ArrayList<String> getAmenities() {
    return amenities;
  }

  /**
   * Sets the array list of amenities for the listing
   * 
   * @param amenities of the listing
   */
  public void setAmenities(ArrayList<String> amenities) {
    this.amenities = amenities;
  }

  /**
   * Gets the cost of rent for the listing
   * 
   * @return rent cost
   */
  public Long getRentCost() {
    return rentCost;
  }

  /**
   * Sets the cost of rent for the listing
   * 
   * @param rentCost of the listing
   */
  public void setRentCost(Long rentCost) {
    this.rentCost = rentCost;
  }

  /**
   * Gets whether utilities are included for the listing
   * 
   * @return boolean whether utilities are included
   */
  public boolean isUtilitiesIncluded() {
    return utilitiesIncluded;
  }

  /**
   * sets whether utilities are included of the listing
   * 
   * @param bool is utilities included for listing
   */
  public void setUtilitiesIncluded(boolean bool) {
    this.utilitiesIncluded = bool;
  }

  /**
   * Gets the lease duration of the listing
   * 
   * @return the lease duration
   */
  public String getLeaseDuration() {
    return leaseDuration;
  }

  /**
   * Sets the lease duration of the listing
   * 
   * @param leaseDuration of the listing
   */
  public void setLeaseDuration(String leaseDuration) {
    this.leaseDuration = leaseDuration;
  }

  /**
   * Gets whether the listing can be sublet
   * 
   * @return boolean of listing's sublet status
   */
  public boolean isCanSublet() {
    return canSublet;
  }

  /**
   * Sets whether the lease can be sublet
   * 
   * @param bool whether the lease can be sublet
   */
  public void setCanSublet(boolean bool) {
    this.canSublet = bool;
  }

  /**
   * Gets the distance from campus for the listing
   * 
   * @return the distance from campus
   */
  public Long getDistanceFromCampus() {
    return distanceFromCampus;
  }

  /**
   * Sets the distance from campus for the listing
   * 
   * @param distanceFromCampus for the listing
   */
  public void setDistanceFromCampus(Long distanceFromCampus) {
    this.distanceFromCampus = distanceFromCampus;
  }
  
  /**
   * Gets the type value. Maybe an unnecessary method
   * 
   * @return type an enum of the type of residence
   */
  /*
   * public Type getType() { return type; }
   */
  
  /**
   * setType sets the value of Type
   * 
   * @param type an enumerated type of residence
   */
  /*
   * public void setType(Type type) { this.type = type; }
   */
  
  /**
   * Used for tester
   * @return string for tester
   */
  public String prLongData() {
	  String ret = "address: " +address + ", numBeds: " + numBeds + ", numBaths: " + numBaths + ", squareFootage: " + squareFootage + ", amenities: " + amenities + ", rentCost: " + rentCost + ", utilitiesIncluded: " + utilitiesIncluded + ", leaseDuration: " + leaseDuration + ", canSublet: " + canSublet + ", distanceFromCampus: " + distanceFromCampus + ", isHandicapAccessible: " + isHandicapAccessible;
	  return ret;
  }
  
  public void setIsHandicapAccessible() {
    isHandicapAccessible = !isHandicapAccessible;
  }
  
  public boolean getIsHandicapAccessible() {
    return isHandicapAccessible;
  }
  
  public Long getID() {
    return id;
  }
}
