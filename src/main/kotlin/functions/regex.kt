package functions

val pathSeparator = "/"
val extensionSeparator = "."

fun parseFileDetails(pathToFile: String): FileDetails {
    val directory = pathToFile.substringBeforeLast(pathSeparator)
    val filename = pathToFile.substringAfterLast(pathSeparator).substringBefore(extensionSeparator)
    val extension = pathToFile.substringAfterLast(extensionSeparator)
    return FileDetails(directory, filename, extension)
}

fun parseFileDetailsWithRegex(pathToFile: String): FileDetails {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val result = regex.matchEntire(pathToFile)
    if (result != null) {
        return FileDetails(
        result.destructured.component1(),
        result.destructured.component2(),
        result.destructured.component3()
        )
    } else {
        return FileDetails("", "", "")
    }
}

class FileDetails(val directory: String, val filename: String, val extension: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FileDetails

        if (directory != other.directory) return false
        if (filename != other.filename) return false
        if (extension != other.extension) return false

        return true
    }

    override fun hashCode(): Int {
        var result = directory.hashCode()
        result = 31 * result + filename.hashCode()
        result = 31 * result + extension.hashCode()
        return result
    }

    override fun toString(): String {
        return "FileDetails(directory='$directory', filename='$filename', extension='$extension')"
    }


}
