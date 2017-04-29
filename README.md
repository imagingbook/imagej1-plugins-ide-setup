# imagej1-plugin-eclipse
This repo contains a minimal setup for writing ImageJ (1) plugins with the Eclipse IDE.

## How to use
Clone this repository, start **Eclipse** and open this project with ``Open Projects from File System...`` (at the top-level directory).

## Starting ImageJ
The ImageJ runtime can be launched in various ways:
- **Windows**: Execute ``ImageJ.exe`` (by double-clicking in the file).
When ImageJ starts up, it may ask for the ``javaw.exe`` execetutable, typically located in ``C:\Program Files\java\jre1.8xxx\bin\``. In case of problems, simply delete the ``ImagerJ.cfg`` file and start anew.
- **MacOS**: Launch ``ij.jar``.
- **Java**: Run the ``ij.ImageJ.main()`` method within Eclipse.

## Updating ImageJ
The entire ImageJ functionality is contained in the single archive ``ij.jar``. To update to the most recent version, simply select
``Help`` -> ``Update ImageJ...`` from the ImageJ main menu.
