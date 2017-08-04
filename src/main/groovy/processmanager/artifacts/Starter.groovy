package processmanager.artifacts

class Starter implements Connector {
    @Override
    void run() {
        output.ifPresent { it.run() }
    }
}
