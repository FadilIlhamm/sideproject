package org.d3if4018.convertyounit.viewmodel


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.log


class JarakViewModel: ViewModel() {

    var _milimeter = MutableLiveData<Double>()
    var _centimeter = MutableLiveData<Double>()
    var _desimeter = MutableLiveData<Double>()
    var _meter = MutableLiveData<Double>()
    var _kilometer = MutableLiveData<Double>()
    var _hasil = MutableLiveData<Double>()
   private var _hasilmmtomm = MutableLiveData<Double>()

    val hasilmmtomm :LiveData<Double> get() = _hasilmmtomm
    init {
        _hasilmmtomm.value=1.0
    }


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

        fun mmtomm():Double {
        _hasil.value = _milimeter.value?.times(1.0)
        return _hasil.value!!
        }

        fun mmtocm():Double {
            _hasil.value = _milimeter.value?.times(0.1)
            return _hasil.value!!
        }

        fun mmtodm():Double {
            _hasil.value = _milimeter.value?.times(0.01)
            return _hasil.value!!
        }

        fun mmtom():Double {
            _hasil.value = _milimeter.value?.times(0.001)
            return _hasil.value!!
        }

        fun mmtokm():Double {
            _hasil.value = _milimeter.value?.times(0.000001)
            return _hasil.value!!
        }

        fun cmtomm():Double {
            _hasil.value = _centimeter.value?.times(10.0)
            return _hasil.value!!
        }

        fun cmtocm():Double {
            _hasil.value = _centimeter.value?.times(1.0)
            return _hasil.value!!
        }

        fun cmtodm():Double  {
            _hasil.value = _centimeter.value?.times(0.1)
            return _hasil.value!!
        }

        fun cmtom():Double {
            _hasil.value = _centimeter.value?.times(0.01)
            return _hasil.value!!
        }

        fun cmtokm():Double {
            _hasil.value = _centimeter.value?.times(0.0001)
            return _hasil.value!!
        }

        fun dmtomm():Double {
        _hasil.value = _desimeter.value?.times(100.0)
        return _hasil.value!!
        }

        fun dmtocm():Double {
        _hasil.value = _desimeter.value?.times(10.0)
        return _hasil.value!!
        }

        fun dmtodm():Double {
        _hasil.value = _desimeter.value?.times(1.0)
        return _hasil.value!!
        }

        fun dmtom():Double {
        _hasil.value = _desimeter.value?.times(0.1)
        return _hasil.value!!
        }

        fun dmtokm():Double {
        _hasil.value = _desimeter.value?.times(0.0001)
        return _hasil.value!!
        }

        fun mtomm():Double {
        _hasil.value = _meter.value?.times(1000.0)
        return _hasil.value!!
        }

        fun mtocm():Double {
        _hasil.value = _meter.value?.times(100.0)
        return _hasil.value!!
        }

        fun mtodm():Double {
        _hasil.value = _meter.value?.times(10.0)
        return _hasil.value!!
        }

        fun mtom():Double {
        _hasil.value = _meter.value?.times(1.0)
        return _hasil.value!!
        }

        fun mtokm():Double {
        _hasil.value = _meter.value?.times(0.001)
        return _hasil.value!!
        }

        fun kmtomm():Double {
        _hasil.value = _kilometer.value?.times(1000000.0)
        return _hasil.value!!
        }

        fun kmtocm():Double {
        _hasil.value = _kilometer.value?.times(100000.0)
        return _hasil.value!!
        }

        fun kmtodm():Double {
        _hasil.value = _kilometer.value?.times(10000.0)
        return _hasil.value!!
        }

        fun kmtom():Double {
        _hasil.value = _kilometer.value?.times(1000.0)
        return _hasil.value!!
        }

        fun kmtokm():Double {
        _hasil.value = _kilometer.value?.times(1.0)
        return _hasil.value!!
        }

    }
