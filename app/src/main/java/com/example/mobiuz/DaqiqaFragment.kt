package com.example.mobiuz

import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobiuz.adapters.RvAdapter
import com.example.mobiuz.models.Data
import kotlinx.android.synthetic.main.fragment_daqiqa.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DaqiqaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DaqiqaFragment : Fragment() {
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
    lateinit var root:View
    lateinit var list:ArrayList<Data>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root =  inflater.inflate(R.layout.fragment_daqiqa, container, false)
        list = ArrayList()
        list.add(Data("60 daq","4,000 so'm.","30 kun.","*171*019*1*010300368*1#."))
        list.add(Data("120 daq","7,000 so'm.","30 kun.","*171*019*1*010300368*1#."))
        list.add(Data("180 daq","10,000 so'm.","30 kun.","*171*019*1*010300368*1#."))
        list.add(Data("300 daq","16,000 so'm.","30 kun.","*171*019*1*010300368*1#."))
        list.add(Data("900 daq","37,000 so'm.","30 kun.","*171*019*1*010300368*1#."))
        list.add(Data("1200 daq","45,000 so'm.","30 kun.","*171*019*1*010300368*1#."))
        list.add(Data("1800 daq","62,000 so'm.","30 kun.","*171*019*1*010300368*1#."))
        val rvAdapter = RvAdapter(list)

        root.rv_daqiqa.adapter = rvAdapter

        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DaqiqaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DaqiqaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}