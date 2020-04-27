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
import org.d3if4018.convertyounit.databinding.FragmentBeratBinding

import org.d3if4018.convertyounit.viewmodel.BeratViewModel
import org.d3if4018.convertyounit.viewmodel.JarakViewModel

/**
 * A simple [Fragment] subclass.
 */
class BeratFragment : Fragment() {
    private lateinit var binding: FragmentBeratBinding
    private lateinit var viewModel: BeratViewModel
    val array = arrayOf("mg","g","kg","t")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        judulapps()
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_berat, container, false)
        val spinner: Spinner = binding.spinnerberat
        viewModel = ViewModelProvider(this).get(BeratViewModel::class.java)

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
                if (array[index] == "mg"){
                    //viewModel._milimeter.observe(viewLifecycleOwner, Observer<Double>{
                    viewModel._miligram.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMg.text = viewModel.mgtomg().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvG.text = viewModel.mgtog().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKilogram.text = viewModel.mgtokg().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvT.text = viewModel.mgtot().toString()
                    //viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()
                    //})
                }
                else if(array[index] == "g"){

                    viewModel._gram.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMg.text = viewModel.gtomg().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvG.text = viewModel.gtog().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKilogram.text = viewModel.gtokg().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvT.text = viewModel.gtot().toString()

                }
                else if(array[index] == "kg"){

                    viewModel._kilogram.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMg.text = viewModel.kgtomg().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvG.text = viewModel.kgtog().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKilogram.text = viewModel.kgtokg().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvT.text = viewModel.kgtot().toString()
                }
                else if(array[index] == "t"){

                    viewModel._ton.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMg.text = viewModel.ttomg().toString()
                    // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvG.text = viewModel.ttog().toString()
                    // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKilogram.text = viewModel.ttokg().toString()
                    // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvT.text = viewModel.ttot().toString()
                }
            }
        }

        binding.setLifecycleOwner(this)
        return binding.root
    }
        // Inflate the layout for this fragment

    private fun judulapps() {
        val getActivity = activity!! as MainActivity
        getActivity.supportActionBar?.title = "Konverter Massa"
    }

}
