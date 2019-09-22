package etc.branch;
//Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной
//информации в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени
//доступа. Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
//модули баз В, С; 9455, 8997 — доступен модуль базы С
public class Task33 {
    public static void main(String[] args) {
        int password = 11;
        switch (password) {
            case 9583:
            case 1747: {
                System.out.println("ABC");
                break;
            }
            case 3331:
            case 7922: {
                System.out.println("BC");
                break;
            }
            case 9455:
            case 8997: {
                System.out.println("C");
                break;
            }
            default: {
                System.out.println("access is denied");
            }
        }
    }
}
