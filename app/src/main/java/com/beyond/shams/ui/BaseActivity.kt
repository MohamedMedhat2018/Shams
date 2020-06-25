package com.beyond.shams.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.beyond.shams.R
import com.beyond.shams.databinding.ActivityBaseBinding
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseActivity : AppCompatActivity() {

    private lateinit var viewModel: BaseViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityBaseBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_base)

        viewModel = ViewModelProviders.of(this).get(BaseViewModel::class.java)


        binding.viewModel = viewModel
        binding.lifecycleOwner = this

    }
}