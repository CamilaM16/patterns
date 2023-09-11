const prototypeObject = {
  city: "Madrid",
  greet() {
    console.log(`Greetings from ${this.city}`);
  },
};

const newObj1 = Object.create(prototypeObject);
newObj1.city = "Bolivia";
newObj1.greet();

const newObj2 = Object.create(prototypeObject);
newObj2.city = "Argentina";
newObj2.greet();

// The Object.create() method creates a new object and allows you to specify an object that will be used as the new object's prototype.