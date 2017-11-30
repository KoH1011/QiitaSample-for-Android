package com.qiitasample.service

import com.qiitasample.model.Item
import retrofit2.http.GET
import rx.Single

/**
 * Created by kosuke.takahashi on 2017/11/30.
 */
interface ItemService {

    @GET("items")
    fun fetchItems(): Single<Item>
}