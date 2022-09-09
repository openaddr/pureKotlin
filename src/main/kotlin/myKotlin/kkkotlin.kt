package myKotlin

import cn.hutool.core.util.RuntimeUtil
import cn.hutool.system.SystemUtil

fun main() {

    val execForStr = RuntimeUtil.execForStr("ipconfig")
    println(execForStr)

    println()

}