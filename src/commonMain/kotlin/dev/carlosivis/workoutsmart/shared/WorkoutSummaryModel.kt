package dev.carlosivis.workoutsmart.shared

import kotlinx.serialization.Serializable

@Serializable
data class WorkoutSummaryModel(
    val id: Long ,
    val name: String ,
    val description: String ,
)