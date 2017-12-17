package lyric.slow;

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._
import org.junit.Before
import org.junit.Test

class UtilsTest {
    @Test def sum() { // Uses ScalaTest assertions
        assert(5 == Utils.sum(2, 3))
    }
}