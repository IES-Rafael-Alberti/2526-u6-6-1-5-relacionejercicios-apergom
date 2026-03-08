package es.ies.ejercicios.u6.ej62

class CsvReport : ReportTemplate() {
    override fun header(title: String): String =
        "title,$title\nline"

    override fun formatLine(line: String): String = line
}