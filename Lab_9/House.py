# House.py

from Floor import Floor
from Room import Room
from Door import Door
from Window import Window

# House class

class House:

    # Constructor

    def __init__(self, address="Shevchenka 57", floor=None, room=None, door=None, window=None):
        self.address = address
        self.floor = floor if floor else Floor(2, 7)
        self.room = room if room else Room("Bedroom", 15)
        self.door = door if door else Door("Wood")
        self.window = window if window else Window("Plastic")
        print("House created with address: " + self.address)
    
    # Method set adress

    def set_address(self, address):
        self.address = address

    # Method return adress

    def get_address(self):
        return self.address
    
    # Method add floor

    def add_floor(self, num):
        self.floor.set_floor_num(self.floor.get_floor_num() + num)
        print("Add %d floors" %num)

    # Method remove floor
    
    def remove_floor(self, num):
        if num <= self.floor.get_floor_num():
            self.floor.set_floor_num(self.floor.get_floor_num() - num)
            print("Remove %d floors" %num)
        else:
            print("Wrong number")

    # Method return number of floors

    def get_num_floors(self):
        return self.floor.get_floor_num()
    
    # Method set number of rooms

    def set_num_rooms(self, num):
        self.floor.set_room_num(self.floor.get_room_num() + num)
        print("Number of rooms set to %d" %num)

    # Method return number of rooms

    def get_num_rooms(self):
        return self.floor.get_room_num()
    
    # Method set room's name

    def set_room_name(self, name):
        self.room.set_name(name)
        print("Room name set to %s" %name)

    # Method return room's name

    def get_room_name(self):
        return self.room.get_name()
    
    # Method set room's area

    def set_room_area(self, area):
        if self.room.get_area() + area > 0:
            self.room.set_area(area)
            print("Room area set to %f" %area)
        else:
            print("Wrong number")

    # Method return room's area

    def get_room_area(self):
        return round(self.room.get_area(), 3)
    
    # Method open door

    def open_door(self):
        self.door.open()
        print("Door opened")

    # Method close door

    def close_door(self):
        self.door.close()
        print("Door closed")

    # Method open window

    def open_window(self):
        self.window.open()
        print("Window opened")

    # Method close window

    def close_window(self):
        self.window.close()
        print("Window closed")

    # Method check house status

    def check_house_status(self):
        print("House status:")
        print("Address: %s" %self.address)
        print("Floors: %d" %self.floor.get_floor_num())
        print("Rooms: %d" %self.floor.get_room_num())
        print("Door type: %s" %self.door.get_type())
        print("Door is ", "open" if self.door.is_open() else "closed")
        print("Window type: %s" %self.window.get_type())
        print("Window is ", "open" if self.window.is_open() else "closed")