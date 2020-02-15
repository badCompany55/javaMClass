package abstractchall;

public class SearchTree implements NodeList {
  private Item root  = null;

  public SearchTree(Item root) {
    this.root = root;
  }
  
  @Override
  public Item getHead() {
    return this.root;
  };

  @Override
  public boolean addItem(Item item) {
    if (this.root == null) {
      this.root = item;
      return true;
    }

    Item currentItem = this.root;
    while(currentItem != null) {
      int compare = currentItem.myCompareTo(item);
      if (compare < 0) {
        if (currentItem.next() != null) {
          currentItem = currentItem.next();
        } else {
          currentItem.setNext(item);
          return true;
        }
      } else if (compare > 0) {
        if (currentItem.previous() != null) {
          currentItem = currentItem.previous();
        } else {
          currentItem.setPrevious(item);
          return true;
        }
      } else {
        System.out.println(item.getValue() + " is already present.");
        return false;
      }
    }
    return false;
  }

  @Override
  public boolean removeItem(Item item) {
    if (item != null) {
      System.out.println("Deleting item " + item.getValue());
    }

    Item currentItem = this.root;
    Item parentItem = currentItem;

    while (currentItem != null) {
      int compare = currentItem.myCompareTo(item);
      if (compare < 0) {
        parentItem = currentItem;
        currentItem = currentItem.next();
      } else if ( compare > 0) {
        parentItem = currentItem;
        currentItem = currentItem.previous();
      } else {
        performRemoval(currentItem, parentItem);
        return true;
      }
    }
    return false;
  }

  private void performRemoval(Item item, Item parent) {
    if (item.next() == null) {
      if (parent.next() == item) {
        parent.setNext(item.previous());
      } else if (parent.previous() == item) {
        parent.setPrevious(item.previous());
      } else {
        this.root = item.previous();
      }
    } else if (item.previous() == null) {
      if (parent.next() == item) {
        parent.setNext(item.next());
      } else if (parent.previous() == item) {
        parent.setPrevious(item.next());
      } else {
        this.root = item.next();
      }
    } else {
      Item current = item.next();
      Item leftMostParent = item;
      while (current.previous() != null) {
        leftMostParent = current;
        current = current.previous();
        item.setValue(current.getValue());
        if (leftMostParent == item) {
          item.setNext(current.next());
        } else {
          leftMostParent.setPrevious(current.next());
        }
      }
    }
  }

  @Override
  public void traverse(Item head) {
    if (head != null) {
      traverse(head.previous());
      System.out.println(head.getValue());
      traverse(head.next());
    }
  }
}
