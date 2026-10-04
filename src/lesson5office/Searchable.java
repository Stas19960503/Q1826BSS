package lesson5office;

public interface Searchable {

    /**
     * Ищет сотрудника по имени в подчинении директора.
     * Если сотрудник найден — выводит сообщение об этом.
     *
     * @param director директор, в чьём подчинении ищем
     * @param name     имя сотрудника
     */
    void findEmployeeByName(Director director, String name);
}
