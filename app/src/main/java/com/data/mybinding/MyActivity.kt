package com.data.mybinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.data.mybinding.databinding.ActivityMyBinding

class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMyBinding = DataBindingUtil.setContentView<ActivityMyBinding>(this, R.layout.activity_my)

        val myDetailsData = MyDetailsData(name = "Yashika Katyal",
                emailId = "myemailid@gmail.com")
        activityMyBinding.myDetail = myDetailsData
    }
}
