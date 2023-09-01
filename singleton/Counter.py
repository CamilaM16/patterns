class Singleton:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Singleton, cls).__new__(cls)
            cls._instance.value = None
        return cls._instance

    def set_value(self, value):
        self.value = value

    def get_value(self):
        return self.value


singleton1 = Singleton()
singleton2 = Singleton()

singleton2.set_value(12)
singleton1.set_value(42)
print(singleton2.get_value()) #42
