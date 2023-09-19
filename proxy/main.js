// Definición de una clase abstracta Page
class Page {
  request() {}
}

class UserPage extends Page {
  request() {
    console.log("User Page: Handling request.");
  }
}

class LoginPage extends Page {
  constructor(userPage) {
    super();
    this._userPage = userPage;
  }

  request() {
    if (this.checkAccess()) {
      this._userPage.request();
      this.logAccess();
    }
  }

  checkAccess() {
    console.log("Proxy: Checking access prior to firing a real request.");
    return true;
  }

  logAccess() {
    console.log("Proxy: Logging the time of request.");
  }
}

console.log("Executing user page:");
const realSubject = new UserPage();
realSubject.request();
console.log("");

console.log("Executing with a proxy:");
const proxy = new LoginPage(realSubject);
proxy.request();
