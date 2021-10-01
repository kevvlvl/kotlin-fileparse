import com.kevvlvl.kotlin.dto.Finance
import mu.KotlinLogging
import java.math.BigDecimal

private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {

    logger.info("START main() - main arguments: ${args.joinToString()}")

    val stocks = getStocks()
    stocks.forEach{
        s -> logger.info("   Current stock ${s.name} ${s.description} ${s.stockValue}")
    }

    logger.info("END main()")
}

fun getStocks(): List<Finance> {

    val stocks: MutableList<Finance> = mutableListOf()

    stocks.add(Finance("ABC", "Fake Company", BigDecimal("30.25")))
    stocks.add(Finance("XYZ", "Fake Company Rebooted", BigDecimal("15.50")))
    stocks.add(Finance("TOTO", "Africa stock", BigDecimal("999.98")))

    return stocks
}