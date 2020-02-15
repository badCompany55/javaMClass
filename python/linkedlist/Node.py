#!/usr/bin/env python
# -*- coding: utf-8 -*-


from ListItem import ListItem


class Node(ListItem):
    def get_next(self):
        return self.next_list_item

    def set_next(self, next_list_item):
        self.next_list_item = next_list_item
        return self.next_list_item

    def get_previous(self):
        return self.previous_list_item

    def set_previous(self, previous_list_item):
        self.previous_list_item = previous_list_item
        return self.previous_list_item

    def get_value(self):
        return self.value

    def compare_to(self, list_item):
        if list_item is not None:
            if self.get_value().lower() == list_item.get_value().lower():
                return 0
            if self.get_value().lower() < list_item.get_value().lower():
                return -2
            return 1
        return -1
