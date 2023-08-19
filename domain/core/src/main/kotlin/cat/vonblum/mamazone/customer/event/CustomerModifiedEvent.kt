package cat.vonblum.mamazone.customer.event

import cat.vonblum.mamazone.shared.domain.bus.event.Event
import java.time.Instant
import java.util.UUID

data class CustomerModifiedEvent(
    override val aggregateId: Int,
    val email: String,
    val name: String,
    val surname: String,
    val address: Map<String, Any>,
    override val eventId: UUID = UUID.randomUUID(),
    override val occurredOn: Instant = Instant.now()
) : Event