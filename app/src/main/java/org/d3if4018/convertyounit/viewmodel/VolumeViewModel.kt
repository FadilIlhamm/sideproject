package org.d3if4018.convertyounit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VolumeViewModel : ViewModel() {
    var _mililiter = MutableLiveData<Double>()
    var _liter = MutableLiveData<Double>()
    var _centikubik = MutableLiveData<Double>()
    var _meterkubik = MutableLiveData<Double>()
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

    fun mltoml():Double {
        _hasil.value = _mililiter.value?.times(1.0)
        return _hasil.value!!
    }
    fun mltol():Double {
        _hasil.value = _mililiter.value?.times(0.001)
        return _hasil.value!!
    }

    fun mltocm3():Double {
        _hasil.value = _mililiter.value?.times(1.0)
        return _hasil.value!!
    }

    fun mltom3():Double {
        _hasil.value = _mililiter.value?.times(0.000001)
        return _hasil.value!!
    }



    fun ltoml():Double {
        _hasil.value = _liter.value?.times(1000.0)
        return _hasil.value!!
    }

    fun ltol():Double {
        _hasil.value = _liter.value?.times(1.0)
        return _hasil.value!!
    }

    fun ltocm3():Double  {
        _hasil.value = _liter.value?.times(1000.0)
        return _hasil.value!!
    }

    fun ltom3():Double {
        _hasil.value = _liter.value?.times(0.001)
        return _hasil.value!!
    }

    fun cm3toml():Double {
        _hasil.value = _centikubik.value?.times(1.0)
        return _hasil.value!!
    }

    fun cm3tol():Double {
        _hasil.value = _centikubik.value?.times(0.001)
        return _hasil.value!!
    }

    fun cm3tocm3():Double {
        _hasil.value = _centikubik.value?.times(1.0)
        return _hasil.value!!
    }

    fun cm3tom3():Double {
        _hasil.value = _centikubik.value?.times(0.000001)
        return _hasil.value!!
    }

    fun m3toml():Double {
        _hasil.value = _meterkubik.value?.times(1000000.0)
        return _hasil.value!!
    }

    fun m3tol():Double {
        _hasil.value = _meterkubik.value?.times(1000.0)
        return _hasil.value!!
    }

    fun m3tocm3():Double {
        _hasil.value = _meterkubik.value?.times(1000000.0)
        return _hasil.value!!
    }

    fun m3tom3():Double {
        _hasil.value = _meterkubik.value?.times(1.0)
        return _hasil.value!!
    }


}