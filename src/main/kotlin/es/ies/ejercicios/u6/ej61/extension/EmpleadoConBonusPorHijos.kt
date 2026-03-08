package es.ies.ejercicios.u6.ej61.extension

class EmpleadoConBonusPorHijos(
    nombre: String,
    salarioBase: Double,
    val hijos: Int,
    val bonusPorHijo: Double
) : Empleado(nombre, salarioBase) {

    override fun salario(): Double {
        val bonus = hijos * bonusPorHijo
        println("[EmpleadoConBonusPorHijos] Calculando salario: base=$salarioBase, hijos=$hijos, bonusPorHijo=$bonusPorHijo, bonus=$bonus")
        return salarioBase + bonus
    }
}