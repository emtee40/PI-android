package dev.sanmer.pi.utils.extensions

import androidx.core.os.LocaleListCompat
import java.util.Locale

fun LocaleListCompat.toList(): List<Locale> = List(size()) { this[it]!! }