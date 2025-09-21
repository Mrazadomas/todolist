package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {

    @Test
    void test() {
        ToDoList list = new ToDoList();
        list.add("Buy eggs");
        assertEquals("Buy eggs", ToDoList.Incomplete.get(0));
        list.complete("Buy eggs");
        assertEquals("Buy eggs", ToDoList.complete.get(0));
        list.clear();
        assertEquals(0, ToDoList.Incomplete.size());
        assertEquals(0, ToDoList.complete.size());
    }
}
