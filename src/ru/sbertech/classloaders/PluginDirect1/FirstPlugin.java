package ru.sbertech.classloaders.PluginDirect1;

import ru.sbertech.classloaders.Plugin;

import java.util.Date;

/**
 * Created by MВидео on 04.08.2016.
 */
public class FirstPlugin implements Plugin {
    @Override
    public void doUsefull() {
        try {
            System.out.println("Текущее время - " + Date.class.newInstance().getTime());
        }
        catch(Exception e){
            System.out.println(e.getMessage());        }
    }
}
