#!/bin/python3

import math
import os
import random
import re
import sys

def timeConversion(s):
    # Write your code here
    time = ":"
    if s[-2:] == "AM":
        s = s.strip("AM")
        t = s.split(":")
        if t[0] == "12":
            t[0] = "00" 
        return time.join(t)
    else:
        s = s.strip("PM")
        t = s.split(":")
        if t[0] == '12':
            t[0] = int(t[0])
        else:
            t[0] = int(t[0]) + 12
        if t[0] >= 24:
            t[0] = t[0] - 24
        t[0] = str(t[0])
        return time.join(t)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()




