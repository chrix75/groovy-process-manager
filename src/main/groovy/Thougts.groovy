import processmanager.artifacts.GreetingsTask
import processmanager.artifacts.HeroTask
import processmanager.artifacts.Starter
import processmanager.artifacts.Stop

def start = new Starter()
def hero = new HeroTask()
def greetings = new GreetingsTask()
def stop = new Stop()

start.connectOutput(hero)
hero.connectOutput(greetings)
greetings.connectOutput(stop)

start.run()