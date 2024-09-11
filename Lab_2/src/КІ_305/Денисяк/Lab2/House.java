/**
 * Lab2 package
 */
package КІ_305.Денисяк.Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A class describing a house with rooms, doors, and windows.
 */
public class House {
	private String adress;
	private Floor floor;
	private Room room;
	private Door door;
	private Window window;
	private PrintWriter logger;
	
	/**
	* Constructor
	* @param <code>adress</code> home's adress
	* @param <code>floor</code> home's floor
	* @param <code>room</code> home's room
	* @param <code>door</code> home's door
	* @param <code>window</code> home's window
	*/
	
	public House(String adress,Floor floor, Room room, Door door, Window window) {
		this.adress = adress;
		this.floor = floor;
		this.room = room;
		this.door = door;
		this.window = window;
		init_log();
	}
	
	/**
	* Constructor
	*/
	
	public House() {
		this(new String("Shevchenka 57"), new Floor(2,7), new Room("Bedroom", 15), new Door("Wood"), new Window("Plastic"));
	}
	
	/**
	* Method initializing the logger
	*/
	
	private void init_log() {
		try {
			logger = new PrintWriter(new FileWriter("log.txt", true), true);
		} catch (IOException e) {
			System.err.println("Error initializing logger: " + e.getMessage());
		}
	}
	
	/**
	* Method message logging
	* @param <code>message</code> message for logger
	*/
	
	public void log(String message) {
		if (logger != null) {
			logger.println(message);
		}
	}
	
	/**
	* Method sets the house's adress
	* @param <code>adress</code> home's adress
	*/
	
	public void SetAdress(String adress) {
		this.adress = adress;
	}
	
	/**
	* Method returns the house's adress
	*/
	
	public String GetAdress() {
		return adress;
	}
	
	/**
	* Method add floors for house
	* @param <code>num</code> number of the floors you want to add 
	*/
	
	public void AddFloor(int num) {
		floor.SetFloorNum(floor.GetFloorNum() + num);
	}
	
	/**
	* Method remove floors for house
	* @param <code>num</code> number of the floors you want to remove 
	*/
	
	public void RemoveFloor(int num) {
		if (num <= floor.GetFloorNum()) {
			floor.SetFloorNum(floor.GetFloorNum() - num);
		}
		else {
			System.out.println("Wrong number");
		}
	}
	
	/**
	* Method sets the number of rooms
	* @param <code>num</code> number of the rooms in house
	*/
	
	public void SetNumRoom(int num) {
		floor.SetRoomNum(floor.GetRoomNum() + num);
		log("Number of rooms is " + num);
		log(" ");
	}
	
	/**
	* Method returns the number of rooms
	*/
	
	public int GetNumRoom() {
		return floor.GetRoomNum();
	}
	
	/**
	* Method sets the name of room 
	* @param <code>name</code> name of room
	*/
	
	public void SetRoomName(String name) {
		room.SetName(name);
		log("Room name is " + name);
		log(" ");
	}
	
	/**
	* Method returns the name of room 
	*/
	
	public String GetRoomName() {
		return room.GetName();
	}
	
	/**
	* Method sets the area of room 
	* @param <code>area</code> area of room
	*/
	
	public void SetRoomArea(double area) {
		if (room.GetArea() + area > 0) {
			room.SetArea(area);
			log("Room area is " + area);
			log(" ");
		}
		else {
			System.out.println("Wrong number");
		}
	}
	
	/**
	* Method returns the area of room
	*/
	
	public double GetRoomArea() {
		return room.GetArea();
	}
	
	/**
	* Method open the door
	*/
	
	public void OpenDoor() {
		door.Open();
		log("Door opened");
		log(" ");
	}
	
	/**
	* Method close the door
	*/
	
	public void CloseDoor() {
		door.Close();
		log("Door closed");
		log(" ");
	}
	
	/**
	* Method open the window
	*/
	
	public void OpenWindow() {
		window.Open();
		log("Window opened");
		log(" ");
	}
	
	/**
	* Method close the window
	*/
	
	public void CloseWindow() {
		window.Close();
		log("Window closed");
		log(" ");
	}
	
	/**
	* Method check house's status
	*/
	
	public void CheckHouseStatus() {
		log("House status:");
		log("Adress: " + this.adress);
		log("Floors: " + this.floor.GetFloorNum());
		log("Rooms: " + this.floor.GetRoomNum());
		log("Door's type: " + this.door.GetType());
		log("Door: " + (this.door.IsOpen() ? "open" : "close"));
		log("Window's type: " + this.window.GetType());
		log("Window: " + (this.window.IsOpen() ? "open" : "close"));
		log(" ");
	}
	
	/**
	* Method for correct closing of the logger
	*/
	
	public void close_log() {
		if (logger != null) {
			logger.close();
		}
	}
	
	/**
	* Method to end the program safely
	*/
	
	public void shutdown() {
        try {
        } finally {
            close_log();
        }
    }
}

/**
 * A class describing a floor
 */

class Floor{
	private int floor_num;
	private int room_num;
	
	/**
	 * Constructor
	 * @param <code>floor_num</code> number of floors
	 * @param <code>room_num</code> number of rooms
	 */
	
	public Floor(int floor_num, int room_num) {
		this.floor_num = floor_num;
		this.room_num = room_num;
	}
	
	/**
	* Method sets the number of floor
	* @param <code>floor_num</code> number of floors
	*/
	
	public void SetFloorNum(int floor_num) {
		this.floor_num = floor_num;
	}
	
	/**
	* Method returns the number of floors
	*/
	
	public int GetFloorNum() {
		return floor_num;
	}
	
	/**
	* Method sets the number of rooms
	* @param <code>room_num</code> number of rooms
	*/
	
	public void SetRoomNum(int room_num) {
		this.room_num = room_num;
	}
	
	/**
	* Method returns the number of rooms
	*/
	
	public int GetRoomNum() {
		return room_num;
	}
}

/**
 * A class describing a room
 */

class Room{
	private String name;
	private double area;
	
	/**
	 * Constructor
	 * @param <code>name</code> name of room
	 * @param <code>area</code> area of room
	 */
	
	public Room(String name, double area) {
		this.name = name;
		this.area = area;
	}
	
	/**
	* Method sets the name of room
	* @param <code>name</code> name of room
	*/
	
	public void SetName(String name) {
		this.name = name;
	}
	
	/**
	* Method returns the name of room
	*/
	
	public String GetName() {
		return name;
	}
	
	/**
	* Method sets the area of room
	* @param <code>area</code> area of room
	*/
	
	public void SetArea(double area) {
		this.area = area;
	}
	
	/**
	* Method returns the area of room
	*/
	
	public double GetArea() {
		return area;
	}
}

/**
 * A class describing a door
 */

class Door{
	private String type;
	private boolean is_open;
	
	/**
	 * Constructor
	 * @param <code>type</code> type material of door
	 */
	
	public Door(String type) {
		this.type = type;
		is_open = false;
	}
	
	/**
	* Method sets the type of door
	* @param <code>type</code> type of door
	*/
	
	public void SetType(String type) {
		this.type = type;
	}
	
	/**
	* Method returns the type of door
	*/
	
	public String GetType() {
		return type;
	}
	
	/**
	* Method opened the door
	*/
	
	public void Open() {
		if (this.is_open != true) {
			this.is_open = true;
		}
		else {
			System.out.println("Door has already opened");
		}
	}
	
	/**
	* Method closed the door
	*/
	
	public void Close() {
		if (this.is_open != false) {
			this.is_open = false;
		}
		else {
			System.out.println("Door has already closed");
		}
	}
	
	/**
	* Method check door
	*/
	
	public boolean IsOpen() {
		return is_open;
	}
}

/**
 * A class describing a window
 */

class Window{
	private String type;
	private boolean is_open;
	
	/**
	 * Constructor
	 * @param <code>type</code> type material of window
	 */
	
	public Window(String type) {
		this.type = type;
		is_open = false;
	}
	
	/**
	* Method sets the type of window
	* @param <code>type</code> type of window
	*/
	
	public void SetType(String type) {
		this.type = type;
	}
	
	/**
	* Method returns the type of window
	*/
	
	public String GetType() {
		return type;
	}
	
	/**
	* Method opened the window
	*/
	
	public void Open() {
		if (this.is_open != true) {
			this.is_open = true;
		}
		else {
			System.out.println("Window has already opened");
		}
	}
	
	/**
	* Method closed the window
	*/
	
	public void Close() {
		if (this.is_open != false) {
			this.is_open = false;
		}
		else {
			System.out.println("Window has already closed");
		}
	}
	
	/**
	* Method check window
	*/
	
	public boolean IsOpen() {
		return is_open;
	}
}