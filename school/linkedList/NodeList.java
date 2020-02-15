package linkedList;

public class NodeList {
  private ListItem head;

  public NodeList(ListItem head){
    this.head = head;
  }

  private void setHead(ListItem head) {
    this.head = head;
  }

  public boolean addToList(ListItem item) {
    if (this.head == null) {
      this.head = item;
      return true;
    }

    ListItem currentNode = this.head;
    while(currentNode != null) {
      // System.out.println("testing");
      int compare = currentNode.compareTo(item);
      if (compare < 0) {
        if (currentNode.next() != null) {
          currentNode = currentNode.next();
        } else {
          currentNode.setNext(item).setPrevious(currentNode);
          return true;
        }
      } else if (compare > 0) {
          if (currentNode.previous() != null) {
            item.setNext(currentNode);
            currentNode.previous().setNext(item).setPrevious(currentNode.previous());
          } else {
            currentNode.setPrevious(item).setNext(currentNode);
            setHead(item);
          }
          return true;
      } else {
        System.out.println("Entry already in the list");
        return false;
      }
    }

    return false;
  }

  public void printList() {
    ListItem currentNode = this.head;
    while(currentNode != null) {
      System.out.println(currentNode.getValue());
      currentNode = currentNode.next();
    }
  }
}
