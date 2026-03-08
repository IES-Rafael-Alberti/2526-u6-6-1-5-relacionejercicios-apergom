package es.ies.ejercicios.u6.ej61.especializacion

class Bicicleta(
    val marchas: Int,
    var energiaDelCiclista: Int
) : Vehiculo() {

    override fun moverse(km: Int): String {
        println("[Bicicleta] Iniciando pedaleo: km=$km, marchas=$marchas, energiaInicial=$energiaDelCiclista")

        // Coste ficticio: 2 de energía por km, pero con más marchas "optimiza" (mínimo 1)
        val costePorKm = maxOf(1, 2 - (marchas / 10))
        val coste = km * costePorKm

        val puedeMoverse = energiaDelCiclista >= coste

        return if (puedeMoverse) {
            energiaDelCiclista -= coste
            "[Bicicleta] Recorro $km km (coste=$coste) -> energiaRestante=$energiaDelCiclista"
        } else {
            "[Bicicleta] No puedo recorrer $km km: coste=$coste pero energia=$energiaDelCiclista"
        }
    }
}