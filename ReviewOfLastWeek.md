# Arraylists

```java
int[] number1 = new int[4];
```
Arraylist:
```java
ArrayList<Integer> number1 = new ArrayList<Integer>();
```

### Add a value to an array

```java
number1[0] = 2;
number1[1] = 4;
number1[2] = 6;
number1[3] = 8;
```

### Adding a value to the arraylist
We want to add the values 2, 4, 6, and 8 to our arraylist

```java
number1.add(2);
number1.add(4);
number1.add(6);
number1.add(8);
```

### Removing a value from an arraylist
We atned to remove the value 4 from the arraylist

```java
int index = number1.indexOf(4);
number1.remove(index);
```