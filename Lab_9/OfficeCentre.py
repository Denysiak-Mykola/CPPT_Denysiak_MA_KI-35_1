# OfficeCentre.py

from House import House, Floor, Room, Door, Window

# Oficce centre class

class OfficeCentre(House):

    # Constructor

    def __init__(self, address=None, floor=None, room=None, door=None, window=None, company_name="Mycrosoft", num_office=10):
        if address and floor and room and door and window:
            super().__init__(address, floor, room, door, window)
        else:
            super().__init__("Shevchenka 57", Floor(10, num_office), Room("Boss's Cabinet", 20), Door("Glass"), Window("Glass"))
        self.company_name = company_name
        self.num_office = num_office
        self.is_build_open = False

    # Method open building

    def open_build(self):
        if self.is_build_open == False:
            self.is_build_open == True
            print("Office centre is opened\n")
        else:
            print("Office centre has already opened\n")

    # Method close building
    
    def close_build(self):
        if self.is_build_open == True:
            self.is_build_open == False
            print("Office centre is closed\n")
        else:
            print("Office centre has already closed\n")

    # Method show building info

    def building_info(self):
        print("Office centre info:")
        print("Company: %s" %self.company_name)
        print("Adress: %s" %self.get_address())
        print("Number of office: %d" %self.num_office)
        print("Number of floors: %d" %self.get_num_floors())
        print("Number of rooms: %d" %self.get_num_rooms())
        print("Office centre is ", "opened" if self.is_build_open else "closed")

    # Method perform mainstenance

    def perform(self):
        print("Performing maintenance on the Office centre")

    # Method check condirion

    def check_condition(self):
        print("Checking the condition of the Office centre")