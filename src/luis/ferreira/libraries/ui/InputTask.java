package luis.ferreira.libraries.ui;

import luis.ferreira.libraries.ui.InputEvent;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class InputTask implements Callable {
    public final String id;
    public final List<Float> values;

    public InputTask(InputEvent event) {
        this.id = event.id;
        this.values = new LinkedList<>(event.getValues());
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
