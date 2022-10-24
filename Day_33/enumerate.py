# enumerate function
list_1 = ["yoga", "meditate", "exercise", "sleep" , "travel"]
x = "Python"
  
# creating enumerate objects
object_1 = enumerate(list_1)
object_2 = enumerate(x)
  
print ("Return type:", type(object_1))
print (list(enumerate(list_1)))
  
# changing start index to 4 from 0
print (list(enumerate(x, 4)))

# OUTPUT

'''
Return type: <class 'enumerate'>
[(0, 'yoga'), (1, 'meditate'), (2, 'exercise'), (3, 'sleep'), (4, 'travel')]
[(4, 'P'), (5, 'y'), (6, 't'), (7, 'h'), (8, 'o'), (9, 'n')]
'''