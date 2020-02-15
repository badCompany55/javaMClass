#!/usr/bin/env python
# -*- coding: utf-8 -*-

from NodeList import NodeList
from Node import Node

ll = NodeList()
#  print(ll)

#  zach = Node("Zach")
#  ll.add_to_list(zach)
#  ll.printAll()

input_arr = "This is to test the shorting functionality of is my linked list.".split(" ")
for w in input_arr:
    ll.add_to_list(Node(w))

ll.remove_from_list(Node("This"))
ll.remove_from_list(Node("is"))
ll.remove_from_list(Node("functionality"))
ll.remove_from_list(Node("to"))

ll.printAll()



