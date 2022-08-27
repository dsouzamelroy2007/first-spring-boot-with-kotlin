package com.kotlin.springboot.practice.service

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import com.kotlin.springboot.practice.datasource.BankDataSource
import com.kotlin.springboot.practice.model.Bank

@Service
class BankService(@Qualifier("mock") private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)

    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)

    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)

    fun deleteBank(accountNumber: String): Unit = dataSource.deleteBank(accountNumber)
}
