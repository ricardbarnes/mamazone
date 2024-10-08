package cat.vonblum.mamazone.product

import cat.vonblum.mamazone.shared.domain.bus.event.Event
import java.time.Instant
import java.util.UUID

class ProductCreatedEvent(
    override val aggregateId: Int,
    val name: String,
    val image: Map<String, Any>,
    override val eventId: UUID = UUID.randomUUID(),
    override val occurredOn: Instant = Instant.now()
) : Event