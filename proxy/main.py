from abc import ABC, abstractmethod

class Page(ABC):
    @abstractmethod
    def request(self) -> None:
        pass


class UserPage(Page):
    def request(self) -> None:
        print("User Page: Handling request.")


class LoginPage(Page):

    def __init__(self, user_page: UserPage) -> None:
        self._user_page = user_page

    def request(self) -> None:
        if self.check_access():
            self._user_page.request()
            self.log_access()

    def check_access(self) -> bool:
        print("Proxy: Checking access prior to firing a real request.")
        return True

    def log_access(self) -> None:
        print("Proxy: Logging the time of request.", end="")


def client_code(page: Page) -> None:
    page.request()

if __name__ == "__main__":
    print("Executing user page:")
    real_subject = UserPage()
    client_code(real_subject)

    print("")

    print("Executing with a proxy:")
    proxy = LoginPage(real_subject)
    client_code(proxy)