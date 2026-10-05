package dev.gabrielevaristo.notificator.shared;

import java.util.Objects;

public abstract class Entity<ID> {

    private final ID id;

    protected Entity(ID id) {
        this.id = Objects.requireNonNull(id);
    }

    public ID id() {
        return this.id;
    }
}
