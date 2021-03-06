package org.widok.moment

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Duration extends js.Object with Getters with Setters[Duration] {
  @JSName("humanize")
  def humanise(): String = js.native

  @JSName("humanize")
  def humanise(withSuffix: Boolean): String = js.native
  
  def asMinutes(): Int = js.native
  def asHours(): Int = js.native
  def asDays(): Int = js.native
  def asWeeks(): Int = js.native
  def asMonths(): Int = js.native
}
