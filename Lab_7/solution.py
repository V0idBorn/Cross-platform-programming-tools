def matrixSquare(rowNColumns , symbol):

    matrix = [[None for _ in range(rowNColumns)] for _ in range(rowNColumns)]

    centre = int(rowNColumns / 2)

    i = 0
    while i < rowNColumns:
        j = 0
        if(i < centre):
            while j < centre:
                matrix[i][j] = symbol
                j+=1
        if(i >= centre):
            j = centre
            while j < rowNColumns:
                matrix[i][j] = symbol
                j+=1
        i += 1
        j = 0
    return matrix

def printMatrix(rowNcolumns, matrix):
    for row in matrix:
        for element in row:
            if element is None:      
                print(" ", end=" ")  
            else:
                print(element, end=" ")
        print()

