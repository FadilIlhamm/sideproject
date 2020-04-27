package org.d3if4018.convertyounit.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import org.d3if4018.convertyounit.MainActivity

import org.d3if4018.convertyounit.R
import org.d3if4018.convertyounit.databinding.FragmentSuhuBinding
import org.d3if4018.convertyounit.viewmodel.SuhuViewModel

/**
 * A simple [Fragment] subclass.
 */
class SuhuFragment : Fragment() {
    private lateinit var binding: FragmentSuhuBinding
    private lateinit var viewModel: SuhuViewModel
    val array = arrayOf("c","k","f","r")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        judulapps()
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_suhu, container, false)
        val spinner: Spinner = binding.spinnersuhu
        viewModel = ViewModelProvider(this).get(SuhuViewModel::class.java)
        val adapter = ArrayAdapter<String>(
            context!!,
            R.layout.spinner_item,array
        )
        // Apply the adapter to the spinner
        spinner.adapter = adapter

        binding.button.setOnClickListener{
            if(binding.etInputnilai.text.isEmpty()){
                Toast.makeText(context,"wajib diisi", Toast.LENGTH_SHORT).show()
            }
            else{
                val index = spinner.selectedItemPosition
                if (array[index] == "c"){
                    //viewModel._milimeter.observe(viewLifecycleOwner, Observer<Double>{
                    viewModel._celcius.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvCelcius.text = viewModel.ctoc().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKl.text = viewModel.ctok().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvFahrenheit.text = viewModel.ctof().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvReamur.text = viewModel.ctor().toString()
                    //viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()
                    //})
                }
                else if(array[index] == "k"){

                    viewModel._kelvin.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvCelcius.text = viewModel.ktoc().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKl.text = viewModel.ktok().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvFahrenheit.text = viewModel.ktof().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvReamur.text = viewModel.ktor().toString()

                }
                else if(array[index] == "f"){

                    viewModel._fahrenheit.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvCelcius.text = viewModel.ftoc().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKl.text = viewModel.ftok().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvFahrenheit.text = viewModel.ftof().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvReamur.text = viewModel.ftor().toString()
                }
                else if(array[index] == "r"){

                    viewModel._reamur.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvCelcius.text = viewModel.rtoc().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKl.text = viewModel.rtok().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvFahrenheit.text = viewModel.rtof().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvReamur.text = viewModel.rtor().toString()
                }
            }
        }

        binding.setLifecycleOwner(this)
        return binding.root
    }
    private fun judulapps() {
        val getActivity = activity!! as MainActivity
        getActivity.supportActionBar?.title = "Konverter Suhu"
    }

}
