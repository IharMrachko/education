package education.by.training.tasks.first;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        UserGgeneratord user = new UserGenerator();
        User us = new User(1, "Иван", 222, "Пидр");
        Role role = new Role(221, "Иван Сусанин", 21);
        user.generateUsers(8);
        Map<Role, User > map = new HashMap<>();
        map.put(role, us);
        for (Map.Entry<Role, User> pair : map.entrySet())
        {
            Role key = pair.getKey();                      //ключ
            User value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }
}
