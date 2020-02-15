package abstractchall;

public interface NodeList {
  Item getHead();
  boolean addItem(Item item);
  boolean removeItem(Item item);
  void traverse(Item head);
}
