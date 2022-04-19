package com.android.interviewtask.candyspace.model


import com.google.gson.annotations.SerializedName

data class ExternalLink(
    @SerializedName("link")
    val link: String,
    @SerializedName("type")
    val type: String
)