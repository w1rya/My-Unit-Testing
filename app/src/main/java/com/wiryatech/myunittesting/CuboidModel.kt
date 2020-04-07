package com.wiryatech.myunittesting

class CuboidModel {

    private var length: Double = 0.0
    private var width: Double = 0.0
    private var height: Double = 0.0

    fun getVolume(): Double {
        return length * width * height
    }

    fun getSurfaceArea(): Double {
        val lw = length * width
        val lh = length * height
        val wh = width * height

        return 2 * (lw + lh + wh)
    }

    fun getCircumference() : Double {
        return 4 * (length + width + height)
    }

    fun save(length: Double, width: Double, height: Double) {
        this.length = length
        this.width = width
        this.height = height
    }

}