package classes

import java.io.File

object FilePathComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int = o1.path.compareTo(o2.path)
}