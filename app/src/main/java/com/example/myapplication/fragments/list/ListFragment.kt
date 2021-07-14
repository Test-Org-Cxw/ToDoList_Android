package com.example.myapplication.fragments.list

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R


class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_list, container, false)

        val button = view.findViewById<View>(R.id.floatingActionButton)

        //come back to this later, its suppose to be using View.floatingActionButton - not find view by Id
        button.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        val listLayout = view.findViewById<View>(R.id.listLayout)

        listLayout.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_updateFragment)
        }
        //set Menu
        setHasOptionsMenu(true)


        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater){
        inflater.inflate(R.menu.list_fragment_menu, menu)
    }

}