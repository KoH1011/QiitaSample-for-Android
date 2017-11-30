package com.qiitasample.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import com.qiitasample.R
import android.view.View.inflate
import android.view.View
import android.view.ViewGroup

/**
 * Created by kosuke.takahashi on 2017/11/30.
 */
class TopFragment: Fragment() {

        companion object {
        @JvmStatic fun newInstance(): TopFragment {
            return TopFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // return inflate(R.layout.fragment_top, inflater, container)
        return inflate(R.layout.fragment_top, inflater, container)
    }
}