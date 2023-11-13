package ua.edu.ucu.apps;

public class ProxyImage implements MyImage{
    private String filename;
    public ProxyImage(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void display() {
        MyImage myImage = new RealImage(filename);
        myImage.display();
    }
}
