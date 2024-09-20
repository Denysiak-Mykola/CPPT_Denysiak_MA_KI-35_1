# Window.py

# Window class

class Window:

    # Constructor

    def __init__(self, window_type):
        self.type = window_type
        self.is_opened = False
    
    # Method set type of window

    def set_type(self, window_type):
        self.type = window_type

    # Method returntype of window

    def get_type(self):
        return self.type

    # Method open window 

    def open(self):
        if not self.is_opened:
            self.is_opened = True
        else:
            print("Window has already opened")

    # Method close window
    
    def close(self):
        if self.is_opened:
            self.is_opened = False
        else:
            print("Window has already closed")

    # Method check window (open/close)

    def is_open(self):
        return self.is_opened