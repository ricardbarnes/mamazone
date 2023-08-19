package cat.vonblum.mamazone.product.event

import cat.vonblum.mamazone.shared.domain.bus.event.Event
import java.time.Instant
import java.util.UUID

class ProductDeactivatedEvent(
    override val aggregateId: Int,
    override val eventId: UUID = UUID.randomUUID(),
    override val occurredOn: Instant = Instant.now()
) : Event