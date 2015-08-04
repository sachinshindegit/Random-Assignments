package resources;

public interface Resource {
	public void showResourceDetails();
	public double getCostOfMaintenance();
	public String getResourceId();
	public int getModelYear();
	public Status getStatus();
	public String getSuperVisor();
	public void setInactive();
	public boolean checkOldModel(int year);
}
