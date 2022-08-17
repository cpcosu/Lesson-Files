# Python Overview

## Table of Contents
* [Introduction](#introduction)
* [Environment](#environment)
  * [Testing](#testing)
* [Output](#output)
* [Input](#input)
  * [List of Strings From Line](#list-of-strings-from-line)
  * [List of Numbers From Line](#list-of-numbers-from-line)
  * [Multiple Variables From One Line](#multiple-variables-from-one-line)
  * [Input Until End Of File](#input-until-end-of-file)
  * [List From Multiple Lines](#list-from-multiple-lines)
## Introduction
This guide aims to provide those who are new to competitive programming with the knowledge necessary to get started. Only a basic knowledge of python is necessary to get started. If you have no knowledge, [tutorialspoint](https://www.tutorialspoint.com/python3/index.htm) and [codecademy](https://www.codecademy.com/learn/learn-python) are great places to get started, among others. Python 3 is used here, but Python 2 is very similar and knowledge can be transferred easily.

## Environment
Python can be run in a variety of environments. If you don't already have one, VSCode is a good one.

### Testing
To test your code, you can run the file and paste/type input into the terminal.
However, a faster way of testing input is running your python file with an input file. Write the lines you would have typed/pasted to a file like `input.txt` and execute your code like: 
```bash
python myscript.py < input.txt
```

## Output
Simply use `print()` to provide your solutions output.

## Input
`input()` will given you the next line of input as a string. Since we often work with data that isn't just a string, we need to know how to get input data into the format we want.

### List of Strings From Line
Say you are given a list of strings in the format:
```
cat dog mouse
```
To read this, we could use the code:
```python
animals = input().split()
print(animals) # ['cat', 'dog', 'mouse']
```
`split()` is executed on a string and produces an array of strings seperated by space characters. If you want to split by other characters such as commas, you can pass that as an argument to split, like `split(',')`.

### List of Numbers From Line
If we want to take a list of numbers split by spaces such as:
```
6 41 5 804 2
```
we can use the code
```python
nums = [int(i) for i in input().split()]
print(nums) # [6, 41, 5, 804, 2]
```
This works by first splitting the input string by creating a list filled with each element of the split input casted to an integer. If you are given decimals, you can use `float(i)` instead of `int(i)`

### Multiple Variables From One Line
Sometimes we are given a few numbers on a single line but would rather have each number stored as a variable rather than a list. Suppose we are given the width and height of a grid in a line of input:
```
5 7
```
We can then set the value of these two variables with:
```python
w, h = map(int, input().split())
print(w) # 5
print(h) # 7
```
Similarly, if we are given decimals we can replace `int` with `float`.

### Input Until End of File
Some problems request that you read until the end of input or a blank line. You can watch for a blank line by using
```python
while True:
  line = input()
  if not line: break
  print(line)
```
if input ends without a blank line, use:
```python
while True:
  try:
    line = input()
    print(line)
  except EOFError:
    break
```

### List From Multiple Lines
Sometimes, problem descriptions [(such as this one)](https://open.kattis.com/problems/abridgedreading) will say "These values will be on one or more lines". The problem will have previously given a number of items to be expected in the list, so you just need to check if you need to read another line before moving on. In the previously referenced problem you would use:
```python
desired_length = 10
my_list = []
while len(my_list) != desired_length:
  my_list += [int(i) for i in input().split()]
```
