# main.py

from OfficeCentre import OfficeCentre

# main, driver is designed to validate and test the OfficeCentre class

if __name__ == "__main__":
    office_centre = OfficeCentre(address="Main Street 1", num_office=50)
    office_centre.building_info()

    office_centre.open_build()
    office_centre.perform()
    office_centre.check_condition()

    office_centre.add_floor(2)
    office_centre.remove_floor(15)
    office_centre.open_door()
    office_centre.open_window()
    office_centre.set_room_area(20)

    office_centre.check_house_status()

    office_centre.close_build()

    office_centre.building_info()