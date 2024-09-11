/**
 * Lab3 package
 */
package КІ305.Денисяк.Lab3;

/**
 * Class Office Centre implements Building
 */

public class OfficeCentre extends House implements Building{
	private String company_name;
	private int num_office;
	private boolean IsBuildOpen;
	
	/**
	* Constructor
	* @param <code>adress</code> office centre's adress
	* @param <code>floor</code> office centre's floor
	* @param <code>room</code> office centre's room
	* @param <code>door</code> office centres's door
	* @param <code>window</code> office centre's window
	* @param <code>company_name</code> company name of office centre
	* @param <code>num_office</code> number of offices of office centre
	*/
	
	public OfficeCentre(String adress, Floor floor, Room room, Door door, Window window, String company_name, int num_office) {
		super(adress, floor, room, door, window);
		this.company_name = company_name;
		this.num_office = num_office;
		this.IsBuildOpen = false;
	}
	
	/**
	* Constructor
	* @param <code>adress</code> office centre's adress
	* @param <code>num_office</code> number of offices of office centre
	*/
	
	public OfficeCentre(String adress, int num_office) {
		super(new String(adress), new Floor(10, num_office), new Room("Bos's Ccabinet", 20), new Door("Glass"), new Window("Glass"));
		this.company_name = "Mycrosoft";
		this.num_office = num_office;
		this.IsBuildOpen = false;
	}
	
	/**
     * Method open the office center
     */
	
	public void OpenBuild() {
    	if(!this.IsBuildOpen) {
    		this.IsBuildOpen = true;
    		log("Office centre is opened");
    		log(" ");
    	}
    	else {
    		log("Ofiice centre has already opened");
    		log(" ");
    	}
    }
    
	/**
     * Method close the office center
     */
	
	public void CloseBuild() {
		if(this.IsBuildOpen) {
    		this.IsBuildOpen = false;
    		log("Office centre is closed");
    		log(" ");
    	}
    	else {
    		log("Ofiice centre has already closed");
    		log(" ");
    	}
	}
	
	/**
     * Method check information of office centre
     */
	
	public void BuildingInfo() {
		log("Office Centre info:");
		log("Company: " + this.company_name);
		log("Adress: " + GetAdress());
		log("Numer of office " + this.num_office);
		log("Floors: " + GetNumFloor());
		log("Rooms: " + GetNumRoom());
		log("Office centre: " + (IsBuildOpen ? "open" : "close"));
		log(" ");
	}
	
	/**
     * Method perform maintenance on the office centre
     */

	@Override
	public void Perform() {
		// TODO Auto-generated method stub
		log("Performing maintenance on the Office Center");
		log(" ");
	}

	/**
     * Method checking the condition of the Office Center
     */
	
	@Override
	public void CheckCondition() {
		// TODO Auto-generated method stub
		 log("Checking the condition of the Office Center");
		 log(" ");
	}
}
