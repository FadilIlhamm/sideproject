package org.d3if4018.convertyounit.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.d3if4018.convertyounit.MainActivity

import org.d3if4018.convertyounit.R
import org.d3if4018.convertyounit.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        judulapps()
         binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnJarak.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_jarakFragment)
        }
        binding.btnMassa.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_beratFragment)
        }
        binding.btnSuhu.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_suhuFragment)
        }
        binding.btnVolume.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_volumeFragment)
        }
    }
    private fun judulapps() {
        val getActivity = activity!! as MainActivity
        getActivity.supportActionBar?.title = "ConvertYouNits"
    }

}
