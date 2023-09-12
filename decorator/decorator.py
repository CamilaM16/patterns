from abc import ABC, abstractmethod

# interfaz
class Person(ABC):
    @abstractmethod
    def get_name(self):
        pass

    @abstractmethod
    def get_profession(self):
        pass

# implement Person interface
class ConcretPerson(Person):
    def __init__(self, name, profession):
        self.name = name
        self.profession = profession

    def get_name(self):
        return self.name

    def get_profession(self):
        return self.profession

class Decorator(Person):
    _component: Person = None

    def __init__(self, component: Person) -> None:
        self._component = component

    @property
    def component(self) -> Person:
        return self._component

    def get_name(self) -> str:
        return self._component.get_name()

    def get_profession(self) -> str:
        return self._component.get_profession()


class TeacherDecorator(Decorator):

    def get_profession(self) -> str:
        return f"Teacher({self.component.get_profession()})"


class DriverDecorator(Decorator):

    def get_profession(self) -> str:
        return f"Driver({self.component.get_profession()})"



if __name__ == "__main__":
    simple = ConcretPerson("Jessica", "Lawyer" )
    print(f"Client: {simple.get_name()}")

    decorator1 = TeacherDecorator(simple)
    decorator2 = DriverDecorator(decorator1)
    print("Client: Now I've got a decorated component:")
    print("RESULT:",decorator2.get_profession())