# Variablen und Datentypen
Computerprogramme weisen im Wesentlichen drei relativ unabhängige Komponenten auf: Eingabe, Verarbeitung und Ausgabe. Bis jetzt haben wir uns nur mit der Ausgabe beschäftigt.
Die einfachste Form der Eingabe kennen wir auch schon: Wir setzen Werte im Quelltext. Ein Beispiel dafür ist unser "Hello World"-Proramm, indem wir festlegen das genau "Hello World" und nicht "foobar" ausgeben werden soll.
Um komplexere Eingaben, Verarbeitung und die Ausgabe dieser veränderlichen Daten zu ermöglichen brauchen wir eine Möglichkeit Daten abzuspeichern und zu bearbeiten, die vor dem Programmaufruf noch nicht bekannt sind.
Genau dies erlaubt das Konzept der Variablen. Eine Variable ist ein Platzhalter für einen dieser unbekannten Werte.

Ersetzen wir im "Hello World"-Programm die Zeile
<pre> <code>System.out.println("Hello World"); // gibt "Hello World" aus </pre> </code>
durch
<pre> <code>String text;
text = "Hello World"; // weist der Variable text den Wert "Hello World" zu.
System.out.println(text); // gibt den Wert der Variablen text aus. </pre> <code>
Erhalten wir ein Programm, dass das selbe tut wie das ursprüngliche "Hello World"-Proramm.
Dieses Programm ist allerding besser als das alte, denn die Ausgabe ist jetzt von der Eingabe (im Quelltext) getrennt.

##Deklaration und Definition
Um mit Variablen arbeiten zu können braucht man zwei Schritte: Deklaration und Definition.
"Sei p eine Primzahl" entspricht in etwa dem, was man bei der Deklaration einer Variable tut. Um Werte digital abspeichern zu können muss man Wissen, um was für Daten es sich Handelt. Eine Zahl muss anders abgespeichtert werden, als zum Beispiel eine Zeichenkette wie "Hello World".
Um auszudrücken um was für Daten es sich handelt gibt es sogenannte Datentypen. Eine kleine Auswahl der verfügbaren Typen findest du in der Tabelle.

todo: Tabelle mit Datentypen hier einfügen.

Der Befehl für die Definition einer Variablen sieht so aus: "Typname variablenname;"
Beachtet, das Variablennamen üblicherweise kleingeschrieben werden und dieser Befehl wie alle anderen auch mit einem Semikolon endet.
