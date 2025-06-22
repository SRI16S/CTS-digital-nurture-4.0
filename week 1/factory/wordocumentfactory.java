public class wordocumentfactory extends Documentfactory {

    @Override
    public Document createDocument() {
        return new wordocument();
    }
    
}
