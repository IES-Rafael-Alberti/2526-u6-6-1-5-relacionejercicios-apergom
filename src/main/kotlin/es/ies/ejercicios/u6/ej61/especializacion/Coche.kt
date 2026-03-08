package es.ies.ejercicios.u6.ej61.especializacion

class Coche(
    val matricula: String,
    var combustibleLitros: Int
) : Vehiculo() {

    override fun moverse(km: Int): String {
        println("[Coche] Preparando viaje: matricula=$matricula, km=$km, combustibleInicial=$combustibleLitros L")

        // Consumo ficticio: 1 litro cada 5 km (redondeo hacia arriba)
        val consumo = (km + 4) / 5
        val puedeMoverse = combustibleLitros >= consumo

        return if (puedeMoverse) {
            combustibleLitros -= consumo
            "[Coche] Me muevo $km km gastando $consumo L -> combustibleRestante=$combustibleLitros L"
        } else {
            "[Coche] No puedo moverme $km km: necesito $consumo L pero solo tengo $combustibleLitros L"
        }
    }
}