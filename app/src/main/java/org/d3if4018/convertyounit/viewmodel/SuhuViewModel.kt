package org.d3if4018.convertyounit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SuhuViewModel : ViewModel() {
    var _celcius = MutableLiveData<Double>()
    var _kelvin = MutableLiveData<Double>()
    var _fahrenheit = MutableLiveData<Double>()
    var _reamur = MutableLiveData<Double>()
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

    fun ctoc():Double {
        _hasil.value = _celcius.value?.times(1.0)
        return _hasil.value!!
    }
    fun ctok():Double {
        _hasil.value = _celcius.value?.plus(273.0)
        return _hasil.value!!
    }

    fun ctof():Double {
        _hasil.value =(9.0.div(5.0)).times(_celcius.value!!).plus(32.0)
        return _hasil.value!!
    }

    fun ctor():Double {
        _hasil.value = (4.0.div(5.0)).times(_celcius.value!!)
        return _hasil.value!!
    }



    fun ktoc():Double {
        _hasil.value = _kelvin.value?.minus(273.0)
        return _hasil.value!!
    }

    fun ktok():Double {
        _hasil.value = _kelvin.value?.times(1.0)
        return _hasil.value!!
    }

    fun ktof():Double  {
        _hasil.value = 9.0.div(5.0).times((_kelvin.value!!.minus(273.0))).plus(32.0)
        return _hasil.value!!
    }

    fun ktor():Double {
        _hasil.value = 4.0.div(5.0).times((_kelvin.value!!.minus(273.0)))
        return _hasil.value!!
    }

    fun ftoc():Double {
        _hasil.value =5.0.div(9.0).times((_fahrenheit.value!!.minus(32.0)))
        return _hasil.value!!
    }

    fun ftok():Double {
        _hasil.value =5.0.div(9.0).times((_fahrenheit.value!!.minus(32.0))).plus(273.0)
        return _hasil.value!!
    }

    fun ftof():Double {
        _hasil.value = _fahrenheit.value?.times(1.0)
        return _hasil.value!!
    }

    fun ftor():Double {
        _hasil.value = 4.0.div(9.0).times((_fahrenheit.value!!.minus(32.0)))
        return _hasil.value!!
    }

    fun rtoc():Double {
        _hasil.value = (5.0.div(4.0)).times(_reamur.value!!)
        return _hasil.value!!
    }

    fun rtok():Double {
        _hasil.value = (5.0.div(4.0)).times(_reamur.value!!).plus(273)
        return _hasil.value!!
    }

    fun rtof():Double {
        _hasil.value =(9.0.div(4.0)).times(_reamur.value!!).plus(32.0)
        return _hasil.value!!
    }

    fun rtor():Double {
        _hasil.value = _reamur.value?.times(1.0)
        return _hasil.value!!
    }


}