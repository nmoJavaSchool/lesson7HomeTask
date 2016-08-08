package ru.sbertech.classloaders;

import ru.sbertech.classloaders.PluginDirect1.FirstPlugin;

/**
 * Created by MВидео on 04.08.2016.
 */
public class PluginManager {
    private final String pluginRootDirectory;

    public PluginManager(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public Plugin load(String pluginName, String pluginClassName) throws Exception {
        Plugin clazz = (Plugin) Main.class.getClassLoader().loadClass(pluginRootDirectory+"."+pluginName+"."+pluginClassName).newInstance();
        return clazz;
    }

}
