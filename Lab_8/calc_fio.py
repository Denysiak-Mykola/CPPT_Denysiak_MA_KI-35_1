# calc_fio.py

import os
import struct
import math

# Method return tan^2(x)

def calc(x):
    rad = x * math.pi / 180
    if round(math.cos(rad), 10) == 0:
        raise ArithmeticError("Invalid x value: tangent undefined")
    return math.pow(math.tan(rad), 2)

# Method write result in text file

def WriteTxt(fName, res):
    with open(fName, 'w') as f:
        f.write(str(res))

# Method read and return result from text file

def ReadTxt(fName, res):
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                res = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found")
    except FileNotFoundError as e:
        print(e)
    return res

# Method write result in bin file

def WriteBin(fName, res):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', res))

# Method read and return result from bin file

def ReadBin(fName, res):
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                res = struct.unpack('f', f.read()) [0]
        else:
            raise FileNotFoundError(f"File {fName} not found")
    except FileNotFoundError as e:
        print(e)
    return res