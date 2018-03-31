package com.example.kojimatakuya.mysamplebinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.kojimatakuya.mysamplebinding.databinding.ActivityMainBinding;
//インターフェースの継承ampleEventHandlers”
public class MainActivity extends AppCompatActivity implements SampleEventHandlers {
    private User mUser = new User("Taro","FFFF");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity_main.xml にバインドを設定した場合、 ActivityMainBindingとなる
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setUser(mUser);//activity_main.xmlのuserにセットされる
        binding.setHandlers(this);
    }

    //xmlの@{handlers.onChangeClick}でonClickイベントを拾う
    @Override
    public void onChangeClick(View view){
        Log.d("Debug","change user name");

        mUser.setName("Takuya");
        mUser.setmidleName("Cloud");

        Log.d("DEBUG", mUser.getName());

    }

}
