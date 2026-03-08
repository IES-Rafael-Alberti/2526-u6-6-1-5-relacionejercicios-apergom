package es.ies.ejercicios.u6.ej61

import es.ies.ejercicios.u6.ej61.especializacion.Bicicleta
import es.ies.ejercicios.u6.ej61.especializacion.Coche
import es.ies.ejercicios.u6.ej61.especializacion.Vehiculo
import es.ies.ejercicios.u6.ej61.extension.Empleado
import es.ies.ejercicios.u6.ej61.extension.EmpleadoConBonusPorHijos
import es.ies.ejercicios.u6.ej61.extension.EmpleadoConComision

/**
 * Ejercicio 6.1 — Tipos de herencia, clases y subclases (RA7.a).
 *
 * Estructuras elegidas:
 * - Especialización (Vehiculo -> Coche/Bicicleta)
 * - Extensión (Empleado -> EmpleadoConComision/EmpleadoConBonusPorHijos)
 */
object Ej61 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("=== EJ61: ESPECIALIZACIÓN ===")

        // Polimorfismo: referencia de superclase apuntando a subclases
        val v1: Vehiculo = Coche(matricula = "1234-ABC", combustibleLitros = 10)
        val v2: Vehiculo = Bicicleta(marchas = 7, energiaDelCiclista = 40)

        println("[main] v1 es Vehiculo pero instancia real: ${v1::class.simpleName}")
        println("[main] v2 es Vehiculo pero instancia real: ${v2::class.simpleName}")

        println(v1.moverse(km = 12))
        println(v2.moverse(km = 12))

        println()
        println("=== EJ61: EXTENSIÓN ===")

        // Polimorfismo: referencia de superclase apuntando a subclases
        val e1: Empleado = EmpleadoConComision(
            nombre = "Ana",
            salarioBase = 1200.0,
            ventasDelMes = 5000.0,
            porcentajeComision = 0.05
        )

        val e2: Empleado = EmpleadoConBonusPorHijos(
            nombre = "Luis",
            salarioBase = 1200.0,
            hijos = 2,
            bonusPorHijo = 50.0
        )

        println("[main] e1 es Empleado pero instancia real: ${e1::class.simpleName}")
        println("[main] e2 es Empleado pero instancia real: ${e2::class.simpleName}")

        println(e1.resumenNomina())
        println(e2.resumenNomina())
    }
}