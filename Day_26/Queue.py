queue = []

queue.append(input("Enter 1st element: "))
queue.append(input("Enter 2nd element: "))
queue.append(input("Enter 3rd element: "))
  
print("Initial queue")
print(queue)
  
print("Elements dequeued from queue")
print(queue.pop(0))
print(queue.pop(0))
print(queue.pop(0))
  
print("Queue after removing elements")
print(queue)