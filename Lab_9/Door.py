# Door.py

# Door class

class Door:

    # Constructor

    def __init__(self, door_type):
        self.type = door_type
        self.is_opened = False

    # Method set type of door

    def set_type(self, door_type):
        self.type = door_type

    # Method return type of door

    def get_type(self):
        return self.type
    
    # Method open door

    def open(self):
        if not self.is_opened:
            self.is_opened = True
        else:
            print("Door has already opened")

    # Method close door
    
    def close(self):
        if self.is_opened:
            self.is_opened = False
        else:
            print("Door has already closed")
    
    # Method check door (open/close)
    
    def is_open(self):
        return self.is_opened