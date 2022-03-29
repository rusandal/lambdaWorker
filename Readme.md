# Работяга (собственные функциональные интерфейсы)
## Описание
Программа реализует собственные интерфесы в классе Worker.
```
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
```
```
@FunctionalInterface
public interface OnTaskErrorListener {
        void onError(String result);
}
```
при вызове метода start()
```
public void start() {
        for (int i = 0; i < 100; i++) {
            if (i==33)
            {
                errorCallback.onError("Task" + i + "is error");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }
    }
```

Выполнение main()
```
Worker.OnTaskDoneListener listener = x -> System.out.println(x);
Worker.OnTaskErrorListener listener1 = x -> System.out.println(x);
Worker worker = new Worker(listener, listener1);
worker.start();
```