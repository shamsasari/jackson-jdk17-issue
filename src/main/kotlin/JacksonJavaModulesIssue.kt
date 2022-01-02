import com.fasterxml.jackson.databind.ObjectMapper

object JacksonJavaModulesIssue {
    @JvmStatic
    fun main(args: Array<String>) {
        val objectMapper = ObjectMapper()
    }
}
