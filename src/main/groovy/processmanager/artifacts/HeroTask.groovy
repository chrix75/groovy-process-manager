package processmanager.artifacts

class HeroTask implements Connector<String> {
    @Override
    void run() {
        if (!value) {
            value = "Doctor Who"
        }

        output.ifPresent { it.run() }
    }
}
