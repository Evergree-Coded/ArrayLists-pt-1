# ArrayLists
### What is an ArrayList

An **ArrayList** is a way to store a list of objects. 

Unlike an array, an arraylist has an "infinite size" and can grow or shrink as you need.  

Similar to arrays, the last spot in an arraylist will be the size of the array minus 1. 

[1, 2, 3, 4, 5] //array 
 0  1  2  3  4

{1, 2, 3, 4 ,5} //arraylist
 0  1  2  3  4

 ### Initialization
 In Java, an arraylist is also an object. We need to use the keyword *new* when creating an arraylist.

The layout for initializing the arraylist is as follows:

//arraylist of integers
 ```java
ArrayList<Integer> data = new ArrayList<Integer>();
 ```
 In this example, we created an ArrayList with type Integer using the Integer class.

 ### Finding Size and Index in an ArrayList
 For ArrayLists, size is computed using the **.size()** method. This is helpful as you might have a list of unknown size.

 ```java
int arraylistSize = data.size();
 ```

 Finding the index of a value in a list is easier than it was when using arrays. With arrays, we needed to iterate through the array to find the value we were looking for. 

With ArrayLists, we need to use the **.indexOf()** method. 

```java
int index = data.indexOf(2);
```

**Note:** If the value is not found, .indexOf() will return -1.

**Note:** If there are multiple instance of repeat objects in an arraylists, .indexOf() method will return the index of the first instance of the object. VERY COMMON!!!

### Insertion and Deletion
To add or insert a value into your arraylist, you need to use the **.add()** method. 

There are two ways to add a value to your list.

### First Method: Add value to the end of your list
To add a value to the end of your list, you will use the **.add()** method with the value you want to add.

Example: if you wanted to add 1, 2, and 3 to our arraylist called data
```java
data.add(1); // {1}
data.add(2);// {1, 2}
data.add(3);// {1, 2, 3}
```

### Second Method: Add value to a certain index of your list

**Note:** If you want to add a value to a certain index of your list, you need to make sure that the index you want to add the value to is less than or equal to the size of the arraylist.

To add a value at a certain index, you will need to know which index to add the value and use the **.add(int index, Object o)** method.

//example is adding value 10 at index 5
```java
data.add(5, 10)
```

**Note:** When you use the second method to add a value to an ArrayList, this will shift all of the values from that index to the end of the list to the right.

{1, 2, 3}
data.add(0, 4)
{4, 1, 2, 3}

To delete a value into your list, you need to use the **.remove(int index)** method. 

When using this method, you first need to use the **.indexOf()** method.

Example: We want to remove 2 from the list
```java
int index = data.indexOf(2);
data.remove(index);
```