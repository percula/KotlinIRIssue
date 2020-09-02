package com.example.kotlinirissue

import android.os.Parcelable

import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class UserMessage(val params: @RawValue Array<*>? = null): Parcelable
