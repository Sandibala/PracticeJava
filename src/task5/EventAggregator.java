package task5;

import java.util.*;
import java.util.Comparator;

public class EventAggregator {
    public static Map<Long, Map<EventType, List<Event>>> aggregate(List<Event> events) {

        Map<Long, Map<EventType, List<Event>>> result = new HashMap<>();

        events.stream().forEach(event -> {
            result
                    .computeIfAbsent(event.getUserId(), id -> new HashMap<>())
                    .computeIfAbsent(event.getType(), type -> new ArrayList<>())
                    .add(event);
        });

        result.values().stream()
                .flatMap(typeMap -> typeMap.values().stream())
                .forEach(list ->
                        list.sort(Comparator.comparing(Event::getTimestamp))
                );

        return result;
    }
}
