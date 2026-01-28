package task5;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Event> events = List.of(
                new Event(1L, EventType.LOGIN, Instant.parse("2024-01-01T10:00:00Z")),
                new Event(1L, EventType.LOGIN, Instant.parse("2024-01-01T09:00:00Z")),
                new Event(1L, EventType.LOGOUT, Instant.parse("2024-01-01T11:00:00Z")),
                new Event(2L, EventType.LOGIN, Instant.parse("2024-01-02T08:00:00Z")),
                new Event(2L, EventType.PURCHASE, Instant.parse("2024-01-02T09:30:00Z"))
        );

        Map<Long, Map<EventType, List<Event>>> result =
                EventAggregator.aggregate(events);

        result.forEach((userId, typeMap) -> {
            System.out.println("User: " + userId);
            typeMap.forEach((type, list) -> {
                System.out.println("  " + type);
                list.forEach(event ->
                        System.out.println("    " + event.getTimestamp())
                );
            });
        });
    }
}