package com.udacity.shoestore

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.udacity.shoestore.databinding.FragmentLoginBinding
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i("Loginfragment","onCreateView")
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        binding.loginButton.setOnClickListener { onLogin() }
        binding.registerButton.setOnClickListener { onRegister() }
        return binding.root

    }

    private fun onLogin(){
        Log.i("LOGINFRAGMENT","ONLOGIN")
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
    }

    private fun onRegister(){
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
    }
}