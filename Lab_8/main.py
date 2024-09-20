# main.py

from calc_fio import calc, WriteTxt, ReadTxt, WriteBin, ReadBin
import sys

# Іmplements my equation, writes and reads a text and binary file

if __name__ == "__main__":
    x = float(input("Enter x: "))
    try:
        res = calc(x)
        print(f"Result: {res}")

        WriteTxt("TextRes.txt", res)
        print("Result text: {0}".format(ReadTxt("TextRes.txt", res)))
        WriteBin("BinRes.bin", res)
        print("Result bin: {0}".format(ReadBin("BinRes.bin", res)))
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)
    except ArithmeticError as e:
        print(e)
        sys.exit(1)