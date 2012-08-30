# Variablen und Datentypen
Computerprogramme weisen im Wesentlichen drei relativ unabhängige Komponenten auf: Eingabe, Verarbeitung und Ausgabe. Bis jetzt haben wir uns nur mit der Ausgabe beschäftigt.
Die einfachste Form der Eingabe kennen wir auch schon: Wir setzen Werte im Quelltext. Ein Beispiel dafür ist unser "Hello World"-Proramm, indem wir festlegen das genau "Hello World" und nicht "foobar" ausgeben werden soll.
Um komplexere Eingaben, Verarbeitung und die Ausgabe dieser veränderlichen Daten zu ermöglichen brauchen wir eine Möglichkeit Daten abzuspeichern und zu bearbeiten, die vor dem Programmaufruf noch nicht bekannt sind.
Genau dies erlaubt das Konzept der Variablen. Eine Variable ist ein Platzhalter für einen dieser unbekannten Werte.

Ersetzen wir im "Hello World"-Programm die Zeile
<pre><code>System.out.println("Hello World"); // gibt "Hello World" aus </pre> </code>
durch
<pre><code>String text; // legt eine Variable mit der Bezeichnung text an.
text = "Hello World"; // weist der Variable text den Wert "Hello World" zu.
System.out.println(text); // gibt den Wert der Variablen text aus. </pre> </code>
Erhalten wir ein Programm, dass das selbe tut wie das ursprüngliche "Hello World"-Proramm.
Dieses Programm ist allerding besser als das alte, denn die Ausgabe ist jetzt von der Eingabe (im Quelltext) getrennt.

## Befehle
Wie wir sehen ist das "Hello World"-Programm länger geworden. Um Variablen zu manipulieren braucht man nämlich Befehle. Diese Befehle kann man daran erkennen, dass sie mit einem Semikolon enden. Abgearbeitet werden sie in der Reihenfolge in der man sie liest. Im Quelltext oben stehen drei Befehlsaufrufe:
Die Deklaration einer Variablen, eine Wertzuweisung und ein Funktionsaufruf. Das sind drei der wichtigsten Befehlsarten.

### Deklaration und Definition
Um mit Variablen arbeiten zu können braucht man zwei Schritte: Deklaration und Definition.

"Sei p eine Primzahl" entspricht in etwa dem, was man bei der Deklaration einer Variable tut. Um Werte digital abspeichern zu können muss man Wissen, um was für Daten es sich Handelt. Eine Zahl muss anders abgespeichtert werden, als zum Beispiel eine Zeichenkette wie "Hello World".
Glücklicherweise müssen wir als Programmierer uns keine Gedanken mehr darum machen, wie die Daten intern repräsentiert werden.
Um auszudrücken um was für Daten es sich handelt gibt es sogenannte Datentypen. Eine kleine Auswahl der verfügbaren Typen findest du in der Tabelle.

todo: Tabelle mit Datentypen hier einfügen.

Der Befehl für die Definition einer Variablen sieht so aus: "Typname variablenname;"
Beachtet, das Variablennamen üblicherweise kleingeschrieben werden.

Jetzt kennt der Compiler den Typ der Variablen. 
Damit man auch etwas mit Variablen anfangen kann braucht die Variable noch einen Wert – die Wertzuweisung heißt Definition der Variablen.
Eine Zuweisung sieht so aus: "variablenname = Wert;".
Wichtig ist dabei vor allem eins: Das "=" also der Zuweisungsoperator hat eine (Lese-)Richtung. Der Wert den die Variable bekommt steht immer rechts!
Man kann in einer Zuweisung auch den (alten) Wert der Variable oder den einer anderen Variablen verwenden: "p = 2 * p + q;".

Außerdem gibt es noch zwei Kurzschriebweisen, die oft verwendet werden:
"x += y;" entspricht "x = x + y;" (das funktioniert auch mit "*", "/", "%", "-")
"x++;" enstpricht "x = x + 1;" (genauso funktioniert --)

Definition und Deklaration können auch in einer Anweisung gemacht werden: 'String text = "Hello World";'.
Beachtet, das der Datentyp von Rechter und Linker Seite der Zuweisung übereinstimmen müssen. Es kann allerdings auch sein, dass ihr das gar nicht wollt.
Um den Typ einer variablen zu ändern gibt es sogenannte Casts. Dafür gibt es verschiedene Methoden die vom Datentyp abhängen. Integrale Datentypen wie "int" oder "char" könnt ihr ineinander umwandeln, indem ihr den eingeklammerten Namen des Zieldatentyps vor die Variable schreibt: "char c = (char) intvariable;". Das "(char)" sorgt dann dafür, dass aus der Ganzzahl ein Buchstabe gemacht wird.
Für andere Typänderungen gibt es Funktionen.

### Funktionsaufrufe
Funktionen sind vorgefertigte Unterprogramme, die einen bestimmten Zweck erfüllen. Eine Funktion kennt ihr schon: "System.out.println()".
Diese Funktion tut etwas, und gibt dann die Kontrolle wieder an den nächsten Befehl ab. Es gibt aber auch Funktionen, die einen Wert berechnen.
Diesen Wert nennt man Rückgabewert. Die Funktion "Math.random()" hat als Rückgabewert einen zufälligen Wert.
Wie packt man nun Funktionen in einen Befehl? Interessiert uns der Rückgabewert der Funktion, so benutzen wir die Funktion in einer Zuweisung: "rueckgabewert = funktionxy();"
Interessiert uns der Rückgabewert nicht, so lassen wir die linke Seite der Zuweisung einfach weg: "funktionxy();".
Viele Funktionen, beispielsweise "System.out.println()", sind in der Lage Daten weiterzuverarbeiten. Dafür muss der Funktion allerdings mitgeteilt werden, welche Daten gemeint sind.
Um diese Daten an die Funktion zu übergeben gibt es die Klammern nach dem Funktionsnamen. Dort kann man die entsprechenden Werte eintragen.
Sollen der Funktion mehrere Werte übergeben werden, so müssen diese durch Kommata getrennt werden – die Reihenfolge der Parameter entscheidet dabei darüber, welcher Wert wofür benutzt wird.

## Einlesen von Werten
Um Werte einzulesen braucht man einen Variable vom Typ "Scanner". Weil man damit nicht nur von der Standarteingabe, sondern auch aus Dateien, Netzwerkverbindungen und anderen Quellen Daten einlesen kann, muss man Angeben, dass der Scanner die Daten aus "System.in" beziehen soll.
Danach kann man mit scannervariable.next() die nächste Eingabe abholen. Im Quelltext könnte das zum Beispiel so aussehen:
<pre><code>import java.io.*;
import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello " + name + "!");
	}
}</pre></code>
Damit ist unser "Hello World"-Programm, schon richtig gut, denn es kann nun auf Nutzereingaben reagieren.
