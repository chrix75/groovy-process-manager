package processmanager.artifacts

trait Connector<T> implements Artifact {
    Optional<Connector> input = Optional.empty()
    Optional<Connector> output = Optional.empty()

    T value

    void connectInput(Connector previous, boolean cycle = false) {
        input = Optional.of(previous)

        if (!cycle) {
            previous.connectOutput(this, true)
        }
    }

    void connectOutput(Connector next, boolean cycle = false) {
        output = Optional.of(next)

        if (!cycle) {
            next.connectInput(this, true)
        }
    }
}