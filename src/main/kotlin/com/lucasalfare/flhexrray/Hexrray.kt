@file:Suppress("MemberVisibilityCanBePrivate")

package com.lucasalfare.flhexrray

import java.math.BigInteger

fun Long.toHexString(): String = BigInteger(this.toString()).toString(16)

class Hexrray(var n: Long) {

  var size = 0

  init {
    var tmp = n
    while (tmp != 0L) {
      tmp = tmp ushr 4
      size++
    }
  }

  operator fun get(i: Int) = (n ushr (4 * ((size - 1) - i))) and 0xf

  // source: https://stackoverflow.com/a/34863318/4563960
  operator fun set(i: Int, value: Long) {
    // Clear the 4 bits (i.e. 1 digit) at the position requested
    n = n and (0x0FL shl (4 * ((size - 1) - i))).inv()

    // Now put the replacement value at the position requested
    n = n or (value shl (4 * ((size - 1) - i)))
  }

  override fun toString() = n.toHexString()
}
