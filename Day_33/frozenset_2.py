# creating a dictionary
programmer = {"name": "Shashwat", "age": 25, "sex": "Male",
           "college": "Amrita Vishwa Vidyapeetham"}
 
# making keys of dictionary as frozenset
key = frozenset(programmer)
 
# printing dict keys as frozenset
print('The frozen set is:', key)

# OUTPUT

'''
The frozen set is: frozenset({'age', 'sex', 'college', 'name'}
'''