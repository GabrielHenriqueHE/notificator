package dev.gabrielevaristo.notificator.shared;

import java.time.Instant;

public interface Event {

    Instant occurredAt();
}
