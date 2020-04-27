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
import org.d3if4018.convertyounit.databinding.FragmentVolumeBinding
import org.d3if4018.convertyounit.viewmodel.VolumeViewModel

/**
 * A simple [Fragment] subclass.
 */
class VolumeFragment : Fragment() {
    private lateinit var binding: FragmentVolumeBinding
    private lateinit var viewModel: VolumeViewModel
    val array = arrayOf("ml","l","cm3","m3")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        judulapps()
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_volume, container, false)
        val spinner: Spinner = binding.spinnervolume
        viewModel = ViewModelProvider(this).get(VolumeViewModel::class.java)
        val adapter = ArrayAdapter<String>(
            context!!, R.layout.spinner_item,array
        )
        // Apply the adapter to the spinner
        spinner.adapter = adapter

        binding.button.setOnClickListener{
            if(binding.etInputnilai.text.isEmpty()){
                Toast.makeText(context,"wajib diisi", Toast.LENGTH_SHORT).show()
            }
            else{
                val index = spinner.selectedItemPosition
                if (array[index] == "ml"){
                    //viewModel._milimeter.observe(viewLifecycleOwner, Observer<Double>{
                    viewModel._mililiter.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMl.text = viewModel.mltoml().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvL.text = viewModel.mltol().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvCm3.text = viewModel.mltocm3().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvM3.text = viewModel.mltom3().toString()
                    //viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()
                    //})
                }
                else if(array[index] == "l"){

                    viewModel._liter.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMl.text = viewModel.ltoml().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvL.text = viewModel.ltol().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvCm3.text = viewModel.ltocm3().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvM3.text = viewModel.ltom3().toString()

                }
                else if(array[index] == "cm3"){

                    viewModel._centikubik.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMl.text = viewModel.cm3toml().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvL.text = viewModel.cm3tol().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvCm3.text = viewModel.cm3tocm3().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvM3.text = viewModel.cm3tom3().toString()
                }
                else if(array[index] == "m3"){

                    viewModel._meterkubik.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMl.text = viewModel.m3toml().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvL.text = viewModel.m3tol().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvCm3.text = viewModel.m3tocm3().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvM3.text = viewModel.m3tom3().toString()
                }
            }
        }

        binding.setLifecycleOwner(this)
        return binding.root
    }
    private fun judulapps() {
        val getActivity = activity!! as MainActivity
        getActivity.supportActionBar?.title = "Konverter Volume"
    }
}
