# main.py

from create_matrix import create_matrix, print_matrix

# Main function of the program. Enters the user's data and generates a jagged list.

def main():
    try:
        size = int(input("Enter size: "))

        if size <= 0:
            print("Incorect size matrix")

        fill_char = input("Enter fill char: ")

        if len(fill_char) != 1:
            print("Incorect fill char")
            return
        matrix = create_matrix(fill_char, size)
        print_matrix(matrix)

    except ValueError:
        print("Entered incorect value for matrix's size")
    
if __name__ == "__main__":
    main()