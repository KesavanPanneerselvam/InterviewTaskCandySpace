package com.android.interviewtask.candyspace.model


import com.google.gson.annotations.SerializedName

data class UsersList(
    @SerializedName("has_more")
    val hasMore: Boolean,
    @SerializedName("items")
    val userItems: List<UserItem>,
    @SerializedName("quota_max")
    val quotaMax: Int,
    @SerializedName("quota_remaining")
    val quotaRemaining: Int
)