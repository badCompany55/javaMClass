package abstractchall;

public class GroceryItem extends Item {

  public GroceryItem(Object value) {
    super(value);
  }


  @Override
  Item next() {
    return this.rightLink;
  }
  @Override
  Item setNext(Item item) {
    this.rightLink = item;
    return this.rightLink;
  }
  @Override
  Item previous() {
    return this.leftLink;
  }
  @Override
  Item setPrevious(Item item) {
    this.leftLink = item;
    return this.leftLink;
  }


  int myCompareTo(Item item) {
    if (item != null) {
      Object itemVal = item.getValue();
      item.setValue(itemVal.toString());
      return ((String) super.getValue()).compareTo((String) item.getValue());
    } else {
      return -1;
    }
  }
}
