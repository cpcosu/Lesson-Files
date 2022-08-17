# Data Structures in Python
Python's built in data-structures are
* Lists
* Dictionaries
* Sets
* Tuples

## Lists
Lists are created using square brackets
```
my_list = [0, 3, 1, 2]
```
If you are familiar with other languages, you may call this an array. 
However, Python lists are different from arrays because their length can change and they can hold data of different types.

To get an item from a list, place square brackets with the index of the element you want to select like so:
```
my_list[1] # will return 3
```

## Dictionaries
Dictionaries are created with curly brackets
```
my_dict = {"key": "value"}
```
This data structure is similar to what other languages would call a map or hashmap.
To add an item to a dictionary, you can use the format
```
my_dict[key] = value;
```

## Sets
Sets are a collection of items, in which no item can be added twice. They are created with curly brackets like so:
```
my_set = {"item1", "item2"}
```
You can add items with `.add(item)`, remove with `.remove(item)` and check if an item is in the set with `if item in my_set`.

## Tuples
Tuples are nearly identical to lists, except they cannot be changed after they are initialized. They are created with parentheses:
```
my_tuple = (0, 3, 1, 2)
```
