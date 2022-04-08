package sorting


fun main() {
    val intArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    var gap = intArray.size / 2
    while (gap > 0) {
        for (i in gap until intArray.size) {
            val newElement = intArray[i]
            var j = i
            while (j >= gap && intArray[j - gap] > newElement) {
                intArray[j] = intArray[j - gap]
                j -= gap
            }
            intArray[j] = newElement
        }
        gap /= 2
    }
    for (j in intArray) {
        println(j)
    }
}
