package es.ies.ejercicios.u6.ej61.extension

/**
 * Extensión:
 * Empleado define lo básico (nombre + salarioBase + salario()).
 * Las subclases "extienden" añadiendo complementos distintos.
 */
open class Empleado(
    val nombre: String,
    val salarioBase: Double
) {
    open fun salario(): Double = salarioBase

    fun resumenNomina(): String {
        val total = salario()
        return "[Nomina] Empleado=$nombre, clase=${this::class.simpleName}, salarioBase=$salarioBase, total=$total"
    }
}