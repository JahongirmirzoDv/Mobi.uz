package com.example.mobiuz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.mobiuz.adapters.RvTarifAdapter
import com.example.mobiuz.models.TarifData
import kotlinx.android.synthetic.main.fragment_tarif.*
import kotlinx.android.synthetic.main.fragment_tarif.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TarifFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TarifFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var root: View
    lateinit var tarif_list: ArrayList<TarifData>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_tarif, container, false)

        tarif_list = ArrayList()
        tarif_list.add(TarifData("Yengil", "8,000 so'm.", "80 daq.", "80 MB.", "80 SMS."))
        tarif_list.add(TarifData("omad plus", "8,000 so'm.", "80 daq.", "80 MB.", "80 SMS."))
        tarif_list.add(TarifData("Chilla lite", "8,000 so'm.", "80 daq.", "80 MB.", "80 SMS."))
        tarif_list.add(TarifData("Mobi 20", "8,000 so'm.", "80 daq.", "80 MB.", "80 SMS."))
        tarif_list.add(TarifData("Mobi 25", "8,000 so'm.", "80 daq.", "80 MB.", "80 SMS."))

        val rvTarifAdapter = RvTarifAdapter(tarif_list, requireContext())
        root.rv_tarif.adapter= rvTarifAdapter
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TarifFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TarifFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}