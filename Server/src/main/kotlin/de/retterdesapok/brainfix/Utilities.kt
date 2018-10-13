package de.retterdesapok.brainfix

import java.text.SimpleDateFormat
import java.time.Instant
import java.util.*
import java.time.format.DateTimeFormatter
import java.util.Locale





class Utilities {
    companion object {
        fun getCurrentDateString(): String? {
            val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.UK)
            val formattedDate = sdf.format(Date())
            return formattedDate
        }
    }
}