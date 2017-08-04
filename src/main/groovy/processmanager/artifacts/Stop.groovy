package processmanager.artifacts

class Stop implements Connector {
    @Override
    void run() {
        def s = input.map { it.value }.orElse("None")
        println "Stop with value $s"
    }
}
