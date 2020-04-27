package org.d3if4018.convertyounit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeratViewModel : ViewModel() {
    var _miligram = MutableLiveData<Double>()
    var _gram = MutableLiveData<Double>()
    var _kilogram = MutableLiveData<Double>()
    var _ton = MutableLiveData<Double>()
    var _hasil = MutableLiveData<Double>()


    /*val milimeter: LiveData<Double> get() = _milimeter
    val centimeter: LiveData<Double> get() = _centimeter
    val desimeter: LiveData<Double> get() = _desimeter
    val meter: LiveData<Double> get() = _meter
    val kilometer: LiveData<Double> get() = _kilometer*/

    /*init {
        _milimeter.value = 1.0
        _centimeter.value = 0.1
        _desimeter.value = 0.01
        _meter.value = 0.001
        _kilometer.value = 0.000001
    }*/

    fun mgtomg():Double {
        _hasil.value = _miligram.value?.times(1.0)
        return _hasil.value!!
    }
    fun mgtog():Double {
        _hasil.value = _miligram.value?.times(0.01)
        return _hasil.value!!
    }

    fun mgtokg():Double {
        _hasil.value = _miligram.value?.times(0.000001)
        return _hasil.value!!
    }

    fun mgtot():Double {
        _hasil.value = _miligram.value?.times(0.000000001)
        return _hasil.value!!
    }



    fun gtomg():Double {
        _hasil.value = _gram.value?.times(100.0)
        return _hasil.value!!
    }

    fun gtog():Double {
        _hasil.value = _gram.value?.times(1.0)
        return _hasil.value!!
    }

    fun gtokg():Double  {
        _hasil.value = _gram.value?.times(0.001)
        return _hasil.value!!
    }

    fun gtot():Double {
        _hasil.value = _gram.value?.times(0.000001)
        return _hasil.value!!
    }

    fun kgtomg():Double {
        _hasil.value = _kilogram.value?.times(1000000.0)
        return _hasil.value!!
    }

    fun kgtog():Double {
        _hasil.value = _kilogram.value?.times(1000.0)
        return _hasil.value!!
    }

    fun kgtokg():Double {
        _hasil.value = _kilogram.value?.times(1.0)
        return _hasil.value!!
    }

    fun kgtot():Double {
        _hasil.value = _kilogram.value?.times(0.001)
        return _hasil.value!!
    }

    fun ttomg():Double {
        _hasil.value = _ton.value?.times(1000000000.0)
        return _hasil.value!!
    }

    fun ttog():Double {
        _hasil.value = _ton.value?.times(1000000.0)
        return _hasil.value!!
    }

    fun ttokg():Double {
        _hasil.value = _ton.value?.times(1000.0)
        return _hasil.value!!
    }

    fun ttot():Double {
        _hasil.value = _ton.value?.times(1.0)
        return _hasil.value!!
    }


}