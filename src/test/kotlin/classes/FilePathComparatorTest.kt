package classes

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.file.Paths

internal class FilePathComparatorTest {
    @Test
    fun should_sort_files_according_to_their_path() {
        val path1 = Paths.get("/home/bbelovic")
        val path2 = Paths.get("/home/root")
        val paths = listOf<File>(path2.toFile(), path1.toFile())
        val expected = listOf<File>(path1.toFile(), path2.toFile())
        Assertions.assertEquals(expected, paths.sortedWith(FilePathComparator))
    }
}