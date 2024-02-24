package com.example.mvvm.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import kotlinx.coroutines.CoroutineScope

abstract class BaseActivity<BD : ViewDataBinding, ViewModel : BaseViewModel>(val bindingFactory: (LayoutInflater) -> BD) :
    AppCompatActivity(), CoroutineScope {

    protected val binding: BD by lazy { bindingFactory(layoutInflater) }

    protected lateinit var viewModel: ViewModel

    protected abstract fun getViewModelClass(): Class<ViewModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupView()
    }

    open fun setupView() {}
}