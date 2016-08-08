package ru.sbertech.classloaders;

public class Main {

    public static void main(String[] args) {
try{
    PluginManager pm = new PluginManager("ru.sbertech.classloaders");
    Plugin pl = pm.load("PluginDirect1", "FirstPlugin");
    pl.doUsefull();
}
catch(Exception e){
System.out.println(e.getMessage());
}

    }
}
