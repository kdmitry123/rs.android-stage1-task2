package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        if(blockB == String::class) {
            var res = "";
            for(i in blockA) {
                if(i is String) {
                    res += i;
                }
            }
            return res;
        }
        if(blockB == Int::class) {
            var res = 0;
            for(i in blockA) {
                if(i is Int) {
                    res += i;
                }
            }
            return res;
        }
        var res = LocalDate.MIN;
        for(i in blockA) {
            if(i is LocalDate) {
                if(i > res) {
                    res = i;
                }
            }
        }
        return res.format(DateTimeFormatter.ofPattern("dd.MM.yyy"));
    }
}
