import org.jetbrains.kotlinx.lincheck.*
import org.jetbrains.kotlinx.lincheck.strategy.managed.modelchecking.*
import org.jetbrains.kotlinx.lincheck.strategy.stress.*
import org.junit.*
import org.junit.runners.*
import kotlin.reflect.*

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
abstract class TestBase(
    val sequentialSpecification: KClass<*>,
    val checkObstructionFreedom: Boolean = true,
    val scenarios: Int = 10,
    val threads: Int = 3,
    val actorsBefore: Int = 1
) {
    @Test
    fun modelCheckingTest() = try {
        ModelCheckingOptions()
            .iterations(scenarios)
            .invocationsPerIteration(10)
            .actorsBefore(actorsBefore)
            .threads(threads)
            .actorsPerThread(2)
            .actorsAfter(0)
            .checkObstructionFreedom(checkObstructionFreedom)
            .sequentialSpecification(sequentialSpecification.java)
            .apply { customConfiguration() }
            .check(this::class.java)
    } catch (t: Throwable) {
        throw t
    }

    @Test
    fun stressTest() = try {
        StressOptions()
            .iterations(scenarios)
            .invocationsPerIteration(1000)
            .actorsBefore(actorsBefore)
            .threads(threads)
            .actorsPerThread(2)
            .actorsAfter(0)
            .sequentialSpecification(sequentialSpecification.java)
            .apply { customConfiguration() }
            .check(this::class.java)
    } catch (t: Throwable) {
        throw t
    }

    protected open fun Options<*, *>.customConfiguration() {}
}
