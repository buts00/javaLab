# Гра "Переклад слова"

Ця Java-програма є простою грою з перекладом слів, де гравець має перекласти англійські слова на іншу мову. Здоров'я гравця залежить від точності його перекладів, і гра триває, поки здоров'я гравця не досягне нуля або всі слова не будуть правильно перекладені.

## Як грати
1. Запустіть файл `Main.java`, щоб почати гру.
2. Вам буде запропоновано англійське слово.
3. Введіть переклад даного слова, коли буде запитано.
4. Якщо введений переклад відповідає правильному, ваше здоров'я збільшується. Якщо неправильно, ваше здоров'я зменшується.
5. Гра триває, доки ваше здоров'я не досягне нуля або ви успішно не перекладете всі слова.

## Файли в репозиторії
- `Main.java`: Містить головну функцію для початку гри.
- `Word.java`: Визначає клас `Word`, що представляє англійське слово та його переклад.
- `Game.java`: Управляє геймплеєм та взаємодіями між гравцем, словником та словами.
- `Player.java`: Представляє здоров'я гравця та його зміни під час гри.
- `Dictionary.java`: Зберігає колекцію слів та надає випадкові слова для перекладу.

## Приклади слів у словнику

Деякі зі слів, які вже знаходяться у словнику для перекладу:

- `apple`: `яблуко`
- `book`: `книга`
- `house`: `будинок`
- `cat`: `кіт`
- `sun`: `сонце`
- `computer`: `комп'ютер`
- `water`: `вода`
- `innovative`: `іноваційний`
- `sustainable`: `стійкий`
- `significant`: `значний`
- `diversity`: `різноманітність`
- `globalization`: `глобалізація`
- `complexity`: `складність`
- `sophisticated`: `вишуканий`

Ці слова визначаються в класі `Dictionary` та використовуються для гри. Ви можете додати, вилучити або змінити слова та їх переклади, редагуючи код в цьому класі.

## Кастомізація

Гру можна модифікувати, додавши нові слова та їх переклади до словника в класі `Dictionary`. Також можна змінити здоров'я гравця, кількість словникових слів або логіку гри.

## Потреби

Для запуску цієї гри вам потрібно мати встановлену Java на своєму комп'ютері. Запустіть `Main.java` у своєму обраному середовищі розробки, щоб розпочати гру.

## Примітки

Це простий проект, призначений для навчання та розважання. Він може бути поширений, доповнений або модифікований для створення більш складних ігор з більшим функціоналом.

Приємної гри та покращення словникового запасу!

**Зауваження:** Будь ласка, зберігайте оригінальні дані в класах і назвах файлів для правильної роботи програми.
