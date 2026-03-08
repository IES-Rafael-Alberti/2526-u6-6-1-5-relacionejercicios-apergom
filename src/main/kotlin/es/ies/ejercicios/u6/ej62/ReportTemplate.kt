package es.ies.ejercicios.u6.ej62

/**
 * Plantilla (para el alumnado): usa clase abstracta + "Template Method".
 *
 * Objetivo didáctico:
 * - Forzar herencia/implementación: `abstract` + miembro `abstract`.
 * - Bloquear sobrescritura del algoritmo: método `final` (o no-`open`).
 */
abstract class ReportTemplate {
    /**
     * Algoritmo común (template method).
     * Está BLOQUEADO (final) para que las subclases no cambien el orden de pasos.
     */
    final fun generate(title: String, lines: List<String>): String =
        buildString {
            val h = header(title)
            if (h.isNotEmpty()) appendLine(h)

            for (line in lines) {
                appendLine(formatLine(line))
            }

            val f = footer()
            if (f.isNotEmpty()) appendLine(f)
        }.trimEnd()

    /**
     * Hook opcional (se puede sobrescribir).
     */
    protected open fun header(title: String): String = ""

    /**
     * Paso obligatorio (FORZADO) para cada subtipo.
     */
    protected abstract fun formatLine(line: String): String

    /**
     * Hook opcional (se puede sobrescribir).
     */
    protected open fun footer(): String = ""
}