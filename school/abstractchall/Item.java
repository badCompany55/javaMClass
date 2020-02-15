package abstractchall;

public abstract class Item {
  protected Item rightLink = null;
  protected Item leftLink = null;
  protected Object value;

  public Item(Object value) {
    this.value = value;
  }

  abstract Item next();
  abstract Item setNext(Item item);
  abstract Item previous();
  abstract Item setPrevious(Item item);


  abstract int myCompareTo(Item item);

  public Object getValue() {
    return this.value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

}

