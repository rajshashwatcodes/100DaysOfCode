size = 10
array = [None] * size
top1 = -1
top2 = size

def push1(item):
    global top1
    if top1 < top2 - 1:
        top1 += 1
        array[top1] = item
    else:
        print("Stack 1 Overflow")

def push2(item):
    global top2
    if top1 < top2 - 1:
        top2 -= 1
        array[top2] = item
    else:
        print("Stack 2 Overflow")

def pop1():
    global top1
    if top1 >= 0:
        item = array[top1]
        top1 -= 1
        return item
    else:
        print("Stack 1 Underflow")
        return None

def pop2():
    global top2
    if top2 < size:
        item = array[top2]
        top2 += 1
        return item
    else:
        print("Stack 2 Underflow")
        return None

# Test Code
push1(1)
push2(2)
push1(3)

print(pop1())  
print(pop2())  
print(pop1())  
