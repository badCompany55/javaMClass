package com.zacheryirvin;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
  private final Map<String, StockItem> list;

  public StockList() {
    this.list = new LinkedHashMap<>();
  }

  public int addStock(StockItem item) {
    if(item != null) {
      StockItem inStock = list.getOrDefault(item.getName(), item);
      if(inStock != item) {
        item.adjustStock(inStock.getQuantity());
      }
      
      list.put(item.getName(), item);
      return item.getQuantity();
    }
    return 0;
  }

  public int sellStock(String item, int quantity) {
    StockItem inStock = list.getOrDefault(item, null);
    if((inStock != null) && (inStock.getQuantity() >= quantity) && quantity > 0) {
      inStock.adjustStock(-quantity);
      return quantity;
    }
    return 0;
  }

  public StockItem get(String key) {
    return list.get(key);
  }

  public Map<String, StockItem> Items() {
    return Collections.unmodifiableMap(list);
  }

  @Override
  public String toString() {
    String s = "\nStock List\n";
    double totalCost = 0.0;
    for(Map.Entry<String, StockItem> item : list.entrySet()) {
      StockItem stockItem = item.getValue();

      double itemValue = stockItem.getPrice() * stockItem.getQuantity();
      s = s + stockItem + ". There are " + stockItem.getQuantity() + " in stock. Value of items: ";
      s = s + String.format("%.2f", itemValue) + "\n";
      totalCost += itemValue;
    }
    return s + "Total stock value " + String.format("%.2f", totalCost);
  }
}
