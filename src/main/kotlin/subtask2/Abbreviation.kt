package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {

        var result: String = ""

        for (x in a.indices) {
            if (b.contains(a[x], true)) {
                result += a[x]
            }
        }

        return if (result.contains(b,true)) "YES" else "NO"
    }
}
