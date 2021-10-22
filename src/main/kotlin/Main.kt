import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.kevvlvl.kotlin.dto.Finance
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

private const val JSON_FILE_PATH = "stocks.json";

fun main(args: Array<String>) {

    logger.info("START main() - main arguments: ${args.joinToString()}")

    val jsonFile = {}.javaClass.getResource(JSON_FILE_PATH)

    if(jsonFile != null) {

        val mapper = jacksonObjectMapper()
        val stocks: List<Finance> = mapper.readValue(jsonFile.readText())

        stocks.forEach { s ->
            logger.info("   Current stock ${s.name} ${s.description} ${s.stockValue}")
        }

    }

    logger.info("END main()")
}