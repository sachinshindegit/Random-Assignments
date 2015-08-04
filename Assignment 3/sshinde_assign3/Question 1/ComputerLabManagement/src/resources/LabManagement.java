package resources;

public class LabManagement {

	public static void main(String[] args) {
		// Creating work station 1
		WorkStation workstation1 = new WorkStation("workStation1");
		workstation1.setCostOfMaintenance(200);
		workstation1.setModelYear(2007);
		workstation1.setStatus(Status.active);
		workstation1.setSuperVisor("SuperVisor1");
		
		// Creating work station 2
		WorkStation workstation2 = new WorkStation("workStation2");
		workstation2.setCostOfMaintenance(400);
		workstation2.setModelYear(2004);
		workstation2.setStatus(Status.active);
		workstation2.setSuperVisor("SuperVisor2");
		
		// Creating Printer 1
		Printer printer = new Printer("printer1");
		printer.setCostOfMaintenance(300);
		printer.setModelYear(2009);
		printer.setStatus(Status.active);
		printer.setSuperVisor("SuperVisor5");
		
		// Creating Printer 2
		Printer printer2 = new Printer("printer2");
		printer2.setCostOfMaintenance(600);
		printer2.setModelYear(2002);
		printer2.setStatus(Status.active);
		printer2.setSuperVisor("SuperVisor8");
		
		System.out.println();
		System.out.println("Testing of the application begins");
		System.out.println();
		
		System.out.println("Test a");
		System.out.println("Creating clusterA and clusterB");
		ComputerCluster clusterA = new ComputerCluster("clusterA");
		ComputerCluster clusterB = new ComputerCluster("clusterB");
		
		System.out.println();
		System.out.println("Test b");
		System.out.println("Adding 2 workstations and a printer to clusterA");
		clusterA.addResource(workstation1);
		clusterA.addResource(workstation2);
		clusterA.addResource(printer);
		
		System.out.println("Adding clusterA and a printer to Cluster B");
		clusterB.addResource(clusterA);
		clusterB.addResource(printer2);
		
		System.out.println();
		System.out.println("Test c");
		System.out.println("Removing Printer2 from Cluster B");
		clusterB.removeResource("printer2");
		
		System.out.println();
		System.out.println("Test d");
		System.out.println("Computing the cost of Maintenance for cluster B");
		double cost = clusterB.getCostOfMaintenance();
		System.out.println("Cost of Maintenance of Cluster B is: "+cost);
		
		System.out.println();
		System.out.println("Test e");
		System.out.println("Lets check whether workstation2 is older than 2006");
		System.out.println("Checking");
		if(workstation2.checkOldModel(2006)){
			System.out.println("Yes Workstation2 is older than 2006");
		}
		
		System.out.println();
		System.out.println("Test f");
		System.out.println("Lets check the resources in ClusterB which are older than 2010");
		System.out.println("Checking");
		clusterB.showOlderModels(2010);
		
		System.out.println();
		System.out.println("Test g");
		System.out.println("Lets check Workstation1 resource details");
		workstation1.showResourceDetails();
		System.out.println("Lets check clusterB resource details");
		System.out.println("Following are the resource details from cluster B");
		System.out.println();
		clusterB.showResourceDetails();
		
		System.out.println();
		System.out.println("Test h");
		System.out.println("Lets make printer 2 inactive");
		printer.setInactive();
		
		System.out.println();
		System.out.println("Test i");
		System.out.println("Lets make Printer2 added to clusterB as inactive");
		clusterB.setInactive("printer2");
		
	}
	
	
	
}
