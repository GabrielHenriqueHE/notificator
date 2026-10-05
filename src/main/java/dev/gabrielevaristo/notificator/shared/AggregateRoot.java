package dev.gabrielevaristo.notificator.shared;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AggregateRoot<ID> extends Entity<ID> {

    private final List<Event> events = new ArrayList<>();

    protected AggregateRoot(ID id) {
        super(id);
    }

    public void registerEvent(Event event) {
        this.events.add(Objects.requireNonNull(event));
    }

    public List<Event> pullEvents() {
        List<Event> events = List.copyOf(this.events);

        this.events.clear();

        return events;
    }
}
