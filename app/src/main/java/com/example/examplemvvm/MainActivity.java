package com.example.examplemvvm;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.examplemvvm.databinding.ActivityMainBinding;
import com.example.examplemvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ViewModelProvider.Factory factory = (ViewModelProvider.Factory) ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication());
        ViewModelProvider provider = new ViewModelProvider(this, factory);
        mainViewModel = provider.get(MainViewModel.class);

        binding.setMainViewModel(mainViewModel);
        binding.setLifecycleOwner(this);
    }
}
