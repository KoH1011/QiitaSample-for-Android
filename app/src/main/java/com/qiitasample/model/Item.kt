package com.qiitasample.model

/**
 * Created by kosuke.takahashi on 2017/11/30.
 */
data class Item(
        val id: Int,
        val uuid: String,
        val title: String,
        val url: String,
        val stocked: Boolean
)