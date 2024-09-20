# Floor.py

# Floor class

class Floor:

    # Constructor

    def __init__(self, floor_num, room_num):
        self.floor_num = floor_num
        self.room_num = room_num

    # Method set number of floors
    
    def set_floor_num(self, floor_num):
        self.floor_num = floor_num

    # Method return number of room
    
    def get_floor_num(self):
        return self.floor_num
    
    # Method set number of rooms

    def set_room_num(self, room_num):
        self.room_num = room_num

    # Method return number of rooms
    
    def get_room_num(self):
        return self.room_num