/**
 * Lab3 package 
 */
package КІ305.Денисяк.Lab3;

/**
 * The Main class driver is designed to validate and test the OfficeCentre  class
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OfficeCentre office_centre = new OfficeCentre("Shevchenka 28", 250);
		
		try {
			office_centre.BuildingInfo(); 
			
			office_centre.OpenBuild();
			office_centre.Perform();
			office_centre.CheckCondition();
			
			office_centre.AddFloor(2);
			office_centre.RemoveFloor(15);
			office_centre.OpenDoor();
			office_centre.OpenWindow();
			office_centre.SetRoomArea(-45);
			
			office_centre.CheckHouseStatus();
			
			office_centre.CloseBuild();
			office_centre.BuildingInfo();
			
			office_centre.close_log();
		}finally {
			office_centre.shutdown();
		}
		
	}

}
