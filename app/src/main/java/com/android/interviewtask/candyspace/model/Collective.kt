package com.android.interviewtask.candyspace.model


import com.google.gson.annotations.SerializedName

data class Collective(
    @SerializedName("collective")
    val collective: CollectiveX,
    @SerializedName("role")
    val role: String
)