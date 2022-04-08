package sorting


    fun main() {
        val intArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)
        for (firstUnsortedIndex in 1 until intArray.size) {
            val newElement = intArray[firstUnsortedIndex]
            var i: Int = firstUnsortedIndex
            while (i > 0 && intArray[i - 1] > newElement) {
                intArray[i] = intArray[i - 1]
                i--
            }
            intArray[i] = newElement
        }

        /* for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }*/
        for (i in intArray) {
            println(i)
        }
    }
//time complexity =O(n^2)