package de.btm.audience.dto

data class AudienceDTO(
    // Felder für die Datenübertragung
    val id: Long? = null,
    val name: String = "",
    val description: String = "",
    val capacity: Int = 0
) 