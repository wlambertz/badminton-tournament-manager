package de.btm.organizer.dto

data class OrganizerDTO(
    // Felder für die Datenübertragung
    val id: Long? = null,
    val name: String = "",
    val description: String = "",
    val email: String = "",
    val phone: String = ""
) 