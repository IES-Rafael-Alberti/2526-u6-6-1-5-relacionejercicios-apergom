package es.ies.ejercicios.u6.ej62

open class BaseLogger : Logger {
    override fun log(message: String) {
        // implementación base simple (se puede heredar/sobrescribir si hiciera falta)
        println("[LOG] $message")
    }
}

class StdoutLogger : BaseLogger() {
    // BLOQUEO de sobrescritura: esta implementación ya no se puede volver a sobrescribir.
    final override fun log(message: String) {
        println("[STDOUT] $message")
    }
}