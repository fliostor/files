/**
 * https://sergeyteplyakov.blogspot.com/2014/10/solid.html
 * ------------------------------------------------------------------------------
 *
 * 1. Single Responsibility
 * 2. Open/Closed
 * 3. Liskov Substitution
 * 4. Interface Segregation
 * 5. Dependency Inversion
 *
 * SRP предназначен для борьбы со сложностью;
 * OCP помогает в вопросах расширяемости и параллельной разработки;
 * LSP указывает, как использовать наследование «правильно»;
 * ISP выделяет разные аспекты класса;
 * DIP минимизация зависимостей
 *
 *------------------------------------------------------------------------------
 *
 *   1. Single Responsibility Principle
 *      Принцип единственной ответственности
 *
 *      Класс должен иметь только одну ответсвенность.
 *      Более того, класс должен иметь одну причину для изменения.
 *
 *      Преимущества:
 *        Тестирование - класс с единственной ответсвенностью имеет меньше
 *                       тестовых случаев
 *        Организация - небольшие, хорошо организованные классы легче читать,
 *                      чем монолитные.
 *        Меньшая связанность - меньшая функциональность в одном классе будет
 *                              иметь меньше зависимостей
 *
 *     Короче,
 *     SRP – это способ поиска скрытых абстракций, достаточно сложных,
 *           чтобы им отвели отдельную именованную сущность и спрятали в их
 *           недрах все детали.
 *           
 *           Заключается обычно в декомпозиции сложных классов на простые, 
 *           ответственность которых очень  специализированна.
 *
 *     https://sergeyteplyakov.blogspot.com/2014/08/single-responsibility-principle.html
 *
 *
 *------------------------------------------------------------------------------
 *
 *
 *    2. Open-Closed Principle
 *       Принцип открытости-закрытости
 *
 *       Класс должен быть открыт для расширение и закрыт для изменения.
 *       Таким образом, не внося изменения в существующий код, мы избегаем
 *       появление новых багов.
 *       
 *       Разработанная изначально реализация класса в дальнейшем не 
 *       модофицируется ( разве что исправляются ошибки ), а любые изменения 
 *       производятся через создание нового класса, котрый обычно наследуется
 *       от изначального.
 *       
 *       Открытость для разширения - возможность добавить новое поведение 
 *       если возникает необходимость.
 *       
 *       Закрытость для изменений -  запрет на изменение исходного кода.
 *
 *       https://sergeyteplyakov.blogspot.com/2014/08/open-closed-principle.html
 *
 *
 *------------------------------------------------------------------------------
 *
 *
 *    3. Liskov Substitution Principle
 *       Принцип Барбары Лисков
 *
 *       Если класс Б подтип класса А, мы можем заменить А на Б без изменения
 *       поведения нашей программы.
 *
 *       Должна быть возможность вместо базового типа подставить любой его
 *       подтип.
 *
 *       Принцип подстановки Лисков призван помочь в корректной реализации
 *       наследования, что также должно помочь отказаться от наследования,
 *       если его корректная реализация невозможна.
 *
 *       Должна существовать возможность использовать объекты производного
 *       класса вместо объектов базового класса. Это значит, что объекты
 *       производного класса должны вести себя согласованно, согласно
 *       контракту базового класса.
 *
 *       Наследник класса дополняет, но не заменяет повоедение бащового класса.
 *
 *       https://sergeyteplyakov.blogspot.com/2014/09/liskov-substitution-principle.html
 *
 *
 *------------------------------------------------------------------------------
 *
 *
 *    4. Interface Segregation Principle
 *       Принцип разделения интерфейсов
 *
 *       Большие интерфейсы должны быть разделены на интерфейсы поменьше.
 *       Это позволит нам реализовывать в классах только те методы, которые им
 *       нужны.
 *
 *       Клиенты не должны зависеть от методов, которые они не используют.
 *
 *       https://sergeyteplyakov.blogspot.com/2014/08/interface-segregation-principle.html
 *
 *
 *------------------------------------------------------------------------------
 *
 *
 *    5. Dependency Inversion Principle
 *       Принцип инверсии зависимости.
 *
 *       Вместо того, чтоб модули были связаны на низком уровне, они должны быть
 *       связаны на высоком уровне, то есть должны зависить от абстракции, а не
 *       от реализации.
 *
 *       Суть принципа инверсии зависимостей проста: заменить композицию
 *       агрегацией.
 *
 *       То есть вместо создания зависимостей напрямую, класс должен
 *       требовать их у более высокого уровня через аргументы метода или
 *       конструктора. При этом зависимость должна передаваться не в виде
 *       экземпляров конкретных классов, а в виде интерфейсов или абстрактных
 *       классов.
 *
 *       ! Не путать с DI - Dependency Injection !
 *
 *       https://sergeyteplyakov.blogspot.com/2014/09/the-dependency-inversion-principle.html
 *
 *------------------------------------------------------------------------------
 */