package com.poc.stkm.records

  case class TemperatureData (year:Int,month: Int,day:Int, tMorn: BigDecimal, 
                            tNoon: BigDecimal, tEvn: BigDecimal, tMax: BigDecimal, 
                            tMin: BigDecimal, tMean: BigDecimal)
