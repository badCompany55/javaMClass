package linkedList;

public abstract class ListItem {
  protected Object value;
  protected ListItem nextItem = null;
  protected ListItem previousItem = null;

  public ListItem(Object value) {
    this.value = value;
  }

   abstract ListItem next();
   abstract ListItem setNext(ListItem item);
   abstract ListItem previous();
   abstract ListItem setPrevious(ListItem item);

  public Object getValue() {
    return this.value;
  }

  public int compareTo(ListItem item) {
    if (item != null) {
      return ((String) this.getValue()).compareToIgnoreCase((String) item.getValue());
    } else {
      return -1;
    }
  }
}
