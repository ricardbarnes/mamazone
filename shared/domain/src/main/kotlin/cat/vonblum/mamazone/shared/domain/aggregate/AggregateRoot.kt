package cat.vonblum.mamazone.shared.domain.aggregate

import cat.vonblum.mamazone.shared.domain.bus.event.Event

abstract class AggregateRoot {

    private lateinit var events: MutableList<Event>

    fun pullEvents(): List<Event> = this.events.also { this.events = mutableListOf() }

    fun record(event: Event) {
        this.events.add(event)
    }

}