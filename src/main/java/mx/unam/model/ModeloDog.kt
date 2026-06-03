package mx.unam.model

import com.google.gson.annotations.SerializedName

data class ModeloDog(
    @SerializedName("message") val images: List<String>,
)
