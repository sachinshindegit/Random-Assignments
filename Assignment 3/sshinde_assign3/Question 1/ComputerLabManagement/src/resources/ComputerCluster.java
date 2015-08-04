package resources;

import java.util.ArrayList;

/**
 * 
 * @author Sachin Shinde
 *
 */
public class ComputerCluster implements Resource {
	
	//variables declaration
	private String clusterId;
	private String resourceId;
	private Status status;
	private String superVisor;
	private double costOfMaintenance;
	private ArrayList<Resource> resourcesList = new ArrayList<Resource>();
	
	public ComputerCluster(String id){
		this.setResourceId(id);
		this.setClusterId(id);
		System.out.println("Computer Cluster created: "+id);
	}
	// Getters setters
	public String getClusterId() {
		return clusterId;
	}
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public int getModelYear() {
		return 0;
	}
	
	public String getSuperVisor() {
		return superVisor;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public ArrayList<Resource> getResourcesList() {
		return resourcesList;
	}
	public void setResourcesList(ArrayList<Resource> resourcesList) {
		this.resourcesList = resourcesList;
	}
	public void setSuperVisor(String superVisor) {
		this.superVisor = superVisor;
	}

		
	// To add resource to the cluster.
	public void addResource(Resource resource){
		resourcesList.add(resource);
		this.setSuperVisor(resource.getSuperVisor());
		System.out.println("Resource added to "+this.resourceId );
		
	}
	
	// Method to set this resouce inactive
	public void setInactive(){
		this.setStatus(status.inactive);
		System.out.println("Resouce made inactive");
	}
	
	// Method to set this resouce from the cluster inactive
		public void setInactive(String resourceId){
			Resource resource = null;
			for(int i=0;i<resourcesList.size();i++){
				resource = resourcesList.get(i);
				if(resource.getResourceId()==resourceId){
					resource.setInactive();
					return;
				}
			}
			System.out.println("Resource not found in the cluster");
		}
	
	// To deactivate a resource from the cluster
	public void removeResource(String resourceId){
		Resource resource = null;
		for(int i=0;i<resourcesList.size();i++){
			resource = resourcesList.get(i);
			if(resource.getResourceId().equalsIgnoreCase(resourceId)){
				resource.setInactive();
				System.out.println("Resource "+resourceId+" removed");
				return;
			}
		}
		System.out.println("Resource not found in the cluster");
		
	}
	
	// To get the cost of maintenance
	public double getCostOfMaintenance(){
		Resource resource = null;
		double cost = 0;
		for(int i=0;i<resourcesList.size();i++){
			resource = resourcesList.get(i);
			cost = cost + resource.getCostOfMaintenance();
		}
		return cost;
	}
	
	// To get the list of older models
	public void showOlderModels(int year){
		Resource resource = null;
		System.out.println("Following are the resource Ids of older models");
		for(int i=0;i<this.resourcesList.size();i++){
			resource = this.resourcesList.get(i);
			if(resource.checkOldModel(year)){
				System.out.println(resource.getResourceId());
			}
		}
	}
	
	public boolean checkOldModel(int year){
		Resource resource = null;
		for(int i=0;i<this.resourcesList.size();i++){
			resource = this.resourcesList.get(i);
			if(resource.checkOldModel(year)){
				System.out.println(resource.getResourceId());
			}
		}
		return false;
	}
	
	// Method to display resource details
		public void showResourceDetails(){
			Resource resource = null;
			
			for(int i=0;i<this.resourcesList.size();i++){
				resource = this.resourcesList.get(i);
				resource.showResourceDetails();
				//System.out.println("Resource Id: "+resource.getResourceId());
				//System.out.println("Model Year: "+resource.getModelYear());
				//System.out.println("Resource status: "+resource.getStatus());
			}
			System.out.println("ClusterID is: "+this.getClusterId());
			System.out.println("Resource of the cluster Id: "+this.getResourceId());
			System.out.println("Supervisor of the cluster: "+this.getSuperVisor());
		}
}
