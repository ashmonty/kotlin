// WITH_RUNTIME

fun test(list: List<Int>) {
    val groupByTo: MutableMap<Int, MutableList<Int>> = list.<caret>filter { it > 1 }.groupByTo(mutableMapOf()) { it }
}