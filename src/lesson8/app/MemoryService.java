package lesson8.app;

import lesson8.exception.EmptyMemoryException;
import lesson8.exception.MemoryOverflowException;

public class MemoryService {

    private final Memory memory = new Memory();

    // ==================== ДОБАВЛЕНИЕ ====================
    public void add(String value) throws MemoryOverflowException {
        if (memory.isFull()) {
            throw new MemoryOverflowException(
                    "Память переполнена! Максимум " + Memory.MAX_SIZE + " элементов.");
        }
        memory.add(value);
    }

    // ==================== ПОЛУЧЕНИЕ С УДАЛЕНИЕМ ====================
    public String get() throws EmptyMemoryException {
        if (memory.isEmpty()) {
            throw new EmptyMemoryException("Память пуста! Нечего возвращать.");
        }
        return memory.poll();
    }

    public int size() {
        return memory.size();
    }

    public Memory getMemory() {
        return memory;
    }
}
