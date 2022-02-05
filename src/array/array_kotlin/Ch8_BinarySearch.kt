package array.array_kotlin
//we have a sorted array
fun main() {
    binarySearchFunction()
}

fun binarySearchFunction() {
    val arr = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val data = 71

    var l = 0
    var h = arr.size - 1
    while (l <= h) {
        val m = (l + h) / 2
        if (data > arr[m]) {
            l = m + 1
        } else if (data < arr[m]) {
            h = m - 1
        } else {
            println(" index is: $m")
            return
        }
    }
    println("Data not found")
}
