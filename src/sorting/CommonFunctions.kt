package sorting

fun swap(array: IntArray, i: Int, j: Int) {
    if (i == j) return
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}