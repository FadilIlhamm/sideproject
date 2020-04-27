package org.d3if4018.convertyounit.fragment

import android.R.menu
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_jarak.*
import org.d3if4018.convertyounit.MainActivity
import org.d3if4018.convertyounit.R
import org.d3if4018.convertyounit.databinding.FragmentJarakBinding
import org.d3if4018.convertyounit.viewmodel.JarakViewModel


/**
 * A simple [Fragment] subclass.
 */
class JarakFragment : Fragment() {
    private lateinit var binding: FragmentJarakBinding
    private lateinit var viewModel: JarakViewModel
    val array = arrayOf("mm","cm","dm","m","km")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        judulapps()
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_jarak, container, false)
        val spinner: Spinner = binding.spinnerjarak
        viewModel = ViewModelProvider(this).get(JarakViewModel::class.java)

        val adapter = ArrayAdapter<String>(
            context!!,
            R.layout.spinner_item,array
        )
        // Apply the adapter to the spinner
        spinner.adapter = adapter
        binding.setLifecycleOwner(this)
        binding.button.setOnClickListener{
            if(binding.etInputnilai.text.isEmpty()){
                Toast.makeText(context,"wajib diisi",Toast.LENGTH_SHORT).show()
            }
            else{
                val index = spinner.selectedItemPosition
                if (array[index] == "mm"){
                    //viewModel._milimeter.observe(viewLifecycleOwner, Observer<Double>{
                        viewModel._milimeter.value=binding.etInputnilai.text.toString().toDouble()

                        binding.tvMilimtr.text = viewModel.mmtomm().toString()
                       // viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                        binding.tvCm.text = viewModel.mmtocm().toString()
                       // viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                        binding.tvDm.text = viewModel.mmtodm().toString()
                       // viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                        binding.tvM.text = viewModel.mmtom().toString()
                        //viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()
                        binding.tvKm.text = viewModel.mmtokm().toString()
                    //})
                }
                else if(array[index] == "cm"){

                    viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMilimtr.text = viewModel.cmtomm().toString()

                    //viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvCm.text = viewModel.cmtocm().toString()

                    //viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvDm.text = viewModel.cmtodm().toString()

                    //viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvM.text = viewModel.cmtom().toString()

                    //viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKm.text = viewModel.cmtokm().toString()
                }
                else if(array[index] == "dm"){

                    viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMilimtr.text = viewModel.dmtomm().toString()

                    //viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvCm.text = viewModel.dmtocm().toString()

                    //viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvDm.text = viewModel.dmtodm().toString()

                    //viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvM.text = viewModel.dmtom().toString()

                    //viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKm.text = viewModel.dmtokm().toString()
                }
                else if(array[index] == "m"){

                    viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMilimtr.text = viewModel.mtomm().toString()

                    //viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvCm.text = viewModel.mtocm().toString()

                    //viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvDm.text = viewModel.mtodm().toString()

                    //viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvM.text = viewModel.mtom().toString()

                    //viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKm.text = viewModel.mtokm().toString()
                }
                else if(array[index] == "km"){

                    viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()

                    binding.tvMilimtr.text = viewModel.kmtomm().toString()

                    //viewModel._centimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvCm.text = viewModel.kmtocm().toString()

                    //viewModel._desimeter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvDm.text = viewModel.kmtodm().toString()

                    //viewModel._meter.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvM.text = viewModel.kmtom().toString()

                    //viewModel._kilometer.value=binding.etInputnilai.text.toString().toDouble()
                    binding.tvKm.text = viewModel.kmtokm().toString()
                }
            }
        }


        return binding.root
    }
    private fun judulapps() {
        val getActivity = activity!! as MainActivity
        getActivity.supportActionBar?.title = "Konverter Jarak"
    }


}
