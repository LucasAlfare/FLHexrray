import com.lucasalfare.flhexrray.Hexrray
import kotlin.test.Test
import kotlin.test.assertEquals

class GeneralTest {

  @Test
  fun `test hexrray get`() {
    val n1 = 0x987654321abcdefL
    val hexrray = Hexrray(n1)
    val atPos0 = hexrray[0]
    assertEquals(0x9, atPos0)
  }

  @Test
  fun `test hexrray set`() {
    val n1 = 0xabcdL
    val hexrray = Hexrray(n1)
    hexrray[0] = 0xfL
    assertEquals(0xfbcdL, hexrray.n)
  }

  @Test
  fun `test hexrray size setup`() {
    val num = 0x1234567890abcL
    val hexrray = Hexrray(num)
    assertEquals(13, hexrray.size)
  }
}