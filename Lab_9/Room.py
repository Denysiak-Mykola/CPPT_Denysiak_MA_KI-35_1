# Room.py

# Room class

class Room:

    # Constructor

    def __init__(self, name, area):
        self.name = name
        self.area = area

    # Method set name of room
    
    def set_name(self, name):
        self.name = name

    # Method return name of room
    
    def get_name(self):
        return self.name
    
    # Method set area of room

    def set_area(self, area):
        self.area = area

    # Method return area of room
    
    def get_area(self):
        return self.area