/**
 * Lab2 package
 */
package КІ_305.Денисяк.Lab2;
/**
 * The HouseApp class driver is designed to validate and test the House class 
 */
public class HouseApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        House house = new House();

        try {
        	 house.CheckHouseStatus();
        	 
        	 house.SetRoomName("Kitchen");
        	 house.SetRoomArea(-25);
             house.SetRoomArea(15.5);
             
             house.AddFloor(5);
             house.CheckHouseStatus();

             house.OpenDoor();

             house.OpenWindow();

             house.CloseDoor();
             house.RemoveFloor(6);
             
             house.CheckHouseStatus();

             house.close_log();
        }finally {
        	house.shutdown();
        }
    }

}