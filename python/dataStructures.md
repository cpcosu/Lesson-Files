# Data Structures in Python
Python's built in data-structures are
* Lists
* Dictionaries
* Sets
* Tuples
Beyond this, there are container types which must be imported from the collections library, which comes with python. You can import it by adding
```
from collections import <desired-structure>
```
to the top of your file, where `<desired-structure>` is one of the following:
* [deque](https://docs.python.org/3/library/collections.html#collections.deque)
* [Counter](https://docs.python.org/3/library/collections.html#collections.Counter)

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

## collections.deque
A deque is a linear data type which allows for items to be added or removed from either side, like a combination of a queue and a stack. Assuming you have imported deque from collections, a deque can be created like:
```
my_deque = deque()
```
You can add items to the left with `.append(item)` and append to the left with `.appendleft(item)`. Similarly you can remove from the right side with `.pop()` and the left side with `.popleft()`, which each return the item they removed.

## collections.Counter
A counter is a dictionary that takes in an iterable (like a list, string, etc.) and counts the number of times that each item occurs. For each pair, the key will be the item and the value will be the number of times that it occurs. Assuming you have imported Counter from collections, a Counter can be created like:
```
my_counter = Counter(<my_iterable>)
```
For example, if you passed in the string `"AABBBC"`, the counter would contain: `{'B': 3, 'A': 2, 'C': 1}`
