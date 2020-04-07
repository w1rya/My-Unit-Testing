package com.wiryatech.myunittesting

class MainViewModel(private val cuboidModel: CuboidModel) {

    fun getVolume(): Double {
        return cuboidModel.getVolume()
    }

    fun getSurfaceArea(): Double {
        return cuboidModel.getSurfaceArea()
    }

    fun getCircumference(): Double {
        return cuboidModel.getCircumference()
    }

    fun save(l: Double, w: Double, h: Double) {
        cuboidModel.save(l, w, h)
    }

}