class Singleton {
  constructor() {
    if (Singleton.instance) {
      return Singleton.instance;
    }

    this.value = 0;
    Singleton.instance = this;
  }

  add(value) {
    this.value += value;
  }

  getValue() {
    return this.value;
  }
}

const instance1 = new Singleton();
const instance2 = new Singleton();

console.log(instance1 === instance2); // true
instance1.add(5)
console.log(instance2.getValue());  // 5
