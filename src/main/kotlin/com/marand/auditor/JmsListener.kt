package com.marand.auditor

import com.marand.auditor.dto.AuditInfo
import com.marand.auditor.saver.AuditService
import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component


/**
 * @author Nejc Korasa
 */

@Component
class JmsListener(private val auditService: AuditService) {

    @JmsListener(destination = "auditQueue", concurrency = "2-15")
    fun receiveMessage(auditInfo: AuditInfo) = auditService.audit(auditInfo)
}
