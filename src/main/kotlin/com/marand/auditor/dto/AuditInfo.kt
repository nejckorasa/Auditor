package com.marand.auditor.dto

import org.hibernate.validator.constraints.NotBlank
import org.jetbrains.annotations.NotNull
import java.util.*

/**
 * @author Nejc Korasa
 */

data class AuditInfo(
        @field:NotBlank var sender: String? = null,
        @field:NotBlank var traceId: String? = null,
        @field:NotBlank var requestId: String? = null,
        @field:NotNull var requestTime: Date? = null,
        var method: String? = null,
        var arguments: Map<String, String>? = null,
        var result: String? = null,
        var executionTime: Long? = null,
        var error: String? = null,
        @field:NotBlank var user: String? = null)
