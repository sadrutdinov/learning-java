package pro.chapter6;

public class Stack {
    int stck[] = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке

    void push(int item) {
        if (tos==9) {
            System.out.println("стек заполнен");
        }
        else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из списка
    int pop() {
        if (tos < 0) {
            System.out.println("стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }


}

