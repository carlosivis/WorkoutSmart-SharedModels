package dev.carlosivis.workoutsmart.shared

import kotlinx.serialization.Serializable

@Serializable
enum class WorkoutType {
    GYM,
    RUNNING,
    CYCLING,
    SPORTS,
    CROSSFIT,
    OTHER
}

@Serializable
data class WorkoutLogRequest(
    val type: WorkoutType,
    val description: String? = null,
    val durationInSeconds: Long? = null,
)