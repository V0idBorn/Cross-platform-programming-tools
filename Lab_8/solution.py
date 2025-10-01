from math import sin
from math import tan as tg
import struct

def solution(filenameResultTxt , filenameResultBin):

    x = int(input(f"This function calculate function y=sin(x)/tg(4*x).\n Enter your x: "))

    y=sin(x)/tg(4*x)

    with open(filenameResultTxt, "a", encoding="utf-8") as file:
        file.write(f"Result of function y=sin(x)/tg(4*x) whare x = {x} is = {y}\n")
    with open(filenameResultBin, "ab") as file:
        file.write(struct.pack("f", y))


def read_txt(filename):
    with open(filename, "r", encoding="utf-8") as file:
        data = file.read()
    return data

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

