#create_matrix.py

# A function to create a jagged list containing the shaded areas of a square matrix.

def create_matrix(fill_char, size):
    matrix = []

    for i in range(size):
        n = []
        for j in range(size):
            if i + j >= size - 1:
                n.append(fill_char)
            else:
                n.append(' ')
        matrix.append(n)
    return matrix

# Function for displaying the matrix on the screen.

def print_matrix(matrix):
    for n in matrix:
        print(' '.join(n))