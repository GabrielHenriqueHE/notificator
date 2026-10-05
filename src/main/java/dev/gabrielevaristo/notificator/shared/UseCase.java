package dev.gabrielevaristo.notificator.shared;

public interface UseCase<IN, OUT> {

    OUT execute(IN input);
}
