package com.kotlin.springboot.practice.datasource.network.dto

import com.kotlin.springboot.practice.model.Bank

data class BankList(
    val results: Collection<Bank>
)
