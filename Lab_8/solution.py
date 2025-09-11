from math import sin
from math import tan as tg
import struct
#Function @solution:
# @filenameResultTxt - name of file in .txt format where result of calculation will be saved
# @filenameResultBin - name of file in .bin format where result of calculation will be saved

def solution(filenameResultTxt , filenameResultBin):

    x = int(input(f"This function calculate function y=sin(x)/tg(4*x).\n Enter your x: "))

    y=sin(x)/tg(4*x)

    with open(filenameResultTxt, "a", encoding="utf-8") as file:
        file.write(f"Result of function y=sin(x)/tg(4*x) whare x = {x} is = {y}\n")
    with open(filenameResultBin, "ab") as file:
        file.write(struct.pack("f", y))

#Funcion @read_txt - function for returning all string in file of .txt format
# @filename - name of file in .txt format to read
def read_txt(filename):
    with open(filename, "r", encoding="utf-8") as file:
        data = file.read()
    return data

#Funcion @read_binary - function for returning all string in file of .txt format
# @filename - name of file in .bin format to read
def read_binary(filename):
    print(f"Containtmant of file {filename} is:")
    with open(filename, "rb") as file:
        while True:
            data = file.read(4)
            if not data:  
                break
            if len(data) < 4:  
                break
            number = struct.unpack("f", data)[0]
            print(number)

