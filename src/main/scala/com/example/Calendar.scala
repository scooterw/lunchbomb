package com.example

import org.joda.time.DateTime
import org.joda.time.DateTimeConstants._

object Calendar {

  def isWeekend(dt: DateTime) = {
    val dayOfWeek = dt.getDayOfWeek
    dayOfWeek == SATURDAY || dayOfWeek == SUNDAY
  }

  def dailyStreamFrom(dt: DateTime, filterWeekends: Boolean, n: Int = 1) = {
    val stream = Stream from (n, n) map { i => dt.plusDays(i) }

    if (filterWeekends)
      stream filter { !isWeekend(_) }
    else
      stream
  }

  def fromNow(count: Int, n: Int, filterWeekends: Boolean = true) =
    dailyStreamFrom(DateTime.now, filterWeekends, n).take(count).toList

}
