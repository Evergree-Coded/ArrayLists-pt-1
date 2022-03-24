import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    //ArrayList<Integer> numbers = new ArrayList<Integer>();
    /*printArray(numbers);
    numbers.add(1);
    printArray(numbers);
    numbers.add(3);
    printArray(numbers);
    numbers.add(5);
    printArray(numbers);
    numbers.add(3, 7);*/
    ArrayList<Integer> number1 = new ArrayList<Integer>();
    number1.add(2);
    number1.add(4);
    number1.add(6);
    number1.add(8);
    printArray(number1);
    int index = number1.indexOf(4);
    number1.remove(index);
    printArray(number1);
    

    //System.out.println(numbers.indexOf(10));
    
  }

  public static void printArray(ArrayList<Integer> numbers){
    for(int i = 0; i < numbers.size(); i++){
      System.out.println(numbers.get(i));
    }
    System.out.println();
  }
}