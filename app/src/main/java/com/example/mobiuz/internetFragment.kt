package com.example.mobiuz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.Toolbar
import androidx.fragment.app.FragmentManager.findFragment
import androidx.fragment.app.findFragment
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.mobiuz.adapters.RvAdapter
import com.example.mobiuz.models.Data
import kotlinx.android.synthetic.main.fragment_internet.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [internetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class internetFragment : Fragment() {
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
    lateinit var list: ArrayList<Data>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_internet, container, false)
        list = ArrayList()
        list.add(Data("300 MB", "8,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("500 MB", "9,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("1000 MB", "11,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("2000 MB", "17,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("3000 MB", "25,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("5000 MB", "33,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("10000 MB", "50,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("20000 MB", "55,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("30000 MB", "65,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))
        list.add(Data("50000 MB", "75,000 so'm.", "30 kun.", "*171*019*1*010300368*1#."))

        root.rv.adapter = RvAdapter(list)



        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment internetFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            internetFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}