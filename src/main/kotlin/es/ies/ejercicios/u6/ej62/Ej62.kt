package es.ies.ejercicios.u6.ej62

/**
 * Ejercicio 6.2 — Forzado y bloqueo de herencia (RA7.b).
 */
object Ej62

fun main() {
    val logger: Logger = StdoutLogger()

    val lines = listOf("Primera línea", "Segunda línea", "Tercera línea")

    val reports: List<ReportTemplate> = listOf(
        CsvReport(),
        MarkdownReport(),
    )

    logger.log("Ej62: generando informes con polimorfismo (sin when)")
    for (report in reports) {
        logger.log("Generando informe con ${report::class.simpleName} ...")
        val result = report.generate(title = "Informe", lines = lines)
        println(result)
        println("-----")
    }
}