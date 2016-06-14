package org.widok.moment

import scala.scalajs.js

@js.native
trait Setters[T] extends js.Object {
  def add(time: Int, unit: String): T = js.native
  def add(time: Double, unit: String): T = js.native
  def add(millis: Int): T = js.native
  def add(duration: Duration): T = js.native

  def subtract(time: Int, unit: String): T = js.native
  def subtract(time: Double, unit: String): T = js.native
  def subtract(millis: Int): T = js.native
  def subtract(duration: Duration): T = js.native
  
  def month(month: Int): T = js.native
  def year(year: Int): T = js.native
  def hour(hour: Int): T = js.native
  def minute(hour: Int): T = js.native
  def date(date: Int): T = js.native
  def day(day: Int): T = js.native
  def week(week: Int): T = js.native
  def isoWeek(week: Int): T = js.native
}
