# Unixoide

## Wozu sollte man lernen, wie man UNIX – ein veraltetes Betriebssystem - benutzt?
Viele der Grundprinzipien von UNIX sind in heutigen Betriebssystem noch vorhanden und mit einigen dieser Betriebssysteme werdet ihr im laufe eures Studiums noch zu tun haben. Doch was genau sind diese Grundprinzipien die sich in anderen Betriebssystemen wiederfinden lassen?
* 'everything is a file'
* Verzeichnisstruktur
* Arbeiten im Textmodus
* Ressourcenmanagement
* Nutzerverwaltung
* ...

## Verzeichnisstruktur
In Unix wird alles, egal ob es sich um eine Netzwerkschnittstelle, die Festplatte oder eine Musikdatei handelt als Datei repräsentiert. Alle diese Dateien lassen sich im sogenannten 'Verzeichnissbaum' des Betriebssystems finden. Das wohl wichtigste Verzeichnis in UNIX ist'/' – das Wurzelverzeichnis. In diesem Verzeichnis liegen alle anderen Verzeichnisse.
An dieser Stelle lernen wir die ersten beiden Kommandos für das Terminal kennen: 'ls' und 'cd'. Sie sind die wichtigsten Kommandos für die Navigation durch den Verzeichnissbaum von Unix. 'cd' steht für 'change directory' und lässt uns das Verzeichnis wechseln. Gibt man also 'cd /' ins Terminal ein, so wechselt man ins Wurzelverzeichnis. 'ls' steht für 'list search', es liefert eine Auflistung der Dateien im aktuellen Ordner.
Da in Unix alles eine Datei ist, sieht man auch die Unterverzeichnisse des aktuellen Verzeichnisses.
Die Verzeichnisse im Wurzelverzeichnis sind bei den meisten Betriebssystemen (fast) gleich und jedes dieser Verzeichnisse erfüllt die selbe Bedeutung.

* bin – Ausführbare Programme, z.B. die Shell /bin/sh 
* boot - der Betriebssystemkern und was zum hochfahren benötigt wird
* dev - 'Devices' zum Beispiel Festplatten, USB-Geräte, der Zufallszahlengenerator ...
* etc - Konfigurations dateien für das Betriebssystem 
* home - Das Elternverzeichnis aller Nutzerverzeichnisse
* lib - Bibliotheken für andere Programme
* opt - manuell installierte Programme
* proc - Systemressourcen
* root - Das Heimatverzeichnis des 'root'-Nutzers
* sbin - das 'bin' für Programme die nur root ausführen darf
* tmp - Temporäre Dateien
* usr - 'unix system resources' Datein die für alle Nutzer relevant sind
* var - ?

## Arbeiten im Textmodus
Unix stammt aus Zeiten, in denen man einen Rechner mit mehreren 'Terminals' bedient hat. Ist man an so einem Terminal angemeldet, sieht man erstmal die Ausgabe des sog. 'Command Line Interpreters' – /bin/sh. Dieses Programm ist im wesentlichen dafür zuständig, andere Programme aufzurufen. Hinter dem Kommando 'ls' versteckt sich zum Beispiel ein Aufruf des Programms /bin/ls. Außerdem gibt es noch einige zusätzliche Kommandos, zum Beispiel 'help'.
