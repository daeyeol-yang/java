package ch07;

import javax.swing.text.html.HTML;

interface Parseable{
    public abstract void parse(String fileName);
}
class ParcerManager {
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        }else {
            Parseable p =new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable{
    @Override
    public void parse(String fileName) {
        System.out.println("XML parsing");
    }
}

class HTMLParser implements Parseable{
    @Override
    public void parse(String fileName) {
        System.out.println("HTML parsing");
    }
}

public class ParserTest{
    public static void main(String[] args) {
        Parseable parser =ParcerManager.getParser("XML");
        parser.parse("document.xml");
        parser=ParcerManager.getParser("HTML");
        parser.parse("documnet2.html");

    }
}
