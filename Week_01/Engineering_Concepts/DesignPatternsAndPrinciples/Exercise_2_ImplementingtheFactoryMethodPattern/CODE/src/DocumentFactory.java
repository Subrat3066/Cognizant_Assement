public abstract class DocumentFactory {

    // Factory Method
    public abstract Document createDocument();

    // Optional common operation
    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}