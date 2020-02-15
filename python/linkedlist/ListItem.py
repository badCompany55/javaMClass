#!/usr/bin/env python
# -*- coding: utf-8 -*-

from abc import ABC, abstractmethod


class ListItem(ABC):
    def __init__(self, value):
        self.value = value
        self.next_list_item = None
        self.previous_list_item = None

    @abstractmethod
    def get_next(self):
        pass

    @abstractmethod
    def set_next(self, next_list_item):
        pass

    @abstractmethod
    def get_previous(self):
        pass

    @abstractmethod
    def set_previous(self, previous_list_item):
        pass

    @abstractmethod
    def get_value(self):
        pass

    @abstractmethod
    def compare_to(self, list_item):
        pass

