import copy

class Prototype:
    def __init__(self):
        self.name = "Default"

    def clone(self):
        return copy.deepcopy(self)

    def greet(self):
        print(f"Hello, my name is {self.name}")

prototype_object = Prototype()

obj1 = prototype_object.clone()
obj1.name = "Alice"
obj1.greet()

obj2 = prototype_object.clone()
obj2.name = "Bob"
obj2.greet()
