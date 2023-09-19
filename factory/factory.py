class Factory:
    def create_task(self):
        pass


class SpotifyFactory(Factory):
    def create_task(self):
        return Spotify()

class CalendarFactory(Factory):
    def create_task(self):
        return Calendar()

class ChatFactory(Factory):
    def create_task(self):
        return Chat()



class Task:
    def run(self):
        pass


class Spotify(Task):
    def run(self):
        print ("Spotiy class")


class Calendar(Task):
    def run(self):
        print ("Calendar class")

class Chat(Task):
    def run(self):
        print ("Chat class")

def main():
    spotify_factory = SpotifyFactory()
    spotify_app = spotify_factory.create_task()
    spotify_app.run()

    calendar_factory = CalendarFactory()
    calendar_app = calendar_factory.create_task()
    calendar_app.run()

    chat_factory = ChatFactory()
    chat_app = chat_factory.create_task()
    chat_app.run()

if __name__ == "__main__":
    main()
