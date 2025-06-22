public class testclass {
    public static void main(String[] args) {
        Documentfactory wordfactory= new wordocumentfactory();
        Document worddoc = wordfactory.createDocument();
        worddoc.open();
        Documentfactory pdffactory = new pdfdocumentfactory();
        Document pdfdoc = pdffactory.createDocument();
        pdfdoc.open();
        Documentfactory excelfactory= new exceldocumentfactory();
        Document exceldoc=excelfactory.createDocument();
        exceldoc.open();
    }
    
}
