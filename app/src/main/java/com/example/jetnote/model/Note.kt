package com.example.jetnote.model

import org.threeten.bp.LocalDateTime
import java.util.*

data class Note(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val entryDate: LocalDateTime = LocalDateTime.now()

){}
