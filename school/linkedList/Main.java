package linkedList;

public class Main {
  public static void main(String[] args){
    String inputString = "zach is a test";
    String[] splitString = inputString.split(" ");

    NodeList LL = new NodeList(null);
    for (String s : splitString) {
      LL.addToList(new Node(s));
    }

    LL.printList();
  }
}
