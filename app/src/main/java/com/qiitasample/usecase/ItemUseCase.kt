package com.qiitasample.usecase

import com.qiitasample.model.Item
import com.qiitasample.service.ItemService
import rx.Single
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ItemUseCase @Inject constructor(private val itemService: ItemService) {

    fun fetchItems(): Single<Item> = itemService.fetchItems()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
}