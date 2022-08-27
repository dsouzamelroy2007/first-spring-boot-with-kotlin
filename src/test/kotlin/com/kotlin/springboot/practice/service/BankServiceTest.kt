package com.kotlin.springboot.practice.service

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import com.kotlin.springboot.practice.datasource.BankDataSource

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // when
        bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}