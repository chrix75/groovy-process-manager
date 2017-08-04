package processmanager.artifacts

class GreetingsTask implements Connector<String> {
    @Override
    void run() {
        def name = input.map { it.value }.orElse(' Nobody')
        value = "Hello $name"

        output.ifPresent { it.run() }
    }
}
