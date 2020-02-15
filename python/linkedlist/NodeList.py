#!/usr/bin/env python
# -*- coding: utf-8 -*-


class NodeList():
    def __init__(self, head=None):
        self.head = head

    def add_to_list(self, item):
        if self.head is None:
            self.head = item
            return True

        current_node = self.head
        while current_node is not None:
            if current_node.compare_to(item) < -1:
                if current_node.get_next() is not None:
                    current_node = current_node.get_next()
                else:
                    current_node.set_next(item).set_previous(current_node)
                    return True
            elif current_node.compare_to(item) > 0:
                if current_node.get_previous() is not None:
                    current_node.get_previous().set_next(item).set_previous(current_node.get_previous())
                    item.set_next(current_node).set_previous(item)
                else:
                    current_node.set_previous(item).set_next(current_node)
                    self.head = item
                return True
            else:
                return False

    def remove_from_list(self, item):
        if self.head is None:
            print("List is empty")

        current_node = self.head
        item_value = item.get_value()
        while current_node != None:
            if current_node.get_value() != item_value:
                current_node = current_node.get_next()
            if current_node.get_value() == item_value:
                if current_node.get_previous() and current_node.get_next():
                    current_node.get_previous().set_next(current_node.get_next())
                    current_node.get_next().set_previous(current_node.get_previous())
                    return True
                elif current_node.get_previous():
                    current_node.get_previous().set_next(None)
                    print(current_node.get_previous().get_value())
                    return True
                else:
                    self.head = current_node.get_next()
                    return True
        print("Value does not exist")
        return False



    def printAll(self):
        current_node = self.head
        while current_node is not None:
            print(current_node.get_value())
            current_node = current_node.get_next()



