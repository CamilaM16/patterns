class Person {
  get_name() {}
  get_profession() {}
}

class ConcretePerson extends Person {
  constructor(name, profession) {
    super();
    this.name = name;
    this.profession = profession;
  }

  get_name() {
    return this.name;
  }

  get_profession() {
    return this.profession;
  }
}

class Decorator extends Person {
  constructor(component) {
    super();
    this._component = component;
  }

  get component() {
    return this._component;
  }

  get_name() {
    return this._component.get_name();
  }

  get_profession() {
    return this._component.get_profession();
  }
}

class TeacherDecorator extends Decorator {
  get_profession() {
    return `Teacher(${this.component.get_profession()})`;
  }
}

class DriverDecorator extends Decorator {
  get_profession() {
    return `Driver(${this.component.get_profession()})`;
  }
}

const simple = new ConcretePerson("Jessica", "Lawyer");
console.log(`Client: ${simple.get_name()}`);

const decorator1 = new TeacherDecorator(simple);
const decorator2 = new DriverDecorator(decorator1);

console.log("Client: Now I've got a decorated component:");
console.log("RESULT:", decorator2.get_profession());
