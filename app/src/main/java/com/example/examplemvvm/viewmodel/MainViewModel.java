package com.example.examplemvvm.viewmodel;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class MainViewModel extends ViewModel {
    private MutableLiveData<Integer> num = new MutableLiveData<>();

    public MainViewModel() {
        num.setValue(0);
    }

    public MutableLiveData<Integer> getNumber() {
        Log.d("MainViewModel", "getNumber " + num);
        return num;
    }
    public void increase() {
        Log.d("MainViewModel", "increase " + num);
        num.setValue(num.getValue()+1);
    }
    public void decrease() {
        Log.d("MainViewModel", "decrease " + num);
        num.setValue(num.getValue()-1);
    }
}
