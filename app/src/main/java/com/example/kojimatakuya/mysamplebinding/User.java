package com.example.kojimatakuya.mysamplebinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by kojimatakuya on 2018/03/31.
 */
//BaseObservableを継承して、イベントを通知
public class User extends BaseObservable{

    //public ObservableField<String> name = new ObservableField<>();
    private String name;
    private String midlename;

    public User(String name,String midlename){
        //this.name.set(name);
        this.name = name;
        this.midlename = midlename;
    }

    //activity_mainから[user.name]を取得
    @Bindable
    public String getName() {
        return name;
    }
    //activity_mainから[user.name]を取得
    @Bindable
    public String getMidlename() {
        return midlename;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
        }
    public void setmidleName(String midlename) {
        this.midlename=midlename;
        notifyPropertyChanged(BR.midlename);
    }

}
