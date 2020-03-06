package br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.editor;

import br.com.thegabrielfalcao.designpatterns.observer.refactoringguru.publisher.EventManager;

import java.io.File;

// The concrete publisher contains real business logic that's
// interesting for some subscribers. We could derive this class
// from the base publisher, but that isn't always possible in
// real life because the concrete publisher might already be a
// subclass. In this case, you can patch the subscription logic
// in with composition, as we did here.

/**
 * Na classe editor eu tenho um
 */
public class Editor {

    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        }

        throw new Exception("Please open a file first.");
    }
}
