package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class -> {
                var result = 0
                for (index in blockA.indices) {
                    if (blockA[index] is Int) {
                        result += blockA[index] as Int
                    }
                }
                return result
            }

            String::class -> {
                var result = ""
                for (index in blockA.indices) {
                    if (blockA[index] is String) {
                        result += blockA[index] as String
                    }
                }
                return result
            }
            LocalDate::class -> {
                var result = LocalDate.MIN
                for (index in blockA.indices) {
                    if ((blockA[index] is LocalDate) && ((blockA[index] as LocalDate) > result))
                        result = (blockA[index] as LocalDate)

                }
                return result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> return ""
        }
    }
}
