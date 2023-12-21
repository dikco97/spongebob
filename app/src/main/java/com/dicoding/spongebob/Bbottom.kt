package com.dicoding.spongebob

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Bbottom(
    val imgBbottom: Int,
    val nameBbottom: String,
    val descBbottom: String
) : Parcelable
