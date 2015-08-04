package resources;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class defines a Printer
public class Printer implements Resource{
	
	// declaring variables
	private String resourceId;
	private int modelYear;
	private Status status;
	private String superVisor;
	private double costOfMaintenance;
	
	public Printer(String resourceId){
		this.setResourceId(resourceId);
		System.out.println("Inside Printer constructor. Printer Created");
	}
	
	// Getters Setters
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getSuperVisor() {
		return superVisor;
	}
	public void setSuperVisor(String superVisor) {
		this.superVisor = superVisor;
	}
	public double getCostOfMaintenance() {
		return costOfMaintenance;
	}
	public void setCostOfMaintenance(double costOfMaintenance) {
		this.costOfMaintenance = costOfMaintenance;
	}
	
	// Checks if the model is old than specified year
	public boolean checkOldModel(int year){
		if(this.getModelYear() < year){
			return true;
		}
		return false;
	}
	
	// Method to display resource details
	public void showResourceDetails(){
		System.out.println("Following are the resource details:");
		System.out.println("Resource type: Printer");
		System.out.println("Resource Id: "+this.getResourceId());
		System.out.println("Model Year: "+this.getModelYear());
		System.out.println("Resource status: "+this.getStatus());
		System.out.println("Supervisor: "+this.getSuperVisor());
	}
	
	// Method to set this resouce inactive
		public void setInactive(){
			this.setStatus(status.inactive);
			System.out.println("Resouce made inactive");
		}
		
		
}
