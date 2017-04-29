# imagej1-plugin-eclipse
This repo contains a minimal setup for writing ImageJ (1) plugins with the Eclipse IDE.

## Setup
Clone this repository, start **Eclipse** and open this project with ``Open Projects from File System...`` (at the top-level directory).

## Starting ImageJ
The ImageJ runtime can be launched in various ways:
- **Windows**: Execute ``ImageJ.exe`` (by double-clicking in the file).
When ImageJ starts up, it may ask for the ``javaw.exe`` execetutable, typically located in ``C:\Program Files\java\jre1.8xxx\bin\``. In case of problems, simply delete the ``ImagerJ.cfg`` file and start anew.
- **MacOS**: Launch ``ij.jar``.
- **Java**: Run the ``ij.ImageJ.main()`` method within Eclipse.

The entire ImageJ functionality is contained in the single archive ``ij.jar``. To **update** to the most recent version, simply select ``Help`` -> ``Update ImageJ...`` from the ImageJ main menu.

## Adding/editing your plugin code
Code for ImageJ plugins is contained in the ``src-plugins`` directory. Plugins may be contained in Java packages (such as ``my_plugins`` in this example). **Note** that packages with plugins may only be **one level deep**, otherwise ImageJ will not find them! It is recommended to use at least one underscore (``_``) in a plugin name to make ImageJ automatically install the plugin into the ``Plugins`` menu at startup.
