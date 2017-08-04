package processmanager.listeners

interface ExecutionListener {
    void beforeStart()
    void afterEnd()
    void onError(error)
}