package com.qiitasample.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.qiitasample.R
import com.qiitasample.fragment.TopFragment

class TopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
        setContentFragment(R.id.container, TopFragment.newInstance())
    }

    private fun setContentFragment(containerViewId: Int, fragment: Fragment?): Fragment? {
        val f: Fragment? = supportFragmentManager?.findFragmentById(containerViewId)
        f?.let { return@setContentFragment f }
        supportFragmentManager?.beginTransaction()?.add(containerViewId, fragment)?.commit()
        return fragment
    }
}
