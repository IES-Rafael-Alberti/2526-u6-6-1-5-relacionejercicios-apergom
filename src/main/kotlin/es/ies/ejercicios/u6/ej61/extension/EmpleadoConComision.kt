package es.ies.ejercicios.u6.ej61.extension

class EmpleadoConComision(
    nombre: String,
    salarioBase: Double,
    val ventasDelMes: Double,
    val porcentajeComision: Double
) : Empleado(nombre, salarioBase) {

    override fun salario(): Double {
        val comision = ventasDelMes * porcentajeComision
        println("[EmpleadoConComision] Calculando salario: base=$salarioBase, ventas=$ventasDelMes, porcentaje=$porcentajeComision, comision=$comision")
        return salarioBase + comision
    }
}